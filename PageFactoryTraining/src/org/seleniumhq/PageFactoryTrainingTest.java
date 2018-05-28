package org.seleniumhq;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.seleniumhq.pageObjects.HomePage;
import org.seleniumhq.pageObjects.ProjectsPage;

public class PageFactoryTrainingTest extends SeleniumTestBase {
	HomePage homePage;
	
	@Before
	public void setUp() {
		super.setUp();
		homePage = new HomePage(super.getDriver());
	}

	@After
	public void tearDown() throws Exception {
		getDriver().quit();
	}

	@Test
	public void test() {
		homePage = homePage.getHomePage();
		
		Assert.assertTrue(homePage.getHeadingMainContentText().equals(homePage.strHeadingMainContent));
		
		ProjectsPage projectsPage = homePage.getProjectsPage();
		
		Assert.assertTrue(projectsPage.getHeadingMainContentProjectsText().equals(projectsPage.strHeadingMainContentProjects));
	}

}
