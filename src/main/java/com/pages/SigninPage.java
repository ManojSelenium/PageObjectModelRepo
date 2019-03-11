package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.objrepo.SigninPageProperties;
import com.util.WebDriverUtils;

public class SigninPage extends WebDriverUtils implements SigninPageProperties{

	
	WebDriver driver;
	
	public SigninPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void enterEmailAddress(String emailAddress) {
	System.out.println("Signin Page Driver : "+driver);
		enterText(EMAILADDRESS_LOCATOR, emailAddress);
	}
	
	public CreateAccountPage clickCreateAccountButton() {
		click(CREATEACCOUNTBUTTON_LOCATOR);
		return new CreateAccountPage(driver);
	}
	
	public void clickForgotPassword() {
		
	}
}
