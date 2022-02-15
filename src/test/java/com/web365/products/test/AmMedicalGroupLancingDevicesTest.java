package com.web365.products.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.page.products.AmMedicalGroupLancingDevices;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupLancingDevicesTest extends AmMedicalGroupBaseTest {
	
	@Test
	public void lancingDevicesTest() throws InterruptedException {
		System.out.println("Test Case ID  Product10");
		System.out.println("Verify the 'lancing devices' page is displayed when the button is clicked");
		AmMedicalGroupLancingDevices menuButton = new AmMedicalGroupLancingDevices(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		Thread.sleep(5000);
		menuButton = menuButton.productsClick();
		Thread.sleep(5000);
		System.out.println("Step1 Click the 'products' button");
		Thread.sleep(5000);
		menuButton = menuButton.lancingDevicesClick();
		Thread.sleep(5000);
		System.out.println("Step2 Click on tke 'Lancing Devices' button");
		
		Assert.assertTrue(menuButton.lancingDevicesResult.isDisplayed());

	
}

}
