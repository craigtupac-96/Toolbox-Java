package org.seleniumhq.pageObjects;

import org.openqa.selenium.WebDriver;

public class BasePage {

	private WebDriver driver;
	protected String baseUrl = "http://www.seleniumhq.org/";
	
	/**
	 * Instantiates a new Base Page Object
	 * @param driver - the driver is passed in from the test
	 * which calls the method
	 */
	public BasePage(WebDriver driver) {
		this.driver = driver;
		setDriver(this.driver);
	}
	
	/**
	 * Sets the driver.
	 * @param driver the new driver
	 */
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * Gets the WebDriver
	 * @return the driver
	 */
	public WebDriver getDriver() {
		return driver;
	}
}
