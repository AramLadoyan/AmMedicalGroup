package com.web365.products.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.page.products.AmMedicalGroupBloodGlucoseMeters;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupBloodGlucoseMetersTest extends AmMedicalGroupBaseTest {

	@Test
	public void bloodGlucoseMeterTest() throws InterruptedException {
		System.out.println("Test Case ID  Product13");
		System.out.println("Verify the 'Blood Glucose Meters' page is displayed when the button is clicked");
		AmMedicalGroupBloodGlucoseMeters menuButton = new AmMedicalGroupBloodGlucoseMeters(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		Thread.sleep(5000);
		menuButton = menuButton.productsClick();
		Thread.sleep(5000);
		System.out.println("Step1 Click the 'products' button");
		Thread.sleep(5000);
		menuButton = menuButton.bloodGlucoseMetersClick();
		Thread.sleep(5000);
		System.out.println("Step2 Click on tke 'Blood Glucose Meter' button");

		Assert.assertTrue(menuButton.bloodGlucoseMetersResult.isDisplayed());

	}

}
