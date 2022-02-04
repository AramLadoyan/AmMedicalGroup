package com.web365.search.field;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.web365.ammedicalgroup.field.search.AmMedicalGroupSearchField;
import com.web365.base.test.AmMedicalGroupBaseTest;

public class AmMedicalGroupSearchFieldTest extends AmMedicalGroupBaseTest {
	
	@Test
	public void searchFieldTest() throws InterruptedException {
		AmMedicalGroupSearchField search = new AmMedicalGroupSearchField(driver);
		search = search.searchFieldClick();
		search.typeThermometer();
		search.enterKey();
	
		Assert.assertTrue(search.searchResult.isDisplayed());
	}

}
