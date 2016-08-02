package org.java.programs;

public class TryCatchExample {

	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(3000L);
		System.out.println(method1());
	}
	public static int method1(){
	try{
		System.out.println("i am in try");
		int i=5/0;
		return 3;
		}catch(Exception e){
			System.out.println("i am in catch");
			return 4;
		}finally{
			System.out.println("i am in finally");
		}
		//return 3;
	}
}
