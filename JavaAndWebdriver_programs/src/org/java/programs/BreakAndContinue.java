package org.java.programs;

public class BreakAndContinue {

	public static void main(String[] args) {

		for(int i=0;i<5;i++){
			if(i==4)
			{
				continue;
			}
			System.out.println("i value : "+i);
		}

		Outer:
			for(int i=1;i<5;i++){
				for(int j=1;j<5;j++){
					if(j==3){
						continue Outer;
					}
					System.out.println("j value :"+j);
				}

			}
		
		for(int i=1;i<5;i++){
			if(i==3){
				break;
			}
			System.out.println("k value :"+i);
		}
	}
}
