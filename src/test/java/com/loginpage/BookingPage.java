package com.loginpage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class BookingPage extends BaseClass{
	
	public BookingPage() {
		PageFactory.initElements(driver, this);
		
		}

	
	@FindBy(id="order_no")
    private WebElement ordernobtn;
	
	@FindBy(xpath=" //a[text()='Booked Itinerary']")
    private WebElement BookedIt;

	public WebElement getOrdernobtn() {
		return ordernobtn;
	}

	public WebElement getBookedIt() {
		return BookedIt;
	}
	
	public void bookingpg() {
		//elementgetattributevalue(getOrdernobtn());
		elementclick(getBookedIt());

	}
}

