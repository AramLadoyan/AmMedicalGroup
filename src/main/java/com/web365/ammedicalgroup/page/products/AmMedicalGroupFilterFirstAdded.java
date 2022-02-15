package com.web365.ammedicalgroup.page.products;

import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.FIRSTADDED_RESULT_XPATH;
import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.FIRSTADDED_XPATH;
import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.PRODUCTS_XPATH;
import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.SORT_BY_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupFilterFirstAdded extends AmMedicalGroupBasePage {
	
	public AmMedicalGroupFilterFirstAdded(WebDriver driver) {
		super(driver);
		this.driver = driver; }
		
		@FindBy(xpath = PRODUCTS_XPATH)
		public WebElement products;
		
		@FindBy(xpath = SORT_BY_XPATH)
		public WebElement sortBy;
		
		@FindBy(xpath = FIRSTADDED_XPATH)
		public WebElement firstAdded;
		
		@FindBy(xpath = FIRSTADDED_RESULT_XPATH)
		public WebElement firstAddedResult;
		
		public AmMedicalGroupFilterFirstAdded productsClick () {
			products.click();
			return new AmMedicalGroupFilterFirstAdded(this.driver);
		}
		
		public AmMedicalGroupFilterFirstAdded sortByClick () {
			sortBy.click();
			return new AmMedicalGroupFilterFirstAdded(this.driver);
			
		}
			
		public AmMedicalGroupFilterFirstAdded firstAddedClick () {
			firstAdded.click();
				return new AmMedicalGroupFilterFirstAdded(this.driver);
			}

}
