package com.web365.ammedicalgroup.page.products;

import static com.web365.ammedicalgroup.page.products.AmMedicalGroupFilterProductsConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupNeedlesForInsulinSyringePen extends AmMedicalGroupBasePage {
	
		public AmMedicalGroupNeedlesForInsulinSyringePen(WebDriver driver) {
			super(driver);
			this.driver = driver;
		}

		@FindBy(xpath = PRODUCTS_XPATH)
		public WebElement products;

		@FindBy(xpath = INSULIN_PEN_XPATH)
		public WebElement insulinPen;

		@FindBy(xpath = INSULIN_PEN_RESULT_XPATH)
		public WebElement insulinPenResult;

		public AmMedicalGroupNeedlesForInsulinSyringePen productsClick() {
			products.click();
			return new AmMedicalGroupNeedlesForInsulinSyringePen(this.driver);
		}

		public AmMedicalGroupNeedlesForInsulinSyringePen insulinPenClick() {
			insulinPen.click();
			return new AmMedicalGroupNeedlesForInsulinSyringePen(this.driver);

		}

}
