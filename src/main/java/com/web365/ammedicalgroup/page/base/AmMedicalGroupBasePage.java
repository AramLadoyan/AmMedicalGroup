package com.web365.ammedicalgroup.page.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AmMedicalGroupBasePage {
	
	protected WebDriver driver;
	
	public AmMedicalGroupBasePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver,this);
	}

}