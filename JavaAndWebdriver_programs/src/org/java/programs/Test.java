package org.java.programs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test {

	public static void main(String[] args) throws IOException {

		System.out.println("hello world");
		FileReader fr = new FileReader("C:\\work\\info.properties");
		Properties pro = new Properties();
		pro.load(fr);
		System.out.println(pro.getProperty("browser"));
		
	}

}
