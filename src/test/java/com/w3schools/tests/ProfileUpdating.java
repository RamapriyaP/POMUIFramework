package com.w3schools.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.w3schools.pages.ProfilePage;

public class ProfileUpdating extends LoginTest {
	
// This test case to to validate profile update
	@Test
	public void profileUpdating() {
		
		loginW3Schools();
		
		ProfilePage profile = PageFactory.initElements(driver, ProfilePage.class);
		profile.clickProfile();
		profile.setFirstName("Priya");
		profile.setLastName("Prasathe");
		profile.clickEditButton();
		profile.clickEditButton();
		profile.nickName("Priyaaa");
		profile.clickSave2();
		profile.ProfileBio("I am here to improve my skills ");
		profile.clickSave3();
	}

}
