package com.web365.ammedicalgroup.page.products;

import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupBloodPressureMoniters extends AmMedicalGroupBasePage {
	
	public AmMedicalGroupBloodPressureMoniters(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = PRODUCTS_XPATH)
	public WebElement products;

	@FindBy(xpath = BLOOD_PRESSURE_MONITER_XPATH)
	public WebElement bloodPressureMonitors;

	@FindBy(xpath = BLOOD_PRESSURE_MONITER_RESULT_XPATH)
	public WebElement bloodPressureMonitorsResult;

	public AmMedicalGroupBloodPressureMoniters productsClick() {
		products.click();
		return new AmMedicalGroupBloodPressureMoniters(this.driver);
	}

	public AmMedicalGroupBloodPressureMoniters bloodPressureMonitorsClick() {
		bloodPressureMonitors.click();
		return new AmMedicalGroupBloodPressureMoniters(this.driver);

	}



}
