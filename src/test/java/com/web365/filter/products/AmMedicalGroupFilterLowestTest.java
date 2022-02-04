package com.web365.filter.products;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.field.search.AmMedicalGroupSearchField;
import com.web365.ammedicalgroup.filter.products.AmMedicalGroupFilterLowest;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupFilterLowestTest extends AmMedicalGroupBaseTest {

	@Test
	public void searchFieldTest() throws InterruptedException {
		AmMedicalGroupFilterLowest filter = new AmMedicalGroupFilterLowest(driver);
		filter = filter.productsClick();
		filter = filter.sortByClick();
		filter = filter.lowestPriceClick();
	
		Assert.assertTrue(filter.lowestPriceResult.isDisplayed());
	}
}
