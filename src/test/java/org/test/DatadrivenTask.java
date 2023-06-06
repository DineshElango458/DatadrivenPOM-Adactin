package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatadrivenTask {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\DINESH\\eclipse-workspace\\MavenClass\\ExcelHoteldata\\HOTEL DATA.xlsx");

		FileInputStream Stream = new FileInputStream(file);

		Workbook w = new XSSFWorkbook(Stream);

		Sheet sheet = w.getSheet("Sheet1");

		Row row = sheet.getRow(1);

	//	Cell cell = row.getCell(5);

		
	//	System.out.println(cell);
		
		
		
		
		

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row a = sheet.getRow(i);

		
		
			for (int j = 0; j < a.getPhysicalNumberOfCells(); j++) {

				Cell c = a.getCell(j);
				System.out.println(c);
			


                CellType type = c.getCellType();
                System.out.println(type);
				switch (type) {
				case STRING:

					String name = c.getStringCellValue();
					System.out.println(name);
					break;

				case NUMERIC:

					if (DateUtil.isCellDateFormatted(c)) {

						Date dateCellValue = c.getDateCellValue();
						SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
						String format = dateFormat.format(dateCellValue);
					System.out.println(format);

					} else {
						double d = c.getNumericCellValue();
						BigDecimal b = BigDecimal.valueOf(d);
						String num = b.toString();
						System.out.println(num);

					}
				default:
					break;

		}
			}

			}
		
	}}

