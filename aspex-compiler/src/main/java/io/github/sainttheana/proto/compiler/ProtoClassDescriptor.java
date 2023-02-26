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
import io.github.sainttheana.proto.compiler.ProtoClassDescriptor;
import java.util.ArrayList;
import java.util.List;

public class ProtoClassDescriptor
{
	public List<ProtoClassDescriptor> inerClasses=new ArrayList<ProtoClassDescriptor>();
	
	public List<String> inerEnums=new ArrayList<String>();
	
	public List<ProtoFieldDescriptor> fields=new ArrayList<ProtoFieldDescriptor>();
	
	public String name;

	public boolean hasInerEnum(String type)
	{
		return inerEnums.contains(type);
	}

	

	public boolean hasInerClass(String type)
	{
		for(ProtoClassDescriptor t:inerClasses){
			if(t.name.equals(type)){
				return true;
			}
		}
		return false;
	}
}
