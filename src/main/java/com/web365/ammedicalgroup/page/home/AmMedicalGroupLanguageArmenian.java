package com.web365.ammedicalgroup.page.home;

import static com.web365.ammedicalgroup.page.home.AmMedicalGroupHomePageConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupLanguageArmenian extends AmMedicalGroupBasePage {

	public AmMedicalGroupLanguageArmenian(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = ARMENIAN_XPATH)
	public WebElement armenian;

	@FindBy(xpath = ARMENAIN_RESULT_XPATH)
	public WebElement armenianResult;

	public AmMedicalGroupLanguageArmenian armenianClick() {
		armenian.click();
		return new AmMedicalGroupLanguageArmenian(this.driver);

	}

}
