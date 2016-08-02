package org.java.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVFileReadWrite {
	public static void main(String[] args) throws IOException {
		csvReadWrite();
	}
	
	public static void csvReadWrite() throws IOException{
		File file = new File("C:/SeleniumPrograms/files/temp.csv");
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line  = "";
		String split = ",";
		while((line = br.readLine()) != null){
			String[] row = line.split(split);
			System.out.println(row[0]+"  "+row[1]);
		}
	}

}
