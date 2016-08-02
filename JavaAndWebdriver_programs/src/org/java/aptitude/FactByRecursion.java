package org.java.aptitude;

public class FactByRecursion {

	public static void main(String[] args) {
		int f=fact(5);
		System.out.println(f);
		
		for(int i=1;i<2;++i){
			System.out.println(i);
		}

	}
	static int fact(int n){
		if(n==1)
		return 1;

		return n*=fact(n-1);
		}
}
