package org.java.programs;

import java.io.File;

public class ReadFilesInFolder {
	public static void main(String[] args) {

		File folder = new File("D:\\exacly-project\\Data Files");
		File[] paths = folder.listFiles();
		for(File path : paths){
			if(path.isDirectory()){
				System.out.println("Directory : " +path.getName());
				File[] paths1 = path.listFiles();
				for(File path1 : paths1){
					System.out.println("file : "+path1.getName());
				}
			}
		}
	}

}
