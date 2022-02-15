package com.web365.search.field;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.web365.ammedicalgroup.field.search.AmMedicalGroupSpecCharSearch;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupSpecCharSearchTest extends AmMedicalGroupBaseTest {
	@Test
	public void specCharSearchTest() throws InterruptedException {
		System.out.println("Test Case ID  Search3");
		System.out.println("Verify user is allowed to enter numbers in the search field");
		AmMedicalGroupSpecCharSearch search = new AmMedicalGroupSpecCharSearch(driver);
		System.out.println("Navigate to ammedicalgroup.am");
		search = search.searchFieldClick();
		System.out.println("Click on the Search field");
		search.typeSpecChar();
		System.out.println("Enter '^#$%@' in the search field");
		search.enterKey();
		System.out.println("Click the enter key");

		Assert.assertTrue(search.specialCharResult.isDisplayed());
	}

}
