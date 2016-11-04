package com.test;

public class StringOperation {

		String str1,str2;
		//Concat(String s1, String s2), getCharacter(int index), getLength()
		public String concat(String str1,String str2)
		{
			this.str1=str1;
			this.str2=str2;
			return str1+""+str2;
		}
		
		public char getCharacter(String s,int index)
		{
			return s.charAt(index);

		}
		public int getLength(String s)
		{
		return s.length();
		}



}
