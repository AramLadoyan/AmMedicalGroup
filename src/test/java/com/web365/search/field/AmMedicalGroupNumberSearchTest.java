package com.web365.search.field;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.ammedicalgroup.field.search.AmMedicalGroupNumberSearch;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupNumberSearchTest extends AmMedicalGroupBaseTest {
	
	@Test
	public void numberSearchTest() {
		System.out.println("Test Case ID  Search2");
		System.out.println("Verify user is allowed to enter numbers in the search field");
		AmMedicalGroupNumberSearch search = new  AmMedicalGroupNumberSearch(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		search = search.searchFieldClick();
		System.out.println("Click on the Search field");
		search.typeSpecChar();
		System.out.println("Enter '458345' in the search field");
		search.enterKey();
		System.out.println("Click the enter key");
	
		Assert.assertTrue(search.numberSearchResult.isDisplayed());
	}

}
