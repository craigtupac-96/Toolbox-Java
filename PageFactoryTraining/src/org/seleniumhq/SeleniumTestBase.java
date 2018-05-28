package org.seleniumhq;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class SeleniumTestBase {
	
	WebDriver driver;
	
	
	protected void setUp() {
		driver = new ChromeDriver();		
	}
	
	public WebDriver getDriver() {
		return driver;
	}

}
