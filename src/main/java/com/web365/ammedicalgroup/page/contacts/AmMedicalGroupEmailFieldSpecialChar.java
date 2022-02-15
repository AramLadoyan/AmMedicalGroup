package com.web365.ammedicalgroup.page.contacts;

import static com.web365.ammedicalgroup.page.contacts.AmMedicalGroupContactsPageConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupEmailFieldSpecialChar extends AmMedicalGroupBasePage {
	
	public AmMedicalGroupEmailFieldSpecialChar(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = CONTACTS_XPATH)
	public WebElement contacts;

	@FindBy(xpath = EMAIL_FIELD_XPATH)
	public WebElement emailField;
	
	@FindBy(xpath = EMAIL_FIELD_SPECIAL_CHAR_RESULT_XPATH)
	public WebElement emailfieldResult;

	public AmMedicalGroupEmailFieldSpecialChar contactsClick() {
		contacts.click();
		return new AmMedicalGroupEmailFieldSpecialChar(this.driver);
    }

	public AmMedicalGroupEmailFieldSpecialChar emailFieldClick() {
		emailField.click();
		return new AmMedicalGroupEmailFieldSpecialChar(this.driver);
	}
	
	public AmMedicalGroupEmailFieldSpecialChar emailFieldType() {
		emailField.sendKeys("aramladoyan@yahoo.com");
		return new AmMedicalGroupEmailFieldSpecialChar(this.driver);
	}

}
