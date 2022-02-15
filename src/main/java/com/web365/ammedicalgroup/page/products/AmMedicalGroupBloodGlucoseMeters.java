package com.web365.ammedicalgroup.page.products;

import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupBloodGlucoseMeters extends AmMedicalGroupBasePage {
	
	public AmMedicalGroupBloodGlucoseMeters(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = PRODUCTS_XPATH)
	public WebElement products;

	@FindBy(xpath = BLOOD_GLUCOSE_METERS_XPATH)
	public WebElement bloodGlucoseMeters;

	@FindBy(xpath = BLOOD_GLUCOSE_METERS_RESULT_XPATH)
	public WebElement bloodGlucoseMetersResult;

	public AmMedicalGroupBloodGlucoseMeters productsClick() {
		products.click();
		return new AmMedicalGroupBloodGlucoseMeters(this.driver);
	}

	public AmMedicalGroupBloodGlucoseMeters bloodGlucoseMetersClick() {
		bloodGlucoseMeters.click();
		return new AmMedicalGroupBloodGlucoseMeters(this.driver);

	}


}
