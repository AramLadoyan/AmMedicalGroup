package com.web365.ammedicalgroup.page.products;

import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupANDTechnology extends AmMedicalGroupBasePage {
	
	public AmMedicalGroupANDTechnology(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = PRODUCTS_XPATH)
	public WebElement products;

	@FindBy(xpath = AND_TECHNOLOGY_XPATH)
	public WebElement andTechnology;

	@FindBy(xpath = AND_TECHNOLOGY_RESULT_XPATH)
	public WebElement andTechnologyResult;

	public AmMedicalGroupANDTechnology productsClick() {
		products.click();
		return new AmMedicalGroupANDTechnology(this.driver);
	}

	public AmMedicalGroupANDTechnology andTechnologyClick() {
		andTechnology.click();
		return new AmMedicalGroupANDTechnology(this.driver);

	}

}
