package com.web365.home.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.page.home.AmMedicalGroupLanguageArmenian;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupLanguageArmenianTest extends AmMedicalGroupBaseTest {
	
	@Test
	public void armenianTest() {
		System.out.println("Test Case ID  Home2");
		System.out.println("Verify user can change language to Armenian");
		AmMedicalGroupLanguageArmenian language = new AmMedicalGroupLanguageArmenian(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		language = language.armenianClick();
		System.out.println("Step1 Click the 'ARM' button");
		
		Assert.assertTrue(language.armenianResult.isDisplayed());

	}

}
