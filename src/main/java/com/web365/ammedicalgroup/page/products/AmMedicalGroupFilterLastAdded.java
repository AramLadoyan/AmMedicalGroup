package com.web365.ammedicalgroup.page.products;

import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.PRODUCTS_XPATH;
import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.SORT_BY_XPATH;
import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.LASTADDED_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupFilterLastAdded extends AmMedicalGroupBasePage {
	
	public AmMedicalGroupFilterLastAdded(WebDriver driver) {
		super(driver);
		this.driver = driver; }
	
	@FindBy(xpath = PRODUCTS_XPATH)
	public WebElement products;
	
	@FindBy(xpath = SORT_BY_XPATH)
	public WebElement sortBy;
	
	@FindBy(xpath = LASTADDED_XPATH)
	public WebElement lastAdded;
	
	@FindBy(xpath = SORT_BY_XPATH)
	public WebElement lastAddedResult;
	
	public AmMedicalGroupFilterLastAdded productsClick () {
		products.click();
		return new AmMedicalGroupFilterLastAdded(this.driver);
	}
	
	public AmMedicalGroupFilterLastAdded sortByClick () {
		sortBy.click();
		return new AmMedicalGroupFilterLastAdded(this.driver);
		
	}
		
	public AmMedicalGroupFilterLastAdded lastAddedClick () {
		lastAdded.click();
			return new AmMedicalGroupFilterLastAdded(this.driver);

}
}
