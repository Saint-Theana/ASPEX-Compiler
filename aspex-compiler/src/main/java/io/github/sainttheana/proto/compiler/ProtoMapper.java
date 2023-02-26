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
import java.util.HashMap;
import java.util.List;

public class ProtoMapper
{
	public final HashMap<String,ProtoDescriptor> protoMap;
	
	public ProtoMapper(){
		protoMap=new HashMap<String,ProtoDescriptor>();
	}

	public ProtoDescriptor getProtoDescriptorByFileName(String fileName)
	{
		return protoMap.get(fileName);
	}

	public String findAllClass(String fileName, List<String> importedFiles, String type)
	{
		for(String inerClasses:protoMap.get(fileName).inerClasses){
			if(inerClasses.equals(type)){
				return type;
			}
		}
		for(String file:importedFiles){
			for(String inerClasses:protoMap.get(file).inerClasses){
				if(inerClasses.equals(type)){
					return type;
				}
			}
		}
		return null;
	}

	public String findAllEnum(String fileName, List<String> importedFiles, String type)
	{
		for(String enumClass:protoMap.get(fileName).enumClasses){
			if(enumClass.equals(type)){
				return type;
			}
		}
		for(String file:importedFiles){
			//System.out.println(file);
			for(String enumClass:protoMap.get(file).enumClasses){
				//System.out.println("fff "+enumClass);
				if(enumClass.equals(type)){
					return type;
				}
			}
		}
		return null;
	}

	public void registerEnumClass(String fileName, String enumClassName)
	{
		//System.out.println(enumClassName);
		if(protoMap.containsKey(fileName)){
			protoMap.get(fileName).enumClasses.add(enumClassName);
		}else{
			throw new RuntimeException("proto file "+fileName+" not registered");
		}
	}

	public void registerPackage(String fileName, String packageName)
	{
		if(protoMap.containsKey(fileName)){
			protoMap.get(fileName).packageName=packageName;
		}else{
			throw new RuntimeException("proto file "+fileName+" not registered");
		}
	}
	
	public void registerInerClass(String fileName,String inerClassName){
		if(protoMap.containsKey(fileName)){
			protoMap.get(fileName).inerClasses.add(inerClassName);
		}else{
			throw new RuntimeException("proto file "+fileName+" not registered");
		}
	}
	
	
	
	public void registerProto(String fileName){
		ProtoDescriptor desc=new ProtoDescriptor();
		desc.fileName=fileName;
		//desc.packageName=packageName;
		protoMap.put(fileName,desc);
	}
}
