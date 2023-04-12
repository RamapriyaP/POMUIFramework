package com.w3schools.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.w3schools.utils.BaseTest;

public class LoginPage extends BaseTest {
	
	@FindBy(id="modalusername")
	WebElement username;
	
	@FindBy(xpath="//input[@name='current-password']")
	WebElement password;
	
	@FindBy(xpath="//span[text()='Log in']")
	WebElement login;
	
	
	public void setUsername(String user)
	{
		waitForElement(username);
		//username.sendKeys(user);
		typetext(username, user); //using basetest method

	}
	
	public void setPassword(String pass)
	{
		waitForElement(password);
		//password.sendKeys(pass);
		typetext(password,pass);
	}
	
	public void clickLogin()
	{
		waitForElement(login);
		//login.click();
		clickAction(login);
	}
	
	public void fluentWait(WebElement ele)
	{
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOf(ele));
		wait.until((ExpectedConditions.elementToBeClickable(ele)));
		
	}
	

}
