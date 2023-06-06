package org.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.test.BaseClass;

public class JunitAdactintask extends BaseClass {
	static BaseClass b;
	static WebDriver driver;


	@BeforeClass
	public static void beforeclass() {
		b = new BaseClass();
		b.getdriver();
		b.geturl("https://adactinhotelapp.com/");
		b.maximizewindow();
		
		System.out.println("a");
	}

	@Before
	public void before() throws IOException {
		b.Screenshot("D://task.png");
		System.out.println("b");
	}


	@After
	public void after() throws IOException {
		b.Screenshot("D://task.png");
				System.out.println("d");
	}

	@Test
	
	public void testcase() throws Exception  {
		WebElement textusername = b.findlocatorbyid("username");
		String name = b.getdatafromexcel("Sheet2", 1, 0);
		b.elementsendkeys(textusername, name);
		WebElement password = b.findlocatorbyid("password");

		String pass = b.getdatafromexcel("Sheet2", 1, 1);
		b.elementsendkeys(password, pass);
		WebElement loginbtn = b.findlocatorbyid("login");
		loginbtn.click();
		
		
		  WebElement locatorbyid = b.findlocatorbyid("location");
	        String locator = b.getdatafromexcel("Sheet2", 1, 3);
	        b.selectoptionbytext(locatorbyid, locator);
	        WebElement hotelsid = b.findlocatorbyid("hotels");
	        Thread.sleep(3000);
	        String hotel = b.getdatafromexcel("Sheet2", 1, 4);
	        b.selectoptionbytext(hotelsid, hotel);

	        WebElement roomtypeid = b.findlocatorbyid("room_type");
	        String room = b.getdatafromexcel("Sheet2", 1, 5);
	        b.selectoptionbytext(roomtypeid, room);
	        
	        WebElement roomsid = b.findlocatorbyid("room_nos");
	        String rooms = b.getdatafromexcel("Sheet2", 1, 6);
	        b.selectoptionbytext(roomsid, rooms);
	        
	        WebElement checkindt = b.findlocatorbyid("datepick_in");
	        String datein = b.getdatafromexcel("Sheet2", 1, 7);
	        b.elementsendkeys(checkindt, datein);
	       

	        WebElement checkoutdt = b.findlocatorbyid("datepick_out");
	        String dateout = b.getdatafromexcel("Sheet2", 1, 8);
	        b.elementsendkeys(checkoutdt, dateout);
	       


	        WebElement adult = b.findlocatorbyid("adult_room");
	        String adroom = b.getdatafromexcel("Sheet2", 1, 9);
	        b.selectoptionbytext(adult, adroom);
	       
	        WebElement child = b.findlocatorbyid("child_room");
	        String childroom = b.getdatafromexcel("Sheet2", 1, 10);
	        b.selectoptionbytext(child, childroom);
	        
	        WebElement searchbtn = b.findlocatorbyid("Submit");
	        searchbtn.click();
	        
	        b.findlocatorbyid("radiobutton_0").click();
	        b.findlocatorbyid("continue").click();
	        
	        
	        
	       
	        WebElement firstname = b.findlocatorbyid("first_name");
	        String first = b.getdatafromexcel("Sheet2", 1, 11);
	        b.elementsendkeys(firstname, first);
	        
	        WebElement lastname = b.findlocatorbyid("last_name");
	        String last = b.getdatafromexcel("Sheet2", 1, 12);
	        b.elementsendkeys(lastname, last);
	        
	        

	        WebElement address = b.findlocatorbyid("address");
	        String address1 = b.getdatafromexcel("Sheet2", 1, 13);
	        b.elementsendkeys(address, address1);
	       
	        WebElement creditcrdno = b.findlocatorbyid("cc_num");
	        String cardno = b.getdatafromexcel("Sheet2", 1, 14);
	        b.elementsendkeys(creditcrdno, cardno);
	       
	        WebElement creditcrdtype = b.findlocatorbyid("cc_type");
	        String cardtype = b.getdatafromexcel("Sheet2", 1, 15);
	        b.selectoptionbytext(creditcrdtype, cardtype);
	       
	        
	        
	        WebElement expmonth = b.findlocatorbyid("cc_exp_month");
	        String month = b.getdatafromexcel("Sheet2", 1, 17);
	        b.selectoptionbytext(expmonth, month);
	       
	        WebElement expyear = b.findlocatorbyid("cc_exp_year");
	        String year = b.getdatafromexcel("Sheet2", 1, 18);
	        b.selectoptionbytext(expyear, year);
	        
	        
	        
	        WebElement cvv = b.findlocatorbyid("cc_cvv");
	        String cvvno = b.getdatafromexcel("Sheet2", 1, 19);
	        b.elementsendkeys(cvv, cvvno);
	        
	       WebElement booknow = b.findlocatorbyid("book_now");
	       booknow.click();
	        Thread.sleep(7000);
	        
	        
	        
	        
	    /*   WebElement orderno = b.findlocatorbyid("order_no");
	       String printno = b.elementgetattributevalue(orderno);
	       b.writecelldata("Sheet2", 1, 20, printno);
	        b.outputstream();
*/
		
		System.out.println("c");
	}



	@AfterClass
	public static void afterclass() {
		System.out.println("close");

	}






























































}
