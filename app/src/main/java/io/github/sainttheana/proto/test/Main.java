package io.github.sainttheana.proto.test;
import io.github.sainttheana.proto.compiler.ProtobufCompiler;

public class Main
{
	public static void main(String[] args){
		System.out.println("hello world");
		new ProtobufCompiler("proto").compile("proto_out");
	}
}
