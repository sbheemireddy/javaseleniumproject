package org.java.aptitude;

public class PrimeNumber {

	public static void main(String[] args) {

		int flag=0,m=0;
		
		int number = 20;
		
		m=number/2;
		for(int i=2;i<=m;i++){
			if((number%i)==0){
				System.out.println("it is not prime number  " + i);
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.println("it is prime number");
		}
	}

}
