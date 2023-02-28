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
import java.nio.file.Files;
import java.nio.file.FileVisitor;
import java.nio.file.FileVisitResult;
import java.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;
import java.nio.file.Path;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import io.github.sainttheana.proto.compiler.Protobuf3Parser.ProtoContext;

public class ProtobufCompiler
{
	private String rootPath;
	//1.map所有目录下的proto文件
	//生成一个map，包含所有的proto对象
	//2.编译
	private ProtoMapper mapper=new ProtoMapper();
	public ProtobufCompiler(String rootPath){
		this.rootPath=rootPath;
	}
	
	public void compile(final String outputPath){
		generateMap();
		File file=new File(rootPath);
		try
		{
			Files.walkFileTree(file.toPath(), new FileVisitor<Path>(){
					@Override
					public FileVisitResult preVisitDirectory(Path p1, BasicFileAttributes p2) throws IOException
					{
						return FileVisitResult.CONTINUE;
					}

					@Override
					public FileVisitResult visitFile(Path p1, BasicFileAttributes p2) throws IOException
					{
						File protoFile=p1.toFile();
						if(protoFile.getName().endsWith(".proto")){
							String fileName=protoFile.getAbsolutePath().replaceAll(rootPath+"/","");
							//System.out.println(fileName);
							//mapper.registerProto(fileName);
							ANTLRFileStream input=new ANTLRFileStream(protoFile.getAbsolutePath());
						    Protobuf3Lexer lexer=new Protobuf3Lexer(input);
							CommonTokenStream stream =new CommonTokenStream(lexer);
							Protobuf3Parser.ProtoContext proto=new Protobuf3Parser(stream).proto();
							ProtobufCompilerVisitor visitor=new ProtobufCompilerVisitor(mapper,fileName);
							visitor.visit(proto);
							visitor.writeToFiles(outputPath);
						}
						return FileVisitResult.CONTINUE;
					}

					@Override
					public FileVisitResult visitFileFailed(Path p1, IOException p2) throws IOException
					{
						return FileVisitResult.CONTINUE;
					}

					@Override
					public FileVisitResult postVisitDirectory(Path p1, IOException p2) throws IOException
					{
						return FileVisitResult.CONTINUE;
					}
				});
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	private void generateMap()
	{
		File file=new File(rootPath);
		try
		{
			Files.walkFileTree(file.toPath(), new FileVisitor<Path>(){
					@Override
					public FileVisitResult preVisitDirectory(Path p1, BasicFileAttributes p2) throws IOException
					{
						return FileVisitResult.CONTINUE;
					}

					@Override
					public FileVisitResult visitFile(Path p1, BasicFileAttributes p2) throws IOException
					{
						File protoFile=p1.toFile();
						
						if(protoFile.getName().endsWith(".proto")){
							//System.out.println(protoFile);
							String fileName=protoFile.getAbsolutePath().replaceAll(rootPath+"/","");
							mapper.registerProto(fileName);
							ANTLRFileStream input=new ANTLRFileStream(protoFile.getAbsolutePath());
						    Protobuf3Lexer lexer=new Protobuf3Lexer(input);
							CommonTokenStream stream =new CommonTokenStream(lexer);
							Protobuf3Parser.ProtoContext proto=new Protobuf3Parser(stream).proto();
							new ProtoMapperVisitor(mapper,fileName).visitProto(proto);
						}
						return FileVisitResult.CONTINUE;
					}

					@Override
					public FileVisitResult visitFileFailed(Path p1, IOException p2) throws IOException
					{
						return FileVisitResult.CONTINUE;
					}

					@Override
					public FileVisitResult postVisitDirectory(Path p1, IOException p2) throws IOException
					{
						return FileVisitResult.CONTINUE;
					}
				});
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
