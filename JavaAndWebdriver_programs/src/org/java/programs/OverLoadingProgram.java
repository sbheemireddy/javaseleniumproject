package org.java.programs;

final public class OverLoadingProgram {
public static int aa=0;

	public static void main(String[] args){
		String str = "1234";
		int a = Integer.parseInt(str);
		System.out.println(a);
		
		String str1 = str.valueOf(a);
		System.out.println(str1);
		
	}
	
	public void method1(){
		System.out.println(aa);
		//method2();
		
	}
	public static void method2(){
		System.out.println("this is method2");
		new OverLoadingProgram().method1();
	}
}

