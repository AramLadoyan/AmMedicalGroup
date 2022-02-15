package com.web365.ammedicalgroup.page.products;

import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupAlcoholSwabs extends AmMedicalGroupBasePage {
	
	public AmMedicalGroupAlcoholSwabs(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = PRODUCTS_XPATH)
	public WebElement products;

	@FindBy(xpath = ALCOHOL_SWABS_XPATH)
	public WebElement alcoholSwabs;

	@FindBy(xpath = ALCOHOL_SWABS_RESULT_XPATH)
	public WebElement alcoholSwabsResult;

	public AmMedicalGroupAlcoholSwabs productsClick() {
		products.click();
		return new AmMedicalGroupAlcoholSwabs(this.driver);
	}

	public AmMedicalGroupAlcoholSwabs alcoholSwabsClick() {
		alcoholSwabs.click();
		return new AmMedicalGroupAlcoholSwabs(this.driver);

	}

}
