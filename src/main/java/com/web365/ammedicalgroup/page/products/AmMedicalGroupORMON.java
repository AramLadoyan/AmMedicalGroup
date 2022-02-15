package com.web365.ammedicalgroup.page.products;

import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupORMON extends AmMedicalGroupBasePage {

	public AmMedicalGroupORMON(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = PRODUCTS_XPATH)
	public WebElement products;

	@FindBy(xpath = ORMON_XPATH)
	public WebElement ormon;

	@FindBy(xpath = ORMON_RESULT_XPATH)
	public WebElement ormonResult;

	public AmMedicalGroupORMON productsClick() {
		products.click();
		return new AmMedicalGroupORMON(this.driver);
	}

	public AmMedicalGroupORMON ormonClick() {
		ormon.click();
		return new AmMedicalGroupORMON(this.driver);

	}

}
