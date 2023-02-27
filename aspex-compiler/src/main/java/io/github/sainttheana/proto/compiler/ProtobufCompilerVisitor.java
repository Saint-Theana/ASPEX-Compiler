/*
 This library is free software; you can redistribute it and/or
 modify it under the terms of the GNU Lesser General Public
 License as published by the Free Software Foundation; either
 version 2.1 of the License, or (at your option) any later version.

 This library is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 Lesser General Public License for more details.

 You should have received a copy of the GNU Lesser General Public
 License along with this library; if not, write to the Free Software
 Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301
 USA

 Please contact Saint-Theana by email the.winter.will.come@gmail.com if you need
 additional information or have any questions
 */
 package io.github.sainttheana.proto.compiler;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import io.github.sainttheana.proto.compiler.Protobuf3Parser.EnumDefContext;
import java.util.Iterator;

public class ProtobufCompilerVisitor extends Protobuf3BaseVisitor<Object>
{
	private String fileName;

	private ProtoMapper mapper;

	private String packageName="";

	private String rootClassName;

	//private ProtoClassDescriptor topLevelClass=null;

	private List<ProtoClassDescriptor> inerClasses=new ArrayList<ProtoClassDescriptor>();


	private List<ProtoEnumDescriptor> inerEnums=new ArrayList<ProtoEnumDescriptor>();

	
	private List<String> importedFiles=new ArrayList<String>();

	public ProtobufCompilerVisitor(ProtoMapper mapper, String fileName)
	{
		this.mapper = mapper;
		this.fileName = fileName;
		rootClassName = fileName.replaceAll(".*/|.proto$", "").replaceAll("\\.","_");
	}

	public void writeToFiles(String outputPath)
	{
		CodeBuilder builder=new CodeBuilder();
		if (!packageName.isEmpty())
		{
			builder.append("package " + packageName + ";");
			builder.append("\n");
		}
		builder.append("import io.github.sainttheana.proto.core.Tag;");
		builder.append("\n");
		builder.append("import java.util.List;");
		builder.append("\n");
		builder.append("import java.util.ArrayList;");
		builder.append("\n");
		
		for (String fileName:importedFiles)
		{
			ProtoDescriptor protoDescriptor =mapper.getProtoDescriptorByFileName(fileName);
			if (protoDescriptor.packageName != null)
			{
				builder.append("import " + packageName +"."+getRootClassName(fileName)+ ".*;");
				builder.append("\n");
				builder.append("import " + packageName + "."+getRootClassName(fileName)+";");
				builder.append("\n");
			}
		}
		builder.append("\n");
		builder.append("public class " + rootClassName + " {");
		builder.append("\n");
		builder.increaseIdent(1);
		for(ProtoEnumDescriptor inerEnum:inerEnums){
			writeEnum(inerEnum,builder);
		}
		for (ProtoClassDescriptor protoClassDescriptor:inerClasses)
		{
			
			if (protoClassDescriptor.name.equals(rootClassName))
			{
				for(ProtoClassDescriptor inerClass:protoClassDescriptor.inerClasses){
					writeClass(inerClass,builder);
				}
				for(ProtoEnumDescriptor inerEnum:protoClassDescriptor.inerEnums){
					writeEnum(inerEnum,builder);
				}
				writeFields(protoClassDescriptor,builder);
			}else
			{
				writeClass(protoClassDescriptor,builder);
			}
			//writeClass(protoClassDescriptor,builder);
		}
		builder.decreaseIdent(1);
		builder.append("}");
		builder.append("\n");
		
		File directory=new File(outputPath+"/"+(!(packageName.isEmpty())?packageName.replaceAll("\\.","/")+"/":""));
		if(!directory.exists()){
			directory.mkdirs();
		}
		File file =new File(directory,rootClassName+".java");
		try
		{
			file.createNewFile();
			Files.write(file.toPath(),builder.toString().getBytes());
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

	private void writeEnum(ProtoEnumDescriptor inerEnum, CodeBuilder builder)
	{
		builder.insertIdent();
		builder.append("public enum " + inerEnum.name + " {");
		builder.increaseIdent(1);
		builder.append("\n");
		Iterator<ProtoEnumFieldDescriptor> it=inerEnum.fields.iterator();
		while(it.hasNext()){
			ProtoEnumFieldDescriptor field=it.next();
			builder.insertIdent();
			builder.append("@Tag(tag="+field.value);
			builder.append(")");
			builder.append(" ");
			builder.append(checkFieldName(field.name));
			builder.append(" ");
			if(it.hasNext()){
				builder.append(",");
			}else{
				builder.append(";");
			}
			builder.append("\n");
		}
		builder.decreaseIdent(1);
		builder.insertIdent();
		builder.append("}");
		builder.append("\n");
		builder.append("\n");
	}

	private void writeClass(ProtoClassDescriptor protoClassDescriptor, CodeBuilder builder)
	{
		builder.insertIdent();
		builder.append("public static class " + protoClassDescriptor.name + " {");
		builder.increaseIdent(1);
		builder.append("\n");
		for(ProtoClassDescriptor inerClass:protoClassDescriptor.inerClasses){
			writeClass(inerClass,builder);
		}
		for(ProtoEnumDescriptor inerEnum:protoClassDescriptor.inerEnums){
			writeEnum(inerEnum,builder);
		}
		writeFields(protoClassDescriptor,builder);
		
		builder.decreaseIdent(1);
		builder.insertIdent();
		builder.append("}");
		builder.append("\n");
		builder.append("\n");
		
	}

	private void writeFields(ProtoClassDescriptor protoClassDescriptor, CodeBuilder builder)
	{
		for (ProtoFieldDescriptor protoFieldDescriptor:protoClassDescriptor.fields)
		{
			builder.insertIdent();
			builder.append("@Tag(tag="+protoFieldDescriptor.tag);
			if(protoFieldDescriptor.isFixed){
				builder.append(",isFixed=true");
			}
			if(protoFieldDescriptor.isSigned){
				builder.append(",isSigned=true");
			}
			if(protoFieldDescriptor.isFloat){
				builder.append(",isFloat=true");
			}
			builder.append(")");
			builder.append(" ");
			builder.append("public");
			builder.append(" ");
			if(protoFieldDescriptor.repeated){
				builder.append("List<"+protoFieldDescriptor.type+">");
				builder.append(" ");
			}else{
				builder.append(protoFieldDescriptor.type);
				builder.append(" ");
			}
			builder.append(checkFieldName(protoFieldDescriptor.name));
			builder.append(" ");
			builder.append("=");
			builder.append(" ");
			if(protoFieldDescriptor.repeated){
				builder.append("new ArrayList<>();");
				builder.append("\n");
			}else{
				builder.append("null;");
				builder.append("\n");
			}
		}
	}

	private String checkFieldName(String name)
	{
		return name.replaceAll("^abstract$","$0_").
		replaceAll("^switch$","$0_")
			.replaceAll("^public$","$0_")
			.replaceAll("^class$","$0_")
			.replaceAll("^void$","$0_")
			.replaceAll("^private$","$0_")
			.replaceAll("^final$","$0_")
			.replaceAll("^interface$","$0_")
			.replaceAll("^String$","$0_")
			.replaceAll("^int$","$0_")
			.replaceAll("^float$","$0_")
			.replaceAll("^double$","$0_")
			.replaceAll("^char$","$0_")
			.replaceAll("^short$","$0_")
			.replaceAll("^byte$","$0_")
			.replaceAll("^package$","$0_")
			.replaceAll("^extends$","$0_")
			.replaceAll("^case$","$0_")
			.replaceAll("^default$","$0_")
			.replaceAll("^throws$","$0_")
			.replaceAll("^throw$","$0_")
			.replaceAll("^try$","$0_")
			.replaceAll("^catch$","$0_")
			.replaceAll("^synchronized$","$0_")
			;
			
	}

	private String getRootClassName(String fileName)
	{
		return fileName.replaceAll(".*/|.proto$","").replaceAll("\\.","_");
	}


	@Override public Object visitProto(Protobuf3Parser.ProtoContext ctx)
	{

		if (ctx.packageStatement() != null)
		{
			packageName = ctx.packageStatement().fullIdent().getText();
		}
		if (ctx.importStatement().size() > 0)
		{
			for (Protobuf3Parser.ImportStatementContext importStatement:ctx.importStatement())
			{
				String importFileName=importStatement.strLit().getText();
				importFileName = importFileName.substring(1, importFileName.length() - 1);
				importedFiles.add(importFileName);
			}
		}
		if (ctx.topLevelDef().size() > 0)
		{
			for (Protobuf3Parser.TopLevelDefContext top:ctx.topLevelDef())
			{
				if (top.messageDef() != null)
				{
					ProtoClassDescriptor inerClass=this.visitMessageDef(top.messageDef());
					inerClasses.add(inerClass);
				}
				else if (top.extendDef() != null)
				{
					//ignoew all extend for now
					//mapper.registerInerClass(fileName,top.extendDef().messageName().getText());
				}
				else if (top.enumDef() != null)
				{
					ProtoEnumDescriptor protoEnumDescriptor = this.visitEnumDef(top.enumDef());
					inerEnums.add(protoEnumDescriptor);
					//ignoew all enum for now
				}
				else if (top.serviceDef() != null)
				{
					//ignoew all service for now
				}
			}
		}
		return null;
	}

	public ProtoEnumDescriptor visitEnumDef(Protobuf3Parser.EnumDefContext ctx)
	{
		ProtoEnumDescriptor protoEnumDescriptor =new ProtoEnumDescriptor();
		protoEnumDescriptor.name = ctx.enumName().getText();
		for (Protobuf3Parser.EnumElementContext element:ctx.enumBody().enumElement())
		{
			if(element.enumField()!=null){
				Protobuf3Parser.EnumFieldContext field=element.enumField();
				ProtoEnumFieldDescriptor protoEnumFieldDescriptor = new ProtoEnumFieldDescriptor();
				protoEnumFieldDescriptor.name=field.ident().getText();
				if(field.MINUS()!=null){
					protoEnumFieldDescriptor.value="-"+field.intLit().getText();
				}else{
				    protoEnumFieldDescriptor.value=field.intLit().getText();
				}
				protoEnumDescriptor.fields.add(protoEnumFieldDescriptor);
			}
		}
		return protoEnumDescriptor;
	}

	
	

	public ProtoClassDescriptor visitMessageDef(Protobuf3Parser.MessageDefContext ctx)
	{
		ProtoClassDescriptor classDescriptor =new ProtoClassDescriptor();
		classDescriptor.name = ctx.messageName().getText();

		for (Protobuf3Parser.MessageElementContext element:ctx.messageBody().messageElement())
		{
		    if (element.field() != null)
			{
				Protobuf3Parser.FieldContext field=element.field();
				ProtoFieldDescriptor protoFieldDescriptor=new ProtoFieldDescriptor();
				if (field.REPEATED() != null)
				{
					protoFieldDescriptor.repeated = true;
				}
				String type=field.type_().getText();

				defineFieldType(classDescriptor, protoFieldDescriptor, type);
				protoFieldDescriptor.tag = field.fieldNumber().getText();
				protoFieldDescriptor.name = field.fieldName().getText();
				classDescriptor.fields.add(protoFieldDescriptor);
			}
			else if (element.optionStatement() != null)
			{
				//ignore
			}
			else if (element.extendDef() != null)
			{
				//ignore
			}
			else if (element.messageDef() != null)
			{
				ProtoClassDescriptor inerClass=visitMessageDef(element.messageDef());
				classDescriptor.inerClasses.add(inerClass);
			}
			else if (element.enumDef() != null)
			{
				ProtoEnumDescriptor inerEnum=visitEnumDef(element.enumDef());
				//classDescriptor.inerClasses.add(inerClass);
				classDescriptor.inerEnums.add(inerEnum);
			}
			else if (element.oneof() != null)
			{
				//其他的不管
				if (element.oneof().oneofField().size() > 0)
				{
					for (Protobuf3Parser.OneofFieldContext oneOfField:element.oneof().oneofField())
					{
						ProtoFieldDescriptor protoFieldDescriptor=new ProtoFieldDescriptor();
						String type=oneOfField.type_().getText();
						defineFieldType(classDescriptor, protoFieldDescriptor, type);
						protoFieldDescriptor.tag = oneOfField.fieldNumber().getText();
						protoFieldDescriptor.name = oneOfField.fieldName().getText();
						classDescriptor.fields.add(protoFieldDescriptor);
					}
				}
			}
			else if (element.mapField() != null)
			{
				ProtoClassDescriptor mapTemplate =new ProtoClassDescriptor();
				mapTemplate.name = "Map_" + element.mapField().mapName().getText();
				ProtoFieldDescriptor key=new ProtoFieldDescriptor();
				key.tag = "1";
				key.name = "key";
				defineFieldType(classDescriptor, key, element.mapField().keyType().getText());
				mapTemplate.fields.add(key);
				ProtoFieldDescriptor value=new ProtoFieldDescriptor();
				value.tag = "2";
				value.name = "value";
				defineFieldType(classDescriptor, value, element.mapField().type_().getText());
				mapTemplate.fields.add(value);
				classDescriptor.inerClasses.add(mapTemplate);
				ProtoFieldDescriptor protoFieldDescriptor=new ProtoFieldDescriptor();
				String type= "Map_" + element.mapField().mapName().getText();
				defineFieldType(classDescriptor, protoFieldDescriptor, type);
				protoFieldDescriptor.tag =  element.mapField().fieldNumber().getText();
				protoFieldDescriptor.repeated=true;
				protoFieldDescriptor.name = element.mapField().mapName().getText();
				classDescriptor.fields.add(protoFieldDescriptor);
			}
		}
		return classDescriptor;
	}

	private void defineFieldType(ProtoClassDescriptor classDescriptor, ProtoFieldDescriptor protoFieldDescriptor, String type)
	{
		switch (type)
		{
			case "int32":{
					protoFieldDescriptor.type = "Integer";
					protoFieldDescriptor.isSigned = true;
				}break;
			case "int64":{
					protoFieldDescriptor.type = "Long";
					protoFieldDescriptor.isSigned = true;
				}break;
			case "uint32":{
					protoFieldDescriptor.type = "Integer";
				}break;
			case "uint64":{
					protoFieldDescriptor.type = "Long";
				}break;
			case "sint32":{
					protoFieldDescriptor.type = "Integer";
					protoFieldDescriptor.isSigned = true;
				}break;
			case "sint64":{
					protoFieldDescriptor.type = "Long";
					protoFieldDescriptor.isSigned = true;
				}break;
			case "fixed32":{
					protoFieldDescriptor.type = "Integer";
					protoFieldDescriptor.isFixed = true;
				}break;
			case "fixed64":{
					protoFieldDescriptor.type = "Long";
					protoFieldDescriptor.isFixed = true;
				}break;
			case "sfixed32":{
					protoFieldDescriptor.type = "Integer";
					protoFieldDescriptor.isFixed = true;
					protoFieldDescriptor.isSigned = true;
				}break;
			case "sfixed64":{
					protoFieldDescriptor.type = "Long";
					protoFieldDescriptor.isFixed = true;
					protoFieldDescriptor.isSigned = true;
				}break;
			case "bool":{
					protoFieldDescriptor.type = "Boolean";
				}break;
			case "string":{
					protoFieldDescriptor.type = "String";
				}break;
			case "double":{
					protoFieldDescriptor.type = "Double";
					protoFieldDescriptor.isFloat = true ;
				}break;
			case "float":{
					protoFieldDescriptor.type = "Float";
					protoFieldDescriptor.isFloat = true ;
				}break;
			case "bytes":{
					protoFieldDescriptor.type = "byte[]";
				}break;
			default:{
				   // System.out.println(type);
					String enumType=mapper.findInAllEnums(fileName, importedFiles, type);
					if (enumType != null)
					{
						//treat it like uint;
						protoFieldDescriptor.type = "Integer";
						break;
					}
					String classType=mapper.findInAllClasses(fileName, importedFiles, type);
					if (classType != null)
					{
						protoFieldDescriptor.type = type;
						break;
					}
					if (classDescriptor.hasInerClass(type))
					{
						protoFieldDescriptor.type = type;
						break;
					}
					if(classDescriptor.hasInerEnum(type)){
						protoFieldDescriptor.type = "Integer";
						break;
					}
					throw new RuntimeException("in file " + fileName + " type " + type + " not found.");
				}
		}
	}




}
