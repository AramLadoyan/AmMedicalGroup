package com.web365.ammedicalgroup.field.search;

import static com.web365.ammedicalgroup.field.search.AmMedicalGroupSearchFieldConstants.SEARCH_FIELD_XPATH;
import static com.web365.ammedicalgroup.field.search.AmMedicalGroupSearchFieldConstants.NUMBER_SEARCH_RESULT_XPATH;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupNumberSearch extends AmMedicalGroupBasePage {
	
	public AmMedicalGroupNumberSearch(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}

@FindBy(xpath = SEARCH_FIELD_XPATH)
public WebElement searchField;

@FindBy(xpath = NUMBER_SEARCH_RESULT_XPATH)
public WebElement numberSearchResult;

public AmMedicalGroupNumberSearch searchFieldClick() {
	searchField.click();
	return new AmMedicalGroupNumberSearch(this.driver);
	
}

public AmMedicalGroupNumberSearch typeSpecChar() {
	searchField.sendKeys("'458345'");
	return new AmMedicalGroupNumberSearch(this.driver);
}

public AmMedicalGroupNumberSearch enterKey() {
	searchField.sendKeys(Keys.ENTER);
	return new AmMedicalGroupNumberSearch(this.driver);
}

}
