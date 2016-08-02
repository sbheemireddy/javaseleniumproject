package org.java.programs;

public class InnerClassPRogram {

	public static void main(String[] args) {

		Outer_Class obj =new Outer_Class();
		obj.outerPrintMethod();
		
		
	}

}

 class Outer_Class{
	private class Inner_Class{
		void printMethod(){
			System.out.println("this is inner class method");
		}
	}
	void outerPrintMethod(){
		Inner_Class obj = new Inner_Class();
		obj.printMethod();
	}
	
}
