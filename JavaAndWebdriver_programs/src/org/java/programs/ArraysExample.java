package org.java.programs;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		
		int[] values = new int[5];
		int[] values1 = {10,20,30};
		
		for(int i=(values.length-1),j=0;i>0;i--,j++){
			values[j] = i;
		}
		for(int i=0;i<values.length;i++){
			System.out.println("i value : "+values[i]);
		}
		for(int j=0;j<values1.length;j++){
			System.out.println("j value : "+values1[j]);
		}
		Arrays.sort(values);
		for(int no : values){
			System.out.println("k value : "+no);
		}
		
		
		//binary search
		
		int val = Arrays.binarySearch(values1,10);
		System.out.println("search value : "+val);
	}

}
