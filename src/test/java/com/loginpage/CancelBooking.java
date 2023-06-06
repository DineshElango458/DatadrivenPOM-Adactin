package com.loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class CancelBooking extends BaseClass{
	
	public CancelBooking() {
		PageFactory.initElements(driver, this);
		
		}

	
	
	@FindBy(id="order_id_text")
    private WebElement searchorderid;
	
	@FindBy(id="search_hotel_id")
    private WebElement gobtn;
	
	@FindBy(name="ids[]")
    private WebElement checkbox;
	
	@FindBy(name="cancelall")
    private WebElement cancelbtn;

	
	public WebElement getSearchorderid() {
		return searchorderid;
	}

	public WebElement getGobtn() {
		return gobtn;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}
	
	public void cancelbooking(String searchid ) {
	    elementsendkeys(getSearchorderid(), searchid);
	    elementclick(getGobtn());
	    elementclick(getCheckbox());
	    elementclick(getCancelbtn());
        alertok();
	}


}
