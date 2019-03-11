package com.sprint1.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.CreateAccountPage;
import com.pages.LandingPage;
import com.pages.SigninPage;
import com.util.TestBase;

public class S75675_Create_Acccount_Functionality_Validation extends TestBase{

	WebDriver driver;
	LandingPage landingPage;
	
	@BeforeMethod
	public void beforeMethod() {
		driver=intilizeDriver();
		System.out.println("Test Case Driver : "+driver);
		 landingPage=enterURL(AUTOMATION_URL);
	}


	@Test
	public void testCase1() {

		//Click Signin here
		
		SigninPage signinPage=landingPage.clickSignin();
		
		String testData="selenium867@mailinator.com";
		
		signinPage.enterEmailAddress(testData);
		CreateAccountPage accountPage=signinPage.clickCreateAccountButton();

		Assert.assertEquals("selenium867@mailinator.com", testData);;	

		accountPage.createNewUser("selenium", "Testing", "Manoj13");



	}

	//@Test
	public void testCase2() {

	}
}
