package com.w3schools.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w3schools.pages.LoginPage;

public class LoginTest extends LoginPage {
	
	@Test
	public void loginW3Schools()
	{
		try
		{
			launchBrowser("https://profile.w3schools.com/log-in");

			LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			//SignupPage signUpPage = PageFactory.initElements(driver, SignupPage.class);
			
            
			loginPage.setUsername("bv.nirmal@gmail.com");
			
			
			loginPage.setPassword("Testing@123");
			
			loginPage.clickLogin();
			
			Thread.sleep(7000);
			
			String loginPageTitle="My learning | W3Schools";
			Assert.assertEquals(driver.getTitle(), loginPageTitle);
			
			
			
		}
		catch(Exception ex)
		{
			System.out.println("Problem while loggin into W3Schools");
			ex.printStackTrace();
		}
		
	}

}
