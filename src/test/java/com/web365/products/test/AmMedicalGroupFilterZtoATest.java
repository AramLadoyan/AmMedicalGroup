package com.web365.products.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterZtoA;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupFilterZtoATest extends AmMedicalGroupBaseTest {
	
	@Test
	public void filterZtoATest() {
		System.out.println("Test Case ID  Filter5");
		System.out.println("Verify user is able to filter the products from Z - A");
		AmMedicalGroupFilterZtoA filter = new AmMedicalGroupFilterZtoA(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		filter = filter.productsClick();
		System.out.println("5.1 Click the 'products' button");
		filter = filter.sortByClick();
		System.out.println("5.2 Click the 'Sort By' button");
		filter = filter.filterZToAClick();
		System.out.println("5.3 Click the 'Z -A' button");
	
		Assert.assertTrue(filter.filterZToAResult.isDisplayed());

}
}

