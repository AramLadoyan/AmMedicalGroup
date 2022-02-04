package com.web365.ammedicalgroup.field.search;

import static com.web365.ammedicalgroup.field.search.AmMedicalGroupSearchFieldConstants.SEARCH_FIELD_XPATH;
import static com.web365.ammedicalgroup.field.search.AmMedicalGroupSearchFieldConstants.SPEC_CHAR_RESULT_XPATH;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupSpecCharSearch extends AmMedicalGroupBasePage {
	
	
public AmMedicalGroupSpecCharSearch(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}

@FindBy(xpath = SEARCH_FIELD_XPATH)
public WebElement searchField;

@FindBy(xpath = SPEC_CHAR_RESULT_XPATH)
public WebElement specialCharResult;

public AmMedicalGroupSpecCharSearch searchFieldClick() {
	searchField.click();
	return new AmMedicalGroupSpecCharSearch(this.driver);
	
}

public AmMedicalGroupSpecCharSearch typeSpecChar() {
	searchField.sendKeys("'^#$%@'");
	return new AmMedicalGroupSpecCharSearch(this.driver);
}

public AmMedicalGroupSpecCharSearch enterKey() {
	searchField.sendKeys(Keys.ENTER);
	return new AmMedicalGroupSpecCharSearch(this.driver);
}


}
