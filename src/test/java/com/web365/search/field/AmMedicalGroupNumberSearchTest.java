package com.web365.search.field;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.field.search.AmMedicalGroupNumberSearch;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupNumberSearchTest extends AmMedicalGroupBaseTest {
	
	@Test
	public void numberSearchTest() throws InterruptedException {
		AmMedicalGroupNumberSearch search = new  AmMedicalGroupNumberSearch(driver);
		search = search.searchFieldClick();
		search.typeSpecChar();
		search.enterKey();
	
		Assert.assertTrue(search.numberSearchResult.isDisplayed());
	}

}
