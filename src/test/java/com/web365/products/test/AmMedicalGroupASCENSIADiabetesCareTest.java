package com.web365.products.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.page.products.AmMedicalGroupASCENSIADiabetesCare;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupASCENSIADiabetesCareTest extends AmMedicalGroupBaseTest {
	
	@Test
	public void ascensiaDiabetesCareTest() throws InterruptedException {
		System.out.println("Test Case ID  Product20");
		System.out.println("Verify user is able to filter products to ASCENSIA Diabetes Care brand");
		AmMedicalGroupASCENSIADiabetesCare menuButton = new AmMedicalGroupASCENSIADiabetesCare(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		Thread.sleep(5000);
		menuButton = menuButton.productsClick();
		Thread.sleep(5000);
		System.out.println("Step1 Click the 'products' button");
		Thread.sleep(5000);
		menuButton = menuButton.ascensiaDiabetesCareClick();
		Thread.sleep(5000);
		System.out.println("Step2 Click on the 'ASCENSIA Diabetes Care' button");

		Assert.assertTrue(menuButton.ascensiaDiabetesCareResult.isDisplayed());

	}


}
