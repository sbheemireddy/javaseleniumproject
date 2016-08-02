package org.java.programs;

public class ConstructorProgram {
 int a=4;
	public static void main(String[] args) {

		//Sample2 obj = new Sample2(10);
		new Sample2().smethod1();
		//System.out.println(a);
	}
	public void cMethod1(){
		System.out.println(a);
	}
}

 class Sample1{
	
	static int a=5;
	 Sample1(){
		System.out.println("this is sample1 class constructor --  " + a);
	}
	
	private Sample1(int a){
		System.out.println("this is Sample1 class parameter constructor : "+ a );
	}
	static void method1(){
		System.out.println("this is method1");
	}
}
final class Sample2 extends Sample1{
	int a;
	public Sample2() {
		System.out.println("this is sample2 class constructor");
	}
	private Sample2(int i){
		//super(i);
		a=i;
		System.out.println("this is sample2 class parameter constructor : "+ a);
	}
	void smethod1(){
		
	}
	
}
