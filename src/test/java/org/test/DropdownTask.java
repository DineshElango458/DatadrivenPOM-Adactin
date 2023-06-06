package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTask {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DINESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");

		WebElement countrylist = driver.findElement(By.xpath("//select[@id='country-list']"));

		Select select = new Select(countrylist);

		List<WebElement> a = select.getOptions();
		Thread.sleep(5000);
		
		System.out.println("SIZEEEEEEEEEEEEEEEEEEE");
		System.out.println(a.size());
		
		/*for (WebElement b : a) {
			String text = b.getText();
			System.out.println(text);

		}
*/		File file = new File("C:\\Users\\DINESH\\eclipse-workspace\\MavenClass\\ExcelHoteldata\\Dropdown.xlsx");

		Workbook w = new XSSFWorkbook();

		Sheet sheet = w.createSheet("Sheet1");

		for (int i = 0; i < a.size(); i++) {
			
			String text = a.get(i).getText();
			Row row = sheet.createRow(i);
			
			Cell cell = row.createCell(0);

			cell.setCellValue(text);

		}
				FileOutputStream out = new FileOutputStream(file);

		w.write(out);

	}

}
