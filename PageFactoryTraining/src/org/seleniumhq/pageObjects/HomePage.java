package org.seleniumhq.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	
	public String strHeadingMainContent = "What is Selenium?";
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="menu_projects")
	private WebElement elementTabProjects;

	@FindBy(xpath="//*[@id='mainContent']/h2[1]") // xpath frowned upon, if something changes its bad
	private WebElement elementHeadingMainContent;
	
	@FindBy(id="menu_download")
	private WebElement elementTabDownload;
	
	public HomePage getHomePage() {
		getDriver().get(baseUrl);
		return PageFactory.initElements(getDriver(), HomePage.class);
	}
	
	public String getHeadingMainContentText() {
		return elementHeadingMainContent.getText();
	}
	
	public ProjectsPage getProjectsPage() {
		elementTabProjects.click();
		return PageFactory.initElements(getDriver(), ProjectsPage.class);
	}
	
	public DownloadPage getDownloadPage() {
		elementTabDownload.click();
		return PageFactory.initElements(getDriver(), DownloadPage.class);
	}
	
}
