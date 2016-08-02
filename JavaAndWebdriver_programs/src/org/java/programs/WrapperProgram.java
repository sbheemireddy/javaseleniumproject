package org.java.programs;

import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

public class WrapperProgram {
	private static final Set<Class<?>> WRAPPER_TYPES = getWrapperTypes();
	public static void main(String[] args){
		System.out.println(isWrapperType(String.class));
		System.out.println(isWrapperType(Integer.class));
		Bcd obj = new Bcd();
		String s="";
		method1(String.class,Boolean.class);
	}
	public static boolean isWrapperType(Class<?> clazz){
		return WRAPPER_TYPES.contains(clazz);
	}
	private static Set<Class<?>> getWrapperTypes(){
		Set<Class<?>> ret = new HashSet<Class<?>>();
		ret.add(Boolean.class);
		ret.add(Character.class);
		ret.add(Byte.class);
		ret.add(Short.class);
		ret.add(Integer.class);
		ret.add(Long.class);
		ret.add(Float.class);
		ret.add(Double.class);
		ret.add(Void.class);
		ret.add(String.class);
		return ret;
	}
	public static void method1(Class<?> clazz,Object obj){
		if(obj.equals(String.class)){
			System.out.println("it is string");
		}else if(obj.equals(Boolean.class)){
			System.out.println("it is boolean");
		}else if(obj.equals(Float.class)){
			System.out.println("it is float");
		}
		if(clazz.equals(String.class)){
			System.out.println("it is string ");
		}else if(clazz.equals(Boolean.class)){
			System.out.println("it is boolean");
		}else if(clazz.equals(Character.class)){
			System.out.println("it is character");
		}else if(clazz.equals(Double.class)){
			System.out.println("it is double");
		}else if(clazz.equals(Float.class)){
			System.out.println("it is float");
		}else if(clazz.equals(Byte.class)){
			System.out.println("it is byte");
		}else if(clazz.equals(Void.class)){
			System.out.println("it is void");
		}
	}
}
class Abc{
	
}
class Bcd {
	
}
