package com.web365.ammedicalgroup.page.home;

import static com.web365.ammedicalgroup.page.home.AmMedicalGroupHomePageConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupLogoIcon extends AmMedicalGroupBasePage {

	public AmMedicalGroupLogoIcon(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = PRODUCTS_XPATH)
	public WebElement products;

	@FindBy(xpath = LOGO_ICON_XPATH)
	public WebElement logoIcon;
	
	@FindBy(xpath = HOME_RESULT_XPATH)
	public WebElement homeResult;

	public AmMedicalGroupLogoIcon productsClick() {
		products.click();
		return new AmMedicalGroupLogoIcon(this.driver);

	}

	public AmMedicalGroupLogoIcon logoIconClick() {
		logoIcon.click();
		return new AmMedicalGroupLogoIcon(this.driver);
	}

}
