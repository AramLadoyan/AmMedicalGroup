package com.web365.products.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.page.products.AmMedicalGroupANDTechnology;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupANDTechnologyTest extends AmMedicalGroupBaseTest {
	
	@Test
	public void andTechnologyTest() throws InterruptedException {
		System.out.println("Test Case ID  Product22");
		System.out.println("Verify user is able to filter products to AND Technology brand");
		AmMedicalGroupANDTechnology menuButton = new AmMedicalGroupANDTechnology(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		Thread.sleep(5000);
		menuButton = menuButton.productsClick();
		Thread.sleep(5000);
		System.out.println("Step1 Click the 'products' button");
		Thread.sleep(5000);
		menuButton = menuButton.andTechnologyClick();
		Thread.sleep(5000);
		System.out.println("Step2 Click on the 'AND Technology' button");

		Assert.assertTrue(menuButton.andTechnologyResult.isDisplayed());

	}

}
