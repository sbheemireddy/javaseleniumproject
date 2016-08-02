package org.java.aptitude;

public class PalindromeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=2345432;
		   int  n=a,b=a,rev=0;
		   while(n>0)
		   {
		     a=n%10;
		     rev=rev*10+a;
		     n=n/10;
		     System.out.println(rev);
		   }
		  
		   if(rev==b)
		   System.out.println("it is Palindrome");
		   else
		   System.out.println("it is not palinedrome");

	}

}
