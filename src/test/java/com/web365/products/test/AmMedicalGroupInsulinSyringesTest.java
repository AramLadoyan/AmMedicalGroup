package com.web365.products.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.page.products.AmMedicalGroupInsulinSyringes;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupInsulinSyringesTest extends AmMedicalGroupBaseTest {
	
	@Test
	public void insulinSyringesTest() throws InterruptedException {
		System.out.println("Test Case ID  Product8");
		System.out.println("Verify the 'Insulin syringes' page is displayed when the button is clicked");
		AmMedicalGroupInsulinSyringes menuButton = new AmMedicalGroupInsulinSyringes(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		Thread.sleep(5000);
		menuButton = menuButton.productsClick();
		Thread.sleep(5000);
		System.out.println("Step1 Click the 'products' button");
		Thread.sleep(5000);
		menuButton = menuButton.insulinSyringesClick();
		Thread.sleep(5000);
		System.out.println("Step2 Click on tke 'Insulin Syringes' button");
		
		Assert.assertTrue(menuButton.insulinSyringesResult.isDisplayed());

	
}

}
