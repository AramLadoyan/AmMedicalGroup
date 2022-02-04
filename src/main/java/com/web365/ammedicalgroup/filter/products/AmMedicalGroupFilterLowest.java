package com.web365.ammedicalgroup.filter.products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.field.search.AmMedicalGroupNumberSearch;
import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;
import static com.web365.ammedicalgroup.filter.products.AmMedicalGroupFilterProductsConstants.PRODUCTS_XPATH;
import static com.web365.ammedicalgroup.filter.products.AmMedicalGroupFilterProductsConstants.SORT_BY_XPATH;
import static com.web365.ammedicalgroup.filter.products.AmMedicalGroupFilterProductsConstants.LOWESTPRICE_XPATH;
import static com.web365.ammedicalgroup.filter.products.AmMedicalGroupFilterProductsConstants.LOWESTPRICE_RESULT_XPATH;

public class AmMedicalGroupFilterLowest extends AmMedicalGroupBasePage {

	public AmMedicalGroupFilterLowest(WebDriver driver) {
		super(driver);
		this.driver = driver;
		}
		@FindBy(xpath = PRODUCTS_XPATH)
		public WebElement products;
		
		@FindBy(xpath = SORT_BY_XPATH)
		public WebElement sortBy;
		
		@FindBy(xpath = LOWESTPRICE_XPATH)
		public WebElement lowestPrice;
		
		@FindBy(xpath = LOWESTPRICE_RESULT_XPATH)
		public WebElement lowestPriceResult;
	
		public AmMedicalGroupFilterLowest productsClick () {
			products.click();
			return new AmMedicalGroupFilterLowest(this.driver);
		}
		
		public AmMedicalGroupFilterLowest sortByClick () {
			sortBy.click();
			return new AmMedicalGroupFilterLowest(this.driver);
			
		}
			
		public AmMedicalGroupFilterLowest lowestPriceClick () {
				lowestPrice.click();
				return new AmMedicalGroupFilterLowest(this.driver);
			}
		
}
