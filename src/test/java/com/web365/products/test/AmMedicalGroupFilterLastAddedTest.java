package com.web365.products.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterLastAdded;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupFilterLastAddedTest extends AmMedicalGroupBaseTest {
	
	@Test
	public void filterLastAddedTest() {
		System.out.println("Test Case ID  Filter6");
		System.out.println("Verify user is able to filter the products from Last added");
		AmMedicalGroupFilterLastAdded filter = new AmMedicalGroupFilterLastAdded(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		filter = filter.productsClick();
		System.out.println("1.1 Click the 'products' button");
		filter = filter.sortByClick();
		System.out.println("1.2 Click the 'Sort By' button");
		filter = filter.lastAddedClick();
		System.out.println("1.3 Click the 'Last Added' button");
	
		Assert.assertTrue(filter.lastAddedResult.isDisplayed());

}
}
