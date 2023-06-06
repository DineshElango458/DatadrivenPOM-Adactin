package com.loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class SelectHotelpage extends BaseClass {
	
	
	public SelectHotelpage() {
		PageFactory.initElements(driver, this);
		
		}

	
	@FindBy(id="radiobutton_0")
    private WebElement radiobtn;
	
	@FindBy(id="continue")
    private WebElement continuebtn;

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}
	

	public void hotelpgselect() {
	      elementclick(getRadiobtn());
	      elementclick(getContinuebtn());

	}
}
