package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.objrepo.CreateAccountPageProperties;
import com.util.WebDriverUtils;

public class CreateAccountPage extends WebDriverUtils implements CreateAccountPageProperties{

	WebDriver driver;

	public CreateAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void enterFirstName(String firstName) {
		
		enterText(FIRSTNAME_LOCATOR, firstName);
		
	}

	public void enterLastName(String lastName) {
		enterText(LASTNAME_LOCATOR, lastName);
	}

	public void enterPassword(String password) {
		enterText(PASSWORD_LOCATOR, password);
	}

	public void enterAddress() {

	}
	public void enterClity() {

	}
	public void selectState() {

	}
	
	public void clickRegisterButton() {
		
	}
	
	public void createNewUser(String firstName,String lastName,String password) {
		enterFirstName(firstName);
		enterLastName(lastName);
		//enterPassword(password);
		enterClity();
		selectState();
		
	}
}

