package com.web365.ammedicalgroup.page.products;

import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupThermometers extends AmMedicalGroupBasePage {
	
	public AmMedicalGroupThermometers(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = PRODUCTS_XPATH)
	public WebElement products;

	@FindBy(xpath = THERMOMETERS_XPATH)
	public WebElement thermometers;

	@FindBy(xpath = THERMOMETERS_RESULT_XPATH)
	public WebElement thermometersResult;

	public AmMedicalGroupThermometers productsClick() {
		products.click();
		return new AmMedicalGroupThermometers(this.driver);
	}

	public AmMedicalGroupThermometers thermometersClick() {
		thermometers.click();
		return new AmMedicalGroupThermometers(this.driver);

	}

}
