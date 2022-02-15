package com.web365.home.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.page.home.AmMedicalGroupLogoIcon;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupLogoIconTest extends AmMedicalGroupBaseTest {
	
	@Test
	public void logoIconTest() {
		System.out.println("Test Case ID  Home1");
		System.out.println("Verify user is able to go back to Home Page after clicking the logo icon");
		AmMedicalGroupLogoIcon home = new AmMedicalGroupLogoIcon(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		home = home.productsClick();
		System.out.println("Step1 Click the 'products' button");
		home = home.logoIconClick();
		System.out.println("Step2 Click on the logo icon");

		Assert.assertTrue(home.homeResult.isDisplayed());

	}

}
