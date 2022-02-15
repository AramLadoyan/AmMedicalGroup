package com.web365.ammedicalgroup.page.products;

import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupGloves extends AmMedicalGroupBasePage {
	
		public AmMedicalGroupGloves(WebDriver driver) {
			super(driver);
			this.driver = driver;
		}

		@FindBy(xpath = PRODUCTS_XPATH)
		public WebElement products;

		@FindBy(xpath = GLOVES_XPATH)
		public WebElement gloves;

		@FindBy(xpath = GLOVES_RESULT_XPATH)
		public WebElement glovesResult;

		public AmMedicalGroupGloves productsClick() {
			products.click();
			return new AmMedicalGroupGloves(this.driver);
		}

		public AmMedicalGroupGloves glovesClick() {
			gloves.click();
			return new AmMedicalGroupGloves(this.driver);

		}

}
