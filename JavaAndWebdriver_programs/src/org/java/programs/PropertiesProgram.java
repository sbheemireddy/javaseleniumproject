package org.java.programs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;

public class PropertiesProgram {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("test.properties");
		Properties pro = new Properties();
		pro.load(fr);
		pro.setProperty("Telangana", "Hyderabad");
		pro.setProperty("andhrapradesh", "Amaravathi");
		FileWriter fw = new FileWriter("test.properties");
		pro.store(fw, "  ");
		
		System.out.println(pro.getProperty("Telangana"));
		
	}
	
	
	
	

}
