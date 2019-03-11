package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.objrepo.LandingPageProperties;
import com.util.WebDriverUtils;

public class LandingPage extends WebDriverUtils implements LandingPageProperties{

	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public SigninPage clickSignin() {
		System.out.println("Landing Page Driver : "+driver);
		click(SIGNINLINK_LOCATOR);
		SigninPage signinPage=new SigninPage(driver);
		return signinPage;
	}
	
	
	public void clickContactUs() {
		
	}
}
