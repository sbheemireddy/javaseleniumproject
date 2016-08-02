package org.selenium.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class ReadCSV {

	public static String tableArray[][]=new String[4][4];
	public static void main(String[] args) {

	     try { 
				
	       String csvFile = "E:\\eclipse-SDK-3.4.2-win32\\workspace\\Test\\CSV\\data.csv";

	       //create BufferedReader to read csv file
	       BufferedReader br = new BufferedReader(new FileReader(csvFile));
	       String line = "";
	       StringTokenizer st = null;

	       int lineNumber = 0; 
	       int tokenNumber = 0;
	      
	       //read comma separated file line by line
	       while ((line = br.readLine()) != null) {
	         lineNumber++;

	         //use comma as token separator
	         st = new StringTokenizer(line, ",");
	         
	         while (st.hasMoreTokens()) {
	           tokenNumber++;

	           //display csv values
	           tableArray[lineNumber][tokenNumber]=st.nextToken();
	           System.out.println(st.nextToken());
	           //System.out.println(tableArray[lineNumber][tokenNumber]);
	          //System.out.println(tokenNumber+"--"+st.nextToken());
	           
	         }

	         //System.out.println("--"+lineNumber+"--"+lineNumber);

	         //reset token number
	         tokenNumber = 0;
	       }

	     } catch (Exception e) {
	       System.err.println("CSV file cannot be read : " + e);
	     }
	     
	     for(int i=1;i<=2;i++)
	     {
	    	 for(int j=1;j<=3;j++)
	    	 {
	    		 
	    		 //System.out.println(tableArray[i][j]); 
	    	 }
	     }
	   }


}
