package com.web365.ammedicalgroup.field.search;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;
import static com.web365.ammedicalgroup.field.search.AmMedicalGroupSearchFieldConstants.SEARCH_FIELD_XPATH;
import static com.web365.ammedicalgroup.field.search.AmMedicalGroupSearchFieldConstants.SEARCH_RESULT_XPATH;


public class AmMedicalGroupSearchField extends AmMedicalGroupBasePage {
	
	public AmMedicalGroupSearchField (WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = SEARCH_FIELD_XPATH)
	public WebElement searchField;
	
	@FindBy(xpath = SEARCH_RESULT_XPATH)
	public WebElement searchResult;
	
	public AmMedicalGroupSearchField searchFieldClick() {
		searchField.click();
		return new AmMedicalGroupSearchField(this.driver);
		
	}
	
	public AmMedicalGroupSearchField typeThermometer() {
		searchField.sendKeys("thermometer");
		return new AmMedicalGroupSearchField(this.driver);
	}
	
	public AmMedicalGroupSearchField enterKey() {
		searchField.sendKeys(Keys.ENTER);
		return new AmMedicalGroupSearchField(this.driver);
	}


}
