package org.java.programs;

public class StringMethods {

	public static void main(String[] args) {

		String str = "hello";
		
		//string length
		System.out.println(str.length());
		
		//Concatenating string
		str = str.concat(" world");
		System.out.println(str);
		
		//Convert string to char array
		
		str ="hello  world";
		char stringArray[] = str.toCharArray();
		for(int index = 0 ; index < stringArray.length ; index++){
			System.out.print(stringArray[index]);
		}
		
		//
	}

}
