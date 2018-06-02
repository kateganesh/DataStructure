package com.ganesh.ds.arrayAndString;

public class RemoveCharacterFromString {

	public static void main(String[] args) {
		
		String str = "How are you, I am fine";
		char c = ' ';
		
		String s = removeChar(str, c);
		System.out.println("New String : "+s);
		
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = new String("Hello");
		s3.intern();
		System.out.println("sf == : "+s1==s2);
		System.out.println("equals : "+s1.equals(s2));
		System.out.println("intern : "+s2==s3);
		

	}
	
	public static String removeChar(String str, char c) {
		
		return str.replaceAll(Character.toString(c), "");
	}

}
