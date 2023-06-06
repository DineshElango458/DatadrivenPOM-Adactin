package com.loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="username")
    private WebElement textusername;
	
	@FindBy(id="password")
    private WebElement txtpass;
	
	@FindBy(id="login")
    private WebElement btnlogin;

	public WebElement getTxtusername() {
		return textusername;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getTxtlogin() {
		return btnlogin;
	}
	
	
	
	public void login( String username,String password) {
		elementsendkeys(getTxtusername(), username);
		elementsendkeys(getTxtpass(), password);
	    elementclick(getTxtlogin());
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
