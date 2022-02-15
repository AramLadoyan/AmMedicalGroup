package com.web365.ammedicalgroup.page.products;

import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupASCENSIADiabetesCare extends AmMedicalGroupBasePage {
	
	public AmMedicalGroupASCENSIADiabetesCare(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = PRODUCTS_XPATH)
	public WebElement products;

	@FindBy(xpath = ASCENSIA_DIABETES_CARE_XPATH)
	public WebElement ascensiaDiabetesCare;

	@FindBy(xpath = ASCENSIA_DIABETES_CARE_RESULT_XPATH)
	public WebElement ascensiaDiabetesCareResult;

	public AmMedicalGroupASCENSIADiabetesCare productsClick() {
		products.click();
		return new AmMedicalGroupASCENSIADiabetesCare(this.driver);
	}

	public AmMedicalGroupASCENSIADiabetesCare ascensiaDiabetesCareClick() {
		ascensiaDiabetesCare.click();
		return new AmMedicalGroupASCENSIADiabetesCare(this.driver);

	}



}
