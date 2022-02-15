package com.web365.products.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterHighest;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupFilterHighestTest extends AmMedicalGroupBaseTest{
	
	@Test
	public void filterLowestTest() {
		System.out.println("Test Case ID  Filter3");
		System.out.println("Verify user is able to filter the products from Highest price first");
		AmMedicalGroupFilterHighest filter = new AmMedicalGroupFilterHighest(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		filter = filter.productsClick();
		System.out.println("3.1 Click the 'products' button");
		filter = filter.sortByClick();
		System.out.println("3.2 Click the 'Sort By' button");
		filter = filter.highestPriceClick();
		System.out.println("3.3 Click the 'Highest Price first' button");
	
		Assert.assertTrue(filter.highestPriceResult.isDisplayed());
	}

}
