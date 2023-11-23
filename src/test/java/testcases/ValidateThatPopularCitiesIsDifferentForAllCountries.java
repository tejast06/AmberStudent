package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;


public class ValidateThatPopularCitiesIsDifferentForAllCountries extends BaseClass {
	
	public HomePage homePage;

	public ValidateThatPopularCitiesIsDifferentForAllCountries() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeTest
	public void launchBrowser() throws IOException {
		initialization();
		homePage = new HomePage();
		}
	
	@Test
	public void test() {
		
		//validation of UK's cities with other cities
		String uk = homePage.ukCountryTab();
		String aus1 = homePage.ausCountryTab();
		String ire1 = homePage.ireCountryTab();
		String usa1 = homePage.usaCountryTab();
		String can1 = homePage.canCountryTab();
		String ger1 = homePage.gerCountryTab();
		String esp1 = homePage.espCountryTab();
		Assert.assertNotEquals(uk, aus1);
		Assert.assertNotEquals(uk, ire1);
		Assert.assertNotEquals(uk, usa1);
		Assert.assertNotEquals(uk, can1);
		Assert.assertNotEquals(uk, ger1);
		Assert.assertNotEquals(uk, esp1);
		
		
		//validation of Australia's cities with other countire's cities
		String aus2 = homePage.ausCountryTab();
		String ire2 = homePage.ireCountryTab();
		String usa2 = homePage.usaCountryTab();
		String can2 = homePage.canCountryTab();
		String ger2 = homePage.gerCountryTab();
		String esp2 = homePage.espCountryTab();
		Assert.assertNotEquals(aus2, ire2);
		Assert.assertNotEquals(aus2, usa2);
		Assert.assertNotEquals(aus2, can2);
		Assert.assertNotEquals(aus2, ger2);
		Assert.assertNotEquals(aus2, esp2);
		
		
		//validation of Ireland's cities with other countire's cities
		String ire3 = homePage.ireCountryTab();
		String usa3 = homePage.usaCountryTab();
		String can3 = homePage.canCountryTab();
		String ger3 = homePage.gerCountryTab();
		String esp3 = homePage.espCountryTab();
		Assert.assertNotEquals(ire3, usa3);
		Assert.assertNotEquals(ire3, can3);
		Assert.assertNotEquals(ire3, ger3);
		Assert.assertNotEquals(ire3, esp3);
		
		
		//validation of USA cities with other countrie's cities
		String usa4 = homePage.usaCountryTab();
		String can4 = homePage.canCountryTab();
		String ger4 = homePage.gerCountryTab();
		String esp4 = homePage.espCountryTab();
		Assert.assertNotEquals(usa4, can4);
		Assert.assertNotEquals(usa4, ger4);
		Assert.assertNotEquals(usa4, esp4);
		
		//validation of Canada's cities with other countries's cities
		String can5 = homePage.canCountryTab();
		String ger5 = homePage.gerCountryTab();
		String esp5 = homePage.espCountryTab();
		Assert.assertNotEquals(can5, ger5);
		Assert.assertNotEquals(can5, esp5);
		
		//validation of German's cities with other countries's cities
		String ger6 = homePage.gerCountryTab();
		String esp6 = homePage.espCountryTab();
		Assert.assertNotEquals(ger6, esp6);
		}

}
