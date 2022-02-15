package com.web365.ammedicalgroup.page.products;

import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.A_TO_Z_RESULT_XPATH;
import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.A_TO_Z_XPATH;
import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.PRODUCTS_XPATH;
import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.SORT_BY_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupFilterAtoZ extends AmMedicalGroupBasePage{
	
	public AmMedicalGroupFilterAtoZ(WebDriver driver) {
		super(driver);
		this.driver = driver; }
	
	@FindBy(xpath = PRODUCTS_XPATH)
	public WebElement products;
	
	@FindBy(xpath = SORT_BY_XPATH)
	public WebElement sortBy;
	
	@FindBy(xpath = A_TO_Z_XPATH)
	public WebElement filterAToZ;
	
	@FindBy(xpath = A_TO_Z_RESULT_XPATH)
	public WebElement filterAToZResult;
	
	public AmMedicalGroupFilterAtoZ productsClick () {
		products.click();
		return new AmMedicalGroupFilterAtoZ(this.driver);
	}
	
	public AmMedicalGroupFilterAtoZ sortByClick () {
		sortBy.click();
		return new AmMedicalGroupFilterAtoZ(this.driver);
		
	}
		
	public AmMedicalGroupFilterAtoZ filterAToZClick () {
		filterAToZ.click();
		   return new AmMedicalGroupFilterAtoZ(this.driver);

}
}
