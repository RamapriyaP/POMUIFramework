package com.w3schools.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.w3schools.pages.SignupPage;

public class SignUpTest  extends SignupPage {
	
	@Test
	
	public void signUpW3Schools(){
		
		try {
			
			launchBrowser("https://profile.w3schools.com/sign-up");
			
			SignupPage signup_elements = PageFactory.initElements(driver,SignupPage.class ); 
			
			signup_elements.newEmail("ramapriya_prasathe@hotmail.com");
			
			signup_elements.newPassword("Password@123");
			
			signup_elements.clicksignUp();
			
		}
		catch(Exception ex) {
			
			System.out.println("Problem while signing up w3schools");
			ex.printStackTrace();
		}
	}

}
