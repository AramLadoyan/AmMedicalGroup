package com.web365.ammedicalgroup.page.contacts;

import static com.web365.ammedicalgroup.page.contacts.AmMedicalGroupContactsPageConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.ammedicalgroup.page.base.AmMedicalGroupBasePage;

public class AmMedicalGroupNameFieldLetters extends AmMedicalGroupBasePage {

	public AmMedicalGroupNameFieldLetters(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = CONTACTS_XPATH)
	public WebElement contacts;

	@FindBy(xpath = NAME_FIELD_XPATH)
	public WebElement namefield;
	
	@FindBy(xpath = NAME_FIELD_LETTERS_RESULT_XPATH)
	public WebElement nameFieldResult;

	public AmMedicalGroupNameFieldLetters contactsClick() {
		contacts.click();
		return new AmMedicalGroupNameFieldLetters(this.driver);
    }

	public AmMedicalGroupNameFieldLetters namefieldClick() {
		namefield.click();
		return new AmMedicalGroupNameFieldLetters(this.driver);
	}
	
	public AmMedicalGroupNameFieldLetters namefieldType() {
		namefield.sendKeys("Aram");
		return new AmMedicalGroupNameFieldLetters(this.driver);
	}
}
