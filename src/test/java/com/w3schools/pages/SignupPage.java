package com.w3schools.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.w3schools.utils.BaseTest;

public class SignupPage extends BaseTest {
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email_new;
	
	@FindBy(xpath="//input[@name='new-password']")
	WebElement password_new;
	
	@FindBy(xpath="//span[text()='Sign up for free']")
	WebElement signup;
	
	public void newEmail(String email) {
		
		email_new.sendKeys(email);
		
	}
	
	public void newPassword(String pswd) {
		
		password_new.sendKeys(pswd);
	}
	
	public void clicksignUp() {
		
		signup.click();
	}

}
