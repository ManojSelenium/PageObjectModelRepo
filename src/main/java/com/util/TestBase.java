package com.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.LandingPage;

public class TestBase implements Setup{

	WebDriver driver;
	
	public WebDriver intilizeDriver() {
		
		System.setProperty(CHROME_KEY, CHROME_PATH);
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		System.out.println("Test Base Driver : "+driver);
		return driver;
	}
	
	public LandingPage enterURL(String url) {
		driver.get(url);
		LandingPage landingPage=new LandingPage(driver);
		return landingPage;
	}
}
