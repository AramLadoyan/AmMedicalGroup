package com.web365.ammedicalgroup.page.products;

import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.PRODUCTS_XPATH;
import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.NEBULAIZERS_XPATH;
import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.NEBULAIZERS_RESULT_XPATH;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupNebulaizers extends AmMedicalGroupBasePage {

	public AmMedicalGroupNebulaizers(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = PRODUCTS_XPATH)
	public WebElement products;

	@FindBy(xpath = NEBULAIZERS_XPATH)
	public WebElement nebulaizers;

	@FindBy(xpath = NEBULAIZERS_RESULT_XPATH)
	public WebElement nebulaizersResult;

	public AmMedicalGroupNebulaizers productsClick() {
		products.click();
		return new AmMedicalGroupNebulaizers(this.driver);
	}
		
		public AmMedicalGroupNebulaizers nebulaizersClick() {
			nebulaizers.click();
			return new AmMedicalGroupNebulaizers(this.driver);


	}
}
