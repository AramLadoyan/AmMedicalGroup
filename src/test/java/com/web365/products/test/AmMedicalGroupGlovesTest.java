package com.web365.products.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.page.products.AmMedicalGroupGloves;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupGlovesTest extends AmMedicalGroupBaseTest {
	
	@Test
	public void glovesTest() throws InterruptedException {
		System.out.println("Test Case ID  Product11");
		System.out.println("Verify the 'Gloves' page is displayed when the button is clicked");
		AmMedicalGroupGloves menuButton = new AmMedicalGroupGloves(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		Thread.sleep(5000);
		menuButton = menuButton.productsClick();
		Thread.sleep(5000);
		System.out.println("Step1 Click the 'products' button");
		Thread.sleep(5000);
		menuButton = menuButton.glovesClick();
		Thread.sleep(5000);
		System.out.println("Step2 Click on tke 'Gloves' button");
		
		Assert.assertTrue(menuButton.glovesResult.isDisplayed());

	
}

}
