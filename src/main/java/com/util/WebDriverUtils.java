package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {
	
	
	WebDriver driver;
	
	public WebDriverUtils(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void click(By prop) {
		new WebDriverWait(driver,50).until(ExpectedConditions.visibilityOfElementLocated(prop));
		driver.findElement(prop).click();
	}
	
	public void enterText(By prop,String testData) {
		new WebDriverWait(driver,50).until(ExpectedConditions.visibilityOfElementLocated(prop));
		driver.findElement(prop).sendKeys(testData);
	}
}
