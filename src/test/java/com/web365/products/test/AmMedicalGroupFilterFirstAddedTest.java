package com.web365.products.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterFirstAdded;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupFilterFirstAddedTest extends AmMedicalGroupBaseTest {
	
	@Test
	public void filterFirstAddedTest() {
		System.out.println("Test Case ID  Filter2");
		System.out.println("Verify user is able to filter the products from First added");
		AmMedicalGroupFilterFirstAdded filter = new AmMedicalGroupFilterFirstAdded(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		filter = filter.productsClick();
		System.out.println("1.1 Click the 'products' button");
		filter = filter.sortByClick();
		System.out.println("1.2 Click the 'Sort By' button");
		filter = filter.firstAddedClick();
		System.out.println("1.3 Click the 'First Added' button");
	
		Assert.assertTrue(filter.firstAddedResult.isDisplayed());
	}

}
