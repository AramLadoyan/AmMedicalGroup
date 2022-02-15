package com.web365.products.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.page.products.AmMedicalGroupTestStrips;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupTestStripsTest extends AmMedicalGroupBaseTest {

	@Test
	public void testStripsTest() throws InterruptedException {
		System.out.println("Test Case ID  Product14");
		System.out.println("VVerify the 'Test strips' page is displayed when the button is clicked");
		AmMedicalGroupTestStrips menuButton = new AmMedicalGroupTestStrips(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		Thread.sleep(5000);
		menuButton = menuButton.productsClick();
		Thread.sleep(5000);
		System.out.println("Step1 Click the 'products' button");
		Thread.sleep(5000);
		menuButton = menuButton.testStripsClick();
		Thread.sleep(5000);
		System.out.println("Step2 Click on tke 'Test Strips' button");

		Assert.assertTrue(menuButton.testStripsResult.isDisplayed());

	}

}
