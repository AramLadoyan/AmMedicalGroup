package com.web365.products.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.page.products.AmMedicalGroupAlcoholSwabs;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupAlcoholSwabsTest extends AmMedicalGroupBaseTest {

	@Test
	public void alcoholSwabsTest() throws InterruptedException {
		System.out.println("Test Case ID  Product12");
		System.out.println("Verify the 'Alcohol swabs' page is displayed when the button is clicked");
		AmMedicalGroupAlcoholSwabs menuButton = new AmMedicalGroupAlcoholSwabs(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		Thread.sleep(5000);
		menuButton = menuButton.productsClick();
		Thread.sleep(5000);
		System.out.println("Step1 Click the 'products' button");
		Thread.sleep(5000);
		menuButton = menuButton.alcoholSwabsClick();
		Thread.sleep(5000);
		System.out.println("Step2 Click on the 'Alcohol Swabs' button");

		Assert.assertTrue(menuButton.alcoholSwabsResult.isDisplayed());

	}

}
