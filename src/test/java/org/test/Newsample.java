package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Newsample {

	public static void main(String[] args) throws IOException {
		
	
			File file = new File("C:\\Users\\DINESH\\eclipse-workspace\\MavenClass\\Excelnew\\Hari.xlsx");
		FileInputStream f = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(f); 
			Sheet sheet = workbook.getSheet("Sheet1");
			//Thread.sleep(3000);
            Row row = sheet.getRow(4);
			Cell cell = row.createCell(3);
			cell.setCellValue("Dinesh");

			FileOutputStream out = new FileOutputStream(file);
			workbook.write(out);

	
	
	}
}
