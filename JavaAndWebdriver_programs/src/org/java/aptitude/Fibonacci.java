package org.java.aptitude;

public class Fibonacci {

	public static void main(String[] args) {
		int n=10,i,a=1,b=1,c=0;
		System.out.print(0 +" " + 1);
		for(i=1;i<=n;i++)
		{
		c=a+b;
		a=b;
		b=c;
		c=a;
		//System.out.println(a+","+b+","+c);
	      System.out.print ("  "+a);
		}
	}
}
