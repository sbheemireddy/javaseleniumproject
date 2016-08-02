package org.java.programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSheetReadWrite {
	public static void main(String[] args) throws IOException {
		File file = new File("C:/SeleniumPrograms/files/Book1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		Iterator<Row> row = sheet.iterator();
		while(row.hasNext()){
			Row rowNext = row.next();
			Iterator<Cell> cell = rowNext.iterator();
			while(cell.hasNext()){
				Cell cellNext = cell.next();
				switch(cellNext.getCellType()){
				case Cell.CELL_TYPE_STRING :
					System.out.print(cellNext.getStringCellValue());
					break;
				case Cell.CELL_TYPE_BOOLEAN :
					System.out.print(cellNext.getBooleanCellValue());
					break;
				case Cell.CELL_TYPE_NUMERIC :
					System.out.print(cellNext.getNumericCellValue());
					break;
				}
				System.out.print("  ");
			}
			System.out.println();
		}
		
		
    }
}
