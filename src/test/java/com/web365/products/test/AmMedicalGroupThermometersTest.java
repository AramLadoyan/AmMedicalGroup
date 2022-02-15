package com.web365.products.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.page.products.AmMedicalGroupThermometers;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupThermometersTest extends AmMedicalGroupBaseTest {
	
	@Test
	public void thermometersTest() throws InterruptedException {
		System.out.println("Test Case ID  Product17");
		System.out.println("Verify the 'Thermometers' page is displayed when the button is clicked");
		AmMedicalGroupThermometers menuButton = new AmMedicalGroupThermometers(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		Thread.sleep(5000);
		menuButton = menuButton.productsClick();
		Thread.sleep(5000);
		System.out.println("Step1 Click the 'products' button");
		Thread.sleep(5000);
		menuButton = menuButton.thermometersClick();
		Thread.sleep(5000);
		System.out.println("Step2 Click on tke 'Thermometers' button");

		Assert.assertTrue(menuButton.thermometersResult.isDisplayed());

	}


}
