package com.web365.products.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.page.products.AmMedicalGroupAccessories;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupAccessoriesTest extends AmMedicalGroupBaseTest {
	
	@Test
	public void accessoriesTest() throws InterruptedException {
		System.out.println("Test Case ID  Product18");
		System.out.println("Verify the 'Accessories' page is displayed when the button is clicked");
		AmMedicalGroupAccessories menuButton = new AmMedicalGroupAccessories(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		Thread.sleep(5000);
		menuButton = menuButton.productsClick();
		Thread.sleep(5000);
		System.out.println("Step1 Click the 'products' button");
		Thread.sleep(5000);
		menuButton = menuButton.accessoriesClick();
		Thread.sleep(5000);
		System.out.println("Step2 Click on the 'Accessories' button");

		Assert.assertTrue(menuButton.accessoriesResult.isDisplayed());

	}

}
