package com.web365.search.field;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.web365.ammedicalgroup.field.search.AmMedicalGroupSearchField;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupLetterSearchTest extends AmMedicalGroupBaseTest {
	
	@Test
	public void searchFieldTest() {
		System.out.println("Test Case ID  Search1");
		System.out.println("Verify user is allowed to enter numbers in the search field");
		AmMedicalGroupSearchField search = new AmMedicalGroupSearchField(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		search = search.searchFieldClick();
		System.out.println("Click on the Search field");
		search.typeThermometer();
		System.out.println("Enter 'thermometer' in the search field");
		search.enterKey();
		System.out.println("Click the enter key");
	
		Assert.assertTrue(search.searchResult.isDisplayed());
	}

}
