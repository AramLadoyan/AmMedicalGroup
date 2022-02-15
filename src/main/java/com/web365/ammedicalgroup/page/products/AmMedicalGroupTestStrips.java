package com.web365.ammedicalgroup.page.products;

import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupTestStrips extends AmMedicalGroupBasePage {

	public AmMedicalGroupTestStrips(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = PRODUCTS_XPATH)
	public WebElement products;

	@FindBy(xpath = TEST_STRIPS_XPATH)
	public WebElement testStrips;

	@FindBy(xpath = TEST_STRIPS_RESULT_XPATH)
	public WebElement testStripsResult;

	public AmMedicalGroupTestStrips productsClick() {
		products.click();
		return new AmMedicalGroupTestStrips(this.driver);
	}

	public AmMedicalGroupTestStrips testStripsClick() {
		testStrips.click();
		return new AmMedicalGroupTestStrips(this.driver);

	}

}
