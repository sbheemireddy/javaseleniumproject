package org.java.programs;

import java.io.IOException;

public class ExceptionProgram {

	public static void main(String[] args) throws IOException {

		/*try{
		int i=9;
		int j=0;
		i =i/j;
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally{
			System.out.println("this is finally block");
			
		}*/
		
		float a=10.44f;
		System.out.println();
		
		int i=9,j=0;
		i = i/j;
		throw new IOException("Airthmetic");
		
		
		
		
	}

}
