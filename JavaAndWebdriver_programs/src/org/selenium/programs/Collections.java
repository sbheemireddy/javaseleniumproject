package org.selenium.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Collections {
	public static void main(String[] args){
			
		ArrayList list = new ArrayList();
		list.add("abc");
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		
		HashSet set = new HashSet();
		
		set.add("a");
		set.add("b");
		
		HashMap map = new HashMap();
		
		map.put("a", "1");
		map.put("b","2");
		
		int[] numbers = {10,20,30};
		
		for(int x : numbers){
			
			System.out.println(x);
		}
	}
	public void method1(){
		System.out.println("bcd");
	}
}
interface abc{
	void abcd();
	
}