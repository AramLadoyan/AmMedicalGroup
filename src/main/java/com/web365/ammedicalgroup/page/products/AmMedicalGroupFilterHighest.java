package com.web365.ammedicalgroup.page.products;

import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.HIGHESTPRICE_RESULT_XPATH;
import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.HIGHESTPRICE_XPATH;
import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.PRODUCTS_XPATH;
import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.SORT_BY_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupFilterHighest extends AmMedicalGroupBasePage {
	
	public AmMedicalGroupFilterHighest (WebDriver driver) {
		super(driver);
		this.driver = driver; }
	
	@FindBy(xpath = PRODUCTS_XPATH)
	public WebElement products;
	
	@FindBy(xpath = SORT_BY_XPATH)
	public WebElement sortBy;
	
	@FindBy(xpath = HIGHESTPRICE_XPATH)
	public WebElement highestPrice;
	
	@FindBy(xpath = HIGHESTPRICE_RESULT_XPATH)
	public WebElement highestPriceResult;
	
	public AmMedicalGroupFilterHighest productsClick () {
		products.click();
		return new AmMedicalGroupFilterHighest(this.driver);
	}
		
		public AmMedicalGroupFilterHighest sortByClick () {
			sortBy.click();
			return new AmMedicalGroupFilterHighest(this.driver);
		}
		
		public AmMedicalGroupFilterHighest highestPriceClick () {
			highestPrice.click();
			return new AmMedicalGroupFilterHighest(this.driver);
	}
}

