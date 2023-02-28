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

public class CodeBuilder {
	private StringBuilder sb;

	private int ident;

	public CodeBuilder() {
		sb = new StringBuilder();
		ident = 0;
	}

	public void replace(String p0, String p1)
	{
		String tmp=sb.toString().replace(p0,p1);
		sb=new StringBuilder();
		sb.append(tmp);
	}

	public void newLine() {
		sb.append("\n");
	}

	public int ident() {
		return ident;
	}

	public void append(String p0) {
		sb.append(p0);
	}


	public void increaseIdent(int ident) {
		this.ident += ident;
	}

	public void decreaseIdent(int ident) {
		this.ident -= ident;
	}

	public void insertIdent() {
		sb.append(createIdent(ident));
	}

	public void deleteIdent(int count) {
		sb.delete(sb.length() - count * 4, sb.length());
	}

	@Override
	public String toString() {
		return sb.toString();
	}


	private String createIdent(int count) {
		//System.out.println(count);
		String g = "";
		int i = 0;
		while (i < count) {
			g += "    ";
			i += 1;
		}
		return g;
	}
}
