package com.web365.products.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.page.products.AmMedicalGroupSpecialOffers;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupSpecialOffersTest extends AmMedicalGroupBaseTest {
	
	@Test
	public void specialOffersTest() throws InterruptedException {
		System.out.println("Test Case ID  Product19");
		System.out.println("Verify the 'Special offers' page is displayed when the button is clicked");
		AmMedicalGroupSpecialOffers menuButton = new AmMedicalGroupSpecialOffers(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		Thread.sleep(5000);
		menuButton = menuButton.productsClick();
		Thread.sleep(5000);
		System.out.println("Step1 Click the 'products' button");
		Thread.sleep(5000);
		menuButton = menuButton.specialOffersClick();
		Thread.sleep(5000);
		System.out.println("Step2 Click on tke 'Special Offers' button");

		Assert.assertTrue(menuButton.specialOffersResult.isDisplayed());

	}

}
