package com.web365.products.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterLowest;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupFilterLowestTest extends AmMedicalGroupBaseTest {
	
	@Test
	public void filterLowestTest() {
		System.out.println("Test Case ID  Filter1");
		System.out.println("Verify user is able to filter the products from Lowest price first");
		AmMedicalGroupFilterLowest filter = new AmMedicalGroupFilterLowest(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		filter = filter.productsClick();
		System.out.println("1.1 Click the 'products' button");
		filter = filter.sortByClick();
		System.out.println("1.2 Click the 'Sort By' button");
		filter = filter.lowestPriceClick();
		System.out.println("1.3 Click the 'Lowest price first' button");
	
		Assert.assertTrue(filter.lowestPriceResult.isDisplayed());
	}

}

