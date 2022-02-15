package com.web365.products.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.page.products.AmMedicalGroupLancets;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupLancetsTest extends AmMedicalGroupBaseTest {
	
	@Test
	public void lancetsTest() throws InterruptedException {
		System.out.println("Test Case ID  Product16");
		System.out.println("Verify the 'Lancets' page is displayed when the button is clicked");
		AmMedicalGroupLancets menuButton = new AmMedicalGroupLancets(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		Thread.sleep(5000);
		menuButton = menuButton.productsClick();
		Thread.sleep(5000);
		System.out.println("Step1 Click the 'products' button");
		Thread.sleep(5000);
		menuButton = menuButton.lancetsClick();
		Thread.sleep(5000);
		System.out.println("Step2 Click on tke 'Lancets' button");
		
		Assert.assertTrue(menuButton.lancetsResult.isDisplayed());

	
}

}
