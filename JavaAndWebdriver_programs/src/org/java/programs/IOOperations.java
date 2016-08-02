package org.java.programs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOOperations {
	public static void main(String[] args) throws IOException {
		fileReadWrite();

	}

	public static void copyFile() throws IOException{
		String projectPath = new File("").getAbsolutePath();
		String inputPath = projectPath.concat("/files/input.txt");
		String outputPath = projectPath.concat("\\files\\output.txt");
		FileInputStream in = null;
		FileOutputStream out = null;
		try{
			in = new FileInputStream(inputPath);
			out = new FileOutputStream(outputPath);

			int c;
			while((c = in.read()) != -1){
				out.write(c);
			}
		}finally{
			if(in != null)
				in.close();
			if(out !=null)
				out.close();

		}

	}

	public static void directoryReadWrite(){
		File file = new File("C:/SeleniumPrograms/files/temp.txt");
		System.out.println(file.exists());
		file.mkdir();
		//		file.delete();

		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.getParentFile());

	}

	public static void fileReadWrite() throws IOException{

		File file = new File("C:/SeleniumPrograms/files/temp.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		bw.write("abc");
		bw.close();

		BufferedReader br = new BufferedReader(new FileReader(file));

		System.out.println(br.toString());


	}

}
