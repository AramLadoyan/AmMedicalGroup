package com.web365.ammedicalgroup.page.products;



import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.PRODUCTS_XPATH;
import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.SORT_BY_XPATH;
import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.Z_TO_A_XPATH;
import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.Z_TO_A_RESULT_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupFilterZtoA extends AmMedicalGroupBasePage{
	
	public AmMedicalGroupFilterZtoA(WebDriver driver) {
		super(driver);
		this.driver = driver; }

	@FindBy(xpath = PRODUCTS_XPATH)
	public WebElement products;
	
	@FindBy(xpath = SORT_BY_XPATH)
	public WebElement sortBy;
	
	@FindBy(xpath = Z_TO_A_XPATH)
	public WebElement filterZToA;
	
	@FindBy(xpath = Z_TO_A_RESULT_XPATH)
	public WebElement filterZToAResult;
	
	public AmMedicalGroupFilterZtoA productsClick () {
		products.click();
		return new AmMedicalGroupFilterZtoA(this.driver);
	}
	
	public AmMedicalGroupFilterZtoA sortByClick () {
		sortBy.click();
		return new AmMedicalGroupFilterZtoA(this.driver);
		
	}
		
	public AmMedicalGroupFilterZtoA filterZToAClick () {
		filterZToA.click();
		   return new AmMedicalGroupFilterZtoA(this.driver);
}
}
