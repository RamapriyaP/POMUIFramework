package com.w3schools.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.w3schools.utils.BaseTest;

public class ProfilePage extends BaseTest {
	
	    // 1. Login and click on "Profiles" tab --> Enter all the possible text boxes
		// and save the profile (first name, last name, nickname, bio) and save. Then
		// validate the text in the textbox vs the given text

		@FindBy(linkText = "Profile")
		WebElement profile;

		public void clickProfile() {
			waitForElement(profile);
			clickAction(profile);
		}

		@FindBy(name = "profile-firstname")
		WebElement fname;

		public void setFirstName(String user) {
			waitForElement(fname);
			typetext(fname, user);
		}

		@FindBy(name = "profile-lastname")
		WebElement lname;

		public void setLastName(String user) {
			waitForElement(lname);
			typetext(lname, user);
		}

		@FindBy(xpath = "//span[text()='Edit']")
		WebElement editButton;

		public void clickEditButton() {
			waitForElement(editButton);
			clickAction(editButton);
		}

		@FindBy(name = "input-item")
		WebElement nickName;

		public void nickName(String user) {
			waitForElement(nickName);
			typetext(nickName, user);
		}

		@FindBy(xpath = "(//span[text()='Save'])[2]")
		WebElement save2;

		public void clickSave2() {
			waitForElement(save2);
			clickAction(save2);
		}

		@FindBy(name = "profile_bio")
		WebElement bio;

		public void ProfileBio(String user) {
			waitForElement(bio);
			typetext(bio, user);
		}

		@FindBy(xpath = "(//span[contains(text(),'Save')])[2]")
		WebElement save3;

		public void clickSave3() {
			jsScrollUpToElement(save3);
			//waitForElement(save3);
			jsClick(save3);
		}
		
	}



