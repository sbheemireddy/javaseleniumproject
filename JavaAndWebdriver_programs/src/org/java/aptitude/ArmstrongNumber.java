package org.java.aptitude;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=371,c=0,a,d;
		d=n;
		while(n>0)
		{
		a=n%10;
		n=n/10;
		c=c+(a*a*a);
		}
		if(d==c)
		System.out.println("armstrong number");
		else
	    System.out.println("it is not an armstrong number");

		System.out.println(12/10);
	}

}
