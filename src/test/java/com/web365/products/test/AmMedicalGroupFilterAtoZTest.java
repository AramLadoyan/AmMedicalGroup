package com.web365.products.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterAtoZ;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupFilterAtoZTest extends AmMedicalGroupBaseTest {


	@Test
	public void filterAtoZTest() {
		System.out.println("Test Case ID  Filter4");
		System.out.println("Verify user is able to filter the products from A - Z");
		AmMedicalGroupFilterAtoZ filter = new AmMedicalGroupFilterAtoZ(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		filter = filter.productsClick();
		System.out.println("4.1 Click the 'products' button");
		filter = filter.sortByClick();
		System.out.println("4.2 Click the 'Sort By' button");
		filter = filter.filterAToZClick();
		System.out.println("4.3 Click the 'A -Z' button");
	
		Assert.assertTrue(filter.filterAToZResult.isDisplayed());
	}
}
