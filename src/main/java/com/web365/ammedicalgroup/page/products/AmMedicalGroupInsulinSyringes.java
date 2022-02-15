package com.web365.ammedicalgroup.page.products;

import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupInsulinSyringes extends AmMedicalGroupBasePage {

	public AmMedicalGroupInsulinSyringes(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = PRODUCTS_XPATH)
	public WebElement products;

	@FindBy(xpath = INSULIN_SYRINGES_XPATH)
	public WebElement insulinSyringes;

	@FindBy(xpath = INSULIN_SYRINGES_RESULT_XPATH)
	public WebElement insulinSyringesResult;

	public AmMedicalGroupInsulinSyringes productsClick() {
		products.click();
		return new AmMedicalGroupInsulinSyringes(this.driver);
	}

	public AmMedicalGroupInsulinSyringes insulinSyringesClick() {
		insulinSyringes.click();
		return new AmMedicalGroupInsulinSyringes(this.driver);

	}
}
