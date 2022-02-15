package com.web365.home.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.page.home.AmMedicalGroupLanguageRussian;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupLanguageRussianTest extends AmMedicalGroupBaseTest {
	
	@Test
	public void russianTest() {
		System.out.println("Test Case ID  Home3");
		System.out.println("Verify user can change language to Russian");
		AmMedicalGroupLanguageRussian language = new AmMedicalGroupLanguageRussian(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		language = language.russianClick();
		System.out.println("Step1 Click the 'RUS' button");
		
		Assert.assertTrue(language.russianResult.isDisplayed());

	}

}
