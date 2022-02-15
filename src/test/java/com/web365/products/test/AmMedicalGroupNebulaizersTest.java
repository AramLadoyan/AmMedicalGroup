package com.web365.products.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.page.products.AmMedicalGroupNebulaizers;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupNebulaizersTest extends AmMedicalGroupBaseTest{
	
	@Test
	public void nebulaizersTest() throws InterruptedException {
		System.out.println("Test Case ID  Product7");
		System.out.println("Verify the 'Nebulaizers' page is displayed when the button is clicked");
		AmMedicalGroupNebulaizers menuButton = new AmMedicalGroupNebulaizers(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		Thread.sleep(5000);
		menuButton = menuButton.productsClick();
		Thread.sleep(5000);
		System.out.println("Step1 Click the 'products' button");
		Thread.sleep(5000);
		menuButton = menuButton.nebulaizersClick();
		Thread.sleep(5000);
		System.out.println("Step2 Click on tke 'Nebulaizers' button");
		
		Assert.assertTrue(menuButton.nebulaizersResult.isDisplayed());

	
}
}
