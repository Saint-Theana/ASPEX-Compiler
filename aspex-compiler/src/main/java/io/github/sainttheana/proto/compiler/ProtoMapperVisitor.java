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
import io.github.sainttheana.proto.compiler.Protobuf3Parser.ProtoContext;
import io.github.sainttheana.proto.compiler.Protobuf3Parser.MessageDefContext;
import io.github.sainttheana.proto.compiler.Protobuf3Parser.EnumDefContext;

public class ProtoMapperVisitor extends Protobuf3BaseVisitor
{

	private ProtoMapper mapper;

	private String fileName;
	
	public ProtoMapperVisitor(ProtoMapper mapper,String fileName){
		this.mapper=mapper;
		this.fileName=fileName;
	}

	@Override
	public Object visitProto(Protobuf3Parser.ProtoContext ctx)
	{
		
		if(ctx.packageStatement()!=null){
			//packege=);
			mapper.registerPackage(fileName,ctx.packageStatement().fullIdent().getText());
		}
		if(ctx.optionStatement().size()>0){
			for (Protobuf3Parser.OptionStatementContext optionStatement:ctx.optionStatement())
			{
				if(optionStatement.optionName().getText().equals("java_package")){
					if(optionStatement.constant().fullIdent()!=null){
						mapper.registerPackage(fileName,optionStatement.constant().fullIdent().getText());
						
					}else if(optionStatement.constant().strLit()!=null){
						String packageName=optionStatement.constant().strLit().getText();
						mapper.registerPackage(fileName,packageName.substring(1,packageName.length()-1));
					}
				}
			}
		}
		
		//if(ctx.topLevelDef().size()!=0){
		for(Protobuf3Parser.TopLevelDefContext top:ctx.topLevelDef()){
				if(top.messageDef()!=null){
					//System.out.println("gggg");
					ProtoClassDescriptor inerClass=visitMessageDef(top.messageDef());
					mapper.registerInerClass(fileName,inerClass);
					//mapper.registerInerClass(fileName,top.messageDef().messageName().getText());
				}else if(top.extendDef()!=null){
					//ignoew all extend for now
					//mapper.registerInerClass(fileName,top.extendDef().messageName().getText());
				}else if(top.enumDef()!=null){
					ProtoEnumDescriptor inerEnum=visitEnumDef(top.enumDef());
					mapper.registerInerEnum(fileName,inerEnum);
					
					//ignoew all enum for now
				}else if(top.serviceDef()!=null){
					//ignoew all service for now
				}
			}
		//}
		return super.visitProto(ctx);
	}

	
	public ProtoClassDescriptor visitMessageDef(Protobuf3Parser.MessageDefContext ctx)
	{
		ProtoClassDescriptor classDescriptor =new ProtoClassDescriptor();
		classDescriptor.name = ctx.messageName().getText();

		for (Protobuf3Parser.MessageElementContext element:ctx.messageBody().messageElement())
		{
			if (element.messageDef() != null)
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
			
		}
		return classDescriptor;
	}

	@Override
	public ProtoEnumDescriptor visitEnumDef(Protobuf3Parser.EnumDefContext ctx)
	{
		ProtoEnumDescriptor protoEnumDescriptor =new ProtoEnumDescriptor();
		protoEnumDescriptor.name = ctx.enumName().getText();
	    return protoEnumDescriptor;
	}
	
	
	
	
	
	
	
}
