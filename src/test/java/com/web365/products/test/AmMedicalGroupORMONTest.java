package com.web365.products.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.page.products.AmMedicalGroupORMON;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupORMONTest extends AmMedicalGroupBaseTest {
	
	@Test
	public void ormonTest() throws InterruptedException {
		System.out.println("Test Case ID  Product21");
		System.out.println("Verify user is able to filter products to OMRON brand");
		AmMedicalGroupORMON menuButton = new AmMedicalGroupORMON(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		Thread.sleep(5000);
		menuButton = menuButton.productsClick();
		Thread.sleep(5000);
		System.out.println("Step1 Click the 'products' button");
		Thread.sleep(5000);
		menuButton = menuButton.ormonClick();
		Thread.sleep(5000);
		System.out.println("Step2 Click on the 'ORMON' button");

		Assert.assertTrue(menuButton.ormonResult.isDisplayed());

	}

}
