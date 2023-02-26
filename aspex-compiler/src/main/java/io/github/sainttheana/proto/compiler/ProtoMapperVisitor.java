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
		//if(ctx.topLevelDef().size()!=0){
		for(Protobuf3Parser.TopLevelDefContext top:ctx.topLevelDef()){
				if(top.messageDef()!=null){
					//System.out.println("gggg");
					mapper.registerInerClass(fileName,top.messageDef().messageName().getText());
				}else if(top.extendDef()!=null){
					//ignoew all extend for now
					//mapper.registerInerClass(fileName,top.extendDef().messageName().getText());
				}else if(top.enumDef()!=null){
					mapper.registerEnumClass(fileName,top.enumDef().enumName().getText());
					//ignoew all enum for now
				}else if(top.serviceDef()!=null){
					//ignoew all service for now
				}
			}
		//}
		return super.visitProto(ctx);
	}
	
}
