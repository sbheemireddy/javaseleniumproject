package org.java.programs;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class Csv {
	
	public static List<List<String>> readCSV(String sCSVFile ) {
		if(new File(sCSVFile).exists()){
			System.out.println("CSV file ("+sCSVFile+") exists");
		}else{
			System.out.println("CSV file ("+sCSVFile+") doesnot exists in the specified location");
		}
		List<List<String>> csvData = new ArrayList<List<String>>();
		try {
			CSVReader csvReader = new CSVReader(new FileReader(sCSVFile));
			String[] line = null;
			while((line = csvReader.readNext()) != null) {
				List<String> rowData = new ArrayList<String>(10);
				for(int i=0;i<line.length;i++){
					rowData.add(line[i]);
				}
				if(rowData.size()>1){
					csvData.add(rowData);
				}
			}
		}
		catch (IOException e) {
	}
		
		return csvData;
	}

}
