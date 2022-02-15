package com.web365.ammedicalgroup.page.home;

import static com.web365.ammedicalgroup.page.home.AmMedicalGroupHomePageConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupLanguageRussian extends AmMedicalGroupBasePage {
	
	public AmMedicalGroupLanguageRussian(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = RUSSIAN_XPATH)
	public WebElement russian;

	@FindBy(xpath = RUSSIAN_RESULT_XPATH)
	public WebElement russianResult;

	public AmMedicalGroupLanguageRussian russianClick() {
		russian.click();
		return new AmMedicalGroupLanguageRussian(this.driver);

	}

}
