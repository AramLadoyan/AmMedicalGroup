package com.web365.contacts.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.page.contacts.AmMedicalGroupNameFieldLetters;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupNameFieldLettersTest extends AmMedicalGroupBaseTest {
	
	@Test
	public void nameFieldLettersTest() {
		System.out.println("Test Case ID  Contacts1");
		System.out.println("Verify user is able to enter letters in the name field");
		AmMedicalGroupNameFieldLetters home = new AmMedicalGroupNameFieldLetters(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		home = home.contactsClick();
		System.out.println("Step1 Click on the 'Contacts' button");
		home = home.namefieldClick();
		System.out.println("Step2 Click on the name field");
		home = home.namefieldType();
		System.out.println("Step3 Enter 'Aram' in the name field");

		Assert.assertTrue(home.nameFieldResult.isDisplayed());

	}

}
