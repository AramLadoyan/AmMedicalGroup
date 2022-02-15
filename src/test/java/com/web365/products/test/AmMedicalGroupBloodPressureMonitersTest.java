package com.web365.products.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.page.products.AmMedicalGroupBloodPressureMoniters;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupBloodPressureMonitersTest extends AmMedicalGroupBaseTest {
	
	@Test
	public void bloodPressureMonitersTest() throws InterruptedException {
		System.out.println("Test Case ID  Product15");
		System.out.println("Verify the 'Blood pressure monitors' page is displayed when the button is clicked");
		AmMedicalGroupBloodPressureMoniters menuButton = new AmMedicalGroupBloodPressureMoniters(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		Thread.sleep(5000);
		menuButton = menuButton.productsClick();
		Thread.sleep(5000);
		System.out.println("Step1 Click the 'products' button");
		Thread.sleep(5000);
		menuButton = menuButton.bloodPressureMonitorsClick();
		Thread.sleep(5000);
		System.out.println("Step2 Click on tke 'Blood Pressure Moniter' button");

		Assert.assertTrue(menuButton.bloodPressureMonitorsResult.isDisplayed());

	}

}
