package org.java.programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class ExcelFileRead {
	
	@Test(dataProvider = "data")
	public void testcase1(String value1,String value2){
		System.out.println(value1+":"+value2);
	}
	
	@DataProvider(name="data")
	public Object[][] readExcelFile() throws IOException{
		Object data[][]=new Object[2][2];
		File file = new File("C:\\workspace\\JavaAndWebdriver_programs\\xlsx\\demoSteps.xlsx");
		Workbook workbook = new XSSFWorkbook(new FileInputStream(file));
		Sheet firstSheet = workbook.getSheetAt(0);
		Iterator<Row> rows = firstSheet.iterator();
		int i=0;
		while(rows.hasNext()){
			Row nextRow = rows.next();
			Iterator<Cell> cells = nextRow.cellIterator();
			int j = 0;
			while(cells.hasNext()){
				Cell cell = cells.next();
				
				switch(cell.getCellType())
				{
				case Cell.CELL_TYPE_STRING:
					data[i][j]=String.valueOf(cell.getRichStringCellValue());
					break;
				case Cell.CELL_TYPE_NUMERIC:
					data[i][j] = String.valueOf((int)cell.getNumericCellValue());
				}
				j++;
			}
			i++;
		}
		return data;
		
	}

}
