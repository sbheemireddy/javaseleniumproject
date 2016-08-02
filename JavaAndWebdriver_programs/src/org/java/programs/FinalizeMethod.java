package org.java.programs;

public class FinalizeMethod {

	public static void main(String[] args) {

		System.out.println("this is main method");
	}

	FinalizeMethod fm = new FinalizeMethod();
	protected void finalize(){
		System.out.println("this is finalize method");
	}
}
