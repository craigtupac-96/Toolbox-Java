package org.seleniumhq.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectsPage extends HomePage {
	
	public String strHeadingMainContentProjects = "Selenium Projects";

	public ProjectsPage(WebDriver driver) {
		super(driver);
	}
	
	// dont use xpaths - for this tutorial the use of xpath is neccesary
	@FindBy(xpath="//*[@id='mainContent']/h2")
	private WebElement elementHeadingMainContentProjects;

	public String getHeadingMainContentProjectsText() {
		return elementHeadingMainContentProjects.getText();
	}
}
