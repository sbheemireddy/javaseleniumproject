package org.java.aptitude;

import java.util.Arrays;

public class PalindromeCharArray {

	public static void main(String[] args) {

		char[] orignalName1 ={'d','a','d'};

		char[] orignalName = "abcdvabdcba".toCharArray();
		int length = orignalName.length;
		char[] reverseName=new char[length];

		for(int i=length-1,j=0;i>=0;i--,j++){
			reverseName[j]=orignalName[i];
		}
		System.out.println(reverseName);
		int val =length-1;
		boolean flag=true;
		for(int i =0;i<length/2;i++){
			
			if(orignalName[i] != reverseName[val-i]){
				System.out.println("it is not palindrom");
				 flag=false;
				break;
			}
			System.out.println(i + " - "+ orignalName[i]+" - "+reverseName[i] );
			
		}
		if(flag){
			System.out.println("it is palindrom");
		}
		
		System.out.println(Arrays.equals(orignalName, reverseName));
		
		if('a' != 'a'){
			System.out.println("equal");
		}
		else{
			System.out.println("not equeal");
		}
	}

}
