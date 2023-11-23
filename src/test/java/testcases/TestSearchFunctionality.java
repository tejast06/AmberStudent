package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.ResultPage;

public class TestSearchFunctionality extends BaseClass {
	
	public HomePage homePage;
	public ResultPage resultPage;

	public TestSearchFunctionality() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeTest
	public void launchBrowser() throws IOException {
		initialization();
		homePage = new HomePage();
		resultPage = new ResultPage();
	}
	
	@Test(priority = 1)
	public void validateSearchFunctionality() throws IOException, InterruptedException {
	    resultPage = homePage.clickOnLondon();
		resultPage.clickOnMoreFilter();
	}
	
	@Test(priority = 2)
	public void validateTitleAndLocationOfProperty() {
		String actualTitle = resultPage.validateTitleOfTheProperty();
		Assert.assertEquals(actualTitle, "Station Court, London");
		
		String actualLocation = resultPage.validateLocationOfTheProperty();
		Assert.assertEquals(actualLocation, "High Rd, London");
	}
	
	@AfterTest
	public void closeTheBrowser() {
		driver.quit();
	}

}
