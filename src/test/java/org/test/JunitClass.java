package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitClass {

	static WebDriver driver;

	@BeforeClass
	public static void beforeclass() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
    @org.junit.Test
	public void login() {
		WebElement textusername = driver.findElement(By.id("username"));
		textusername.sendKeys("dinesh1014");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("9789393634");
		WebElement loginbtn = driver.findElement(By.name("login"));
		loginbtn.click();

	}
	@Before
	public void beforemethod() throws IOException {
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
      TakesScreenshot screenshot=(TakesScreenshot) driver;
      File filescreenshot = screenshot.getScreenshotAs(OutputType.FILE);
      System.out.println(filescreenshot);
      File file = new File("D://sample.png");
      FileUtils.copyFile(filescreenshot, file);
      
	}
	@After
	public void aftermethod() throws IOException {
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
		TakesScreenshot screenshot=(TakesScreenshot) driver;
	      File filescreenshot = screenshot.getScreenshotAs(OutputType.FILE);
	      System.out.println(filescreenshot);
	      File file = new File("D://sample1.png");
	      FileUtils.copyFile(filescreenshot, file);
	      

	}
	
	@org.junit.AfterClass
	public static void afterclass() {
		driver.quit();

	}



}
