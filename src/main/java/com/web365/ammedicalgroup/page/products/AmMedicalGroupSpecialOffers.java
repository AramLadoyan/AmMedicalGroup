package com.web365.ammedicalgroup.page.products;

import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupSpecialOffers extends AmMedicalGroupBasePage {
	
	public AmMedicalGroupSpecialOffers(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = PRODUCTS_XPATH)
	public WebElement products;

	@FindBy(xpath = SPECIAL_OFFERS_XPATH)
	public WebElement specialOffers;

	@FindBy(xpath = SPECIAL_OFFERS_RESULT_XPATH)
	public WebElement specialOffersResult;

	public AmMedicalGroupSpecialOffers productsClick() {
		products.click();
		return new AmMedicalGroupSpecialOffers(this.driver);
	}

	public AmMedicalGroupSpecialOffers specialOffersClick() {
		specialOffers.click();
		return new AmMedicalGroupSpecialOffers(this.driver);

	}


}
