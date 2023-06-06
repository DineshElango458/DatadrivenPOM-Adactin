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

public class NewDatadriven {
	
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\DINESH\\eclipse-workspace\\MavenClass\\NewExcel\\Datadriven.xlsx");
		
		FileInputStream ff = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(ff);
		
		Sheet s = w.getSheet("Credentials");
		
		Row r = s.getRow(5);
		
		Cell c = r.getCell(1);
		
		String value = c.getStringCellValue();
		
      	System.out.println(value);
		
	/*	if(value.equals("DineshHari")){
			c.setCellValue("DineshLoveHari");
		}
	*/	
		FileOutputStream out = new FileOutputStream(f);
		w.write(out);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
