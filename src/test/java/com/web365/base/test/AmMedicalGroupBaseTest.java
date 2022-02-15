package com.web365.base.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class AmMedicalGroupBaseTest {
	
	protected WebDriver driver;
	@BeforeClass
	public void openBrowser () {
		driver = new ChromeDriver();
		driver.get("http://www.ammedicalgroup.am/Home/Index?l=en-US");
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
}
