package com.loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class BookingHotelpage extends BaseClass {
	
	
	public BookingHotelpage() {
		PageFactory.initElements(driver, this);
		
		}


	@FindBy(id="first_name")
    private WebElement firstnmebox;
	
	@FindBy(id="last_name")
    private WebElement lastnamebox;

	@FindBy(id="address")
    private WebElement addressbox;
	
	@FindBy(id="cc_num")
    private WebElement ccnumbox;

	@FindBy(id="cc_type")
    private WebElement cctypebox;
	
	@FindBy(id="cc_exp_month")
    private WebElement ccexpmonth;

	@FindBy(id="cc_exp_year")
    private WebElement ccexpyear;
	
	@FindBy(id="cc_cvv")
    private WebElement cvv;

	

	@FindBy(id="book_now")
	private WebElement bookbn;

	
	public WebElement getFirstnmebox() {
		return firstnmebox;
	}

	public WebElement getLastnamebox() {
		return lastnamebox;
	}

	public WebElement getAddressbox() {
		return addressbox;
	}

	public WebElement getCcnumbox() {
		return ccnumbox;
	}

	public WebElement getCctypebox() {
		return cctypebox;
	}

	public WebElement getCcexpmonth() {
		return ccexpmonth;
	}

	public WebElement getCcexpyear() {
		return ccexpyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

   public WebElement getBookbn() {
		return bookbn;
	}
	


	
	public void hotelbookingpg(String firtsname,String lastname,String address,String creditcrdno,String creditcrdtype,String expmonth,String expyear,String cvvno,String booknow) {
		elementsendkeys(getFirstnmebox(), firtsname);
		elementsendkeys(getLastnamebox(), lastname);
		elementsendkeys(getAddressbox(), address);
		elementsendkeys(getCcnumbox(), creditcrdno);
		selectoptionbytext(getCctypebox(), creditcrdtype);
		selectoptionbytext(getCcexpmonth(), expmonth);
		selectoptionbytext(getCcexpyear(), expyear);
		elementsendkeys(getCvv(), cvvno);
		elementclick(getBookbn());

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
