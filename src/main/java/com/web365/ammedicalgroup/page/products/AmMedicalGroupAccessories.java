package com.web365.ammedicalgroup.page.products;

import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupAccessories extends AmMedicalGroupBasePage {
	
	public AmMedicalGroupAccessories(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = PRODUCTS_XPATH)
	public WebElement products;

	@FindBy(xpath = ACCESSORIES_XPATH)
	public WebElement accessories;

	@FindBy(xpath = ACCESSORIES_RESULT_XPATH)
	public WebElement accessoriesResult;

	public AmMedicalGroupAccessories productsClick() {
		products.click();
		return new AmMedicalGroupAccessories(this.driver);
	}

	public AmMedicalGroupAccessories accessoriesClick() {
		accessories.click();
		return new AmMedicalGroupAccessories(this.driver);
	}

}
