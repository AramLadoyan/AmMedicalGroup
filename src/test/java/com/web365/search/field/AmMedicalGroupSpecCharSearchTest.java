package com.web365.search.field;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.web365.ammedicalgroup.field.search.AmMedicalGroupSpecCharSearch;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupSpecCharSearchTest extends AmMedicalGroupBaseTest {
	@Test
	public void specCharSearchTest() throws InterruptedException {
		 AmMedicalGroupSpecCharSearch search = new  AmMedicalGroupSpecCharSearch(driver);
		search = search.searchFieldClick();
		search.typeSpecChar();
		search.enterKey();
	
		Assert.assertTrue(search.specialCharResult.isDisplayed());
	}

}
