package org.java.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class IOProgram {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("test.txt",true);
		fw.write("hello world");
		fw.write(" hi");
		fw.close();
		
		
		FileReader fr = new FileReader("test.txt");
		int i;
		while((i=fr.read()) != -1){
			//System.out.print((char)i);
		}
		fr.close();
		fr = new FileReader("test1.txt");
		BufferedReader bufRed = new BufferedReader(fr);
		ArrayList<ArrayList<String >> csvData = new ArrayList<ArrayList<String>>();
		
		String str =null;
		while((str =bufRed.readLine()) != null){
			ArrayList<String> row = new ArrayList<String>();
			String[] rowData = str.split(",");
			for(String value : rowData){
				row.add(value.trim());
			}
			csvData.add(row);
		}
		
		for(ArrayList al : csvData){
			System.out.println(al);
			
		}
		
	}

}
