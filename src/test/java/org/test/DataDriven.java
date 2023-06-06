package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	
	public static void main(String[] args) throws Exception {

		File file = new File("C:\\Users\\DINESH\\eclipse-workspace\\MavenClass\\ExcelSheetPractice\\Sheet1.xlsx");

		FileInputStream Stream = new FileInputStream(file);

		Workbook w = new XSSFWorkbook(Stream);

		Sheet sheet = w.getSheet("Sheet1");

		Row row = sheet.getRow(0);

		Cell cell = row.getCell(0);
		
		String value = cell.getStringCellValue();
		
		if(value.equals("suriya")) {
			cell.setCellValue("Hari");
			
		}
		
		FileOutputStream out = new FileOutputStream(file);
		w.write(out);

		System.out.println(cell);

		int count = sheet.getPhysicalNumberOfRows();
		System.out.println(count);

	//	Row row1 = sheet.getRow(3);

		int cellcount = row.getPhysicalNumberOfCells();
		System.out.println(cellcount);

		/*for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
			Cell cell1 = row.getCell(i);
			System.out.println(cell1);
		}

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

			Row row2 = sheet.getRow(i);

			for (int j = 0; j < args.length; j++) {
				Cell cell2 = row.getCell(i);
				System.out.println(j);
			}
*/
		
		
		DataDriven a = new  DataDriven();
		a.sample();
		a.sam();
		
		
	}
		
	public void sample() throws Exception {
	BaseClass b = new BaseClass();
	b.updatedata("Sheet1", 1, 1, "1", "Hari");
	
	}
	
		
		public void sam() throws Exception {
		BaseClass b = new BaseClass();
		b.writecelldata("Sheet1", 3, 2, "dinesh");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

	


