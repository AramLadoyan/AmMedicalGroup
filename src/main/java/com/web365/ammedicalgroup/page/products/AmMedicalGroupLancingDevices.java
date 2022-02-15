package com.web365.ammedicalgroup.page.products;

import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupLancingDevices extends AmMedicalGroupBasePage {

	public AmMedicalGroupLancingDevices(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = PRODUCTS_XPATH)
	public WebElement products;

	@FindBy(xpath = LANCING_DEVICES_XPATH)
	public WebElement lancingDevices;

	@FindBy(xpath = LANCING_DEVICES_RESULT_XPATH)
	public WebElement lancingDevicesResult;

	public AmMedicalGroupLancingDevices productsClick() {
		products.click();
		return new AmMedicalGroupLancingDevices(this.driver);
	}

	public AmMedicalGroupLancingDevices lancingDevicesClick() {
		lancingDevices.click();
		return new AmMedicalGroupLancingDevices(this.driver);

	}

}
