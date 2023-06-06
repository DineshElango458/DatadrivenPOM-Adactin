
package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import javax.lang.model.element.Element;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Argument;

public class BaseClass {
	public static WebDriver driver;
	

	public static void getdriver() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void geturl(String url) {
		driver.get(url);
	}

	public static void maximizewindow() {
}

	public void elementsendkeys(WebElement element, String data) {

		element.sendKeys(data);
	}

	public void elementsendkeysjs(WebElement element,String data) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].setAttribute('value','"+ data +"')",element);
	}

	public void elementclick(WebElement element) {
		element.click();

	}

	public WebElement findlocatorbyid(String attributevalue) {
		WebElement element = driver.findElement(By.id(attributevalue));
		return element;
	}

	public WebElement findlocatorbyname(String attributevalue) {
		WebElement element = driver.findElement(By.name(attributevalue));
		return element;
	}

	public WebElement findlocatorbyclassname(String attributevalue) {
		WebElement element = driver.findElement(By.className(attributevalue));
		return element;
	}

	public WebElement findlocatorbyxpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;

	}

	public String gettitle() {
		String title = driver.getTitle();
		return title;

	}

	public String getapplnurl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	public void closewindow() {
		driver.close();

	}

	public void allwindow() {
		driver.quit();
	}

	public String elementgettext(WebElement element) {
		String text = element.getText();
		return text;
	}

	public void selectoptionbytext(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);

	}

	public void selectoptionby(WebElement element, int Index) {
		Select select = new Select(element);
		select.selectByIndex(Index);

	}

	public String elementgetattributevalue2(WebElement element, String attributename) {
		String attribute = element.getAttribute(attributename);
		return attribute;

	}

	public String elementgetattributevalue(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;

	}

	public Set<String> getallwindows() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}

	public String getparentwindow() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;

	}

	public void deselecttext(WebElement element, String attributevalue) {
		Select select = new Select(element);
		select.deselectByVisibleText(attributevalue);
	}

	public void deselectbyall(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	public boolean ismultipe(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;

	}
	
	public void alertok() {
		driver.switchTo().alert().accept();

	}

	
  

	public List<WebElement> getalloptions(WebElement element) {

		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		return options;

		
	}
	
	public File Screenshot(String location) throws IOException {
		TakesScreenshot screenshot =(TakesScreenshot) driver;
     File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
         File f = new File(location);
         FileUtils.copyFile(screenshotAs, f);
		return f;
	}

	/*	private void impicitwait() {
			driver.manage().timeouts().implicitlyWait(arg0, arg1)

		}
	 */	

	

	public String getdatafromexcel(String sheetname,int rownum,int cellnum) throws Exception{
		String res = " ";
		File file = new File ("C:\\Users\\DINESH\\eclipse-workspace\\MavenClass\\ExcelHoteldata\\HOTEL DATA.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType type = cell.getCellType();
		switch(type) {
		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted (cell)) {
				java.util.Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
				res = dateformat.format(dateCellValue);
			}
			
			else {
				double numericCellValue = cell.getNumericCellValue();
				long check = Math.round(numericCellValue);
				if (numericCellValue == check) {
					res=String.valueOf(check);
				}else {
					res = String.valueOf(numericCellValue);
				}		
			}
		default:
			break;	 

		}
		return res;
	}

	public void updatedata(String sheetname,int rownum,int cellnum, String olddata,String newdata) throws Exception{
		File file = new File("C:\\Users\\DINESH\\eclipse-workspace\\MavenClass\\ExcelHoteldata\\HOTEL DATA.xlsx");
		FileInputStream f = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(f); 
		Sheet sheet = workbook.getSheet(sheetname);

		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);

		String value = cell.getStringCellValue();
		if (value.equals(olddata)) {
			cell.setCellValue(newdata);
		}


		FileOutputStream out = new FileOutputStream(file);

		workbook.write(out);
		
	}

	public void writecelldata(String sheetname,int rownum,int cellnum, String data) throws Exception{
		File file = new File("C:\\Users\\DINESH\\eclipse-workspace\\MavenClass\\ExcelHoteldata\\HOTEL DATA.xlsx");
		FileInputStream f = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(f); 
		Sheet sheet = workbook.getSheet(sheetname);

		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(data);

		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);








	}
	
	public void outputstream() throws IOException {
		File file = new File("C:\\Users\\DINESH\\eclipse-workspace\\MavenClass\\ExcelHoteldata\\HOTEL DATA.xlsx");
		FileInputStream f = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(f); 
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);


	}
}
