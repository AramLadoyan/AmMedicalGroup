package com.web365.ammedicalgroup.page.products;

import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupLancets extends AmMedicalGroupBasePage {

	public AmMedicalGroupLancets(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = PRODUCTS_XPATH)
	public WebElement products;

	@FindBy(xpath = LANCETS_XPATH)
	public WebElement lancets;

	@FindBy(xpath = LANCETS_RESULT_XPATH)
	public WebElement lancetsResult;

	public AmMedicalGroupLancets productsClick() {
		products.click();
		return new AmMedicalGroupLancets(this.driver);
	}

	public AmMedicalGroupLancets lancetsClick() {
		lancets.click();
		return new AmMedicalGroupLancets(this.driver);

	}

}
