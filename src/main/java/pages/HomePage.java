package pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath="//span[text()='City, University or Property']")
	WebElement searchBar;
	
	@FindBy(xpath="//div[@class='amber-Grid-col amber-1m4a98c'][1]")
	WebElement london;
	
	@FindBy(xpath="//img[@alt='flag-uk']")
	WebElement uk;
	
	@FindBy(xpath="//img[@alt='flag-aus']")
	WebElement aus;
	
	@FindBy(xpath="//img[@alt='flag-ire']")
	WebElement ire;
	
	@FindBy(xpath="//img[@alt='flag-usa']")
	WebElement usa;
	
	@FindBy(xpath="//img[@alt='flag-can']")
	WebElement can;
	
	@FindBy(xpath="//img[@alt='flag-ger']")
	WebElement ger;
	
	@FindBy(xpath="//img[@alt='flag-esp']")
	WebElement esp;
	
	
	
	

	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}
	
	/*
	 * This method click on "London" and return the "Result Page"
	 */
	public ResultPage clickOnLondon() throws IOException {
		london.click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String currentWindwos = it.next();
		String newWindow = it.next();
		
		driver.switchTo().window(newWindow);
	    return new ResultPage();
		
	}
	
	public String ukCountryTab() {
		searchBar.click();
		String ukCountries ="";
		uk.click();
		List<WebElement> uk = driver.findElements(By.xpath("//div[@class='amber-Tabs-panel amber-qyby9e']/section/div[2]"));
		for(int i=0; i<uk.size(); i++) {
			ukCountries = uk.get(i).getText();
			System.out.println(ukCountries);
		}
		return ukCountries;
		}
	
	public String ausCountryTab() {
		String ausCountries ="";
		aus.click();
		List<WebElement> uk = driver.findElements(By.xpath("//div[@class='amber-Tabs-panel amber-qyby9e']/section/div[2]"));
		for(int i=0; i<uk.size(); i++) {
			ausCountries = uk.get(i).getText();
			System.out.println(ausCountries);
		}
		return ausCountries;
		}
	
	public String ireCountryTab() {
		String ireCountries ="";
		ire.click();
		List<WebElement> uk = driver.findElements(By.xpath("//div[@class='amber-Tabs-panel amber-qyby9e']/section/div[2]"));
		for(int i=0; i<uk.size(); i++) {
			ireCountries = uk.get(i).getText();
			System.out.println(ireCountries);
		}
		return ireCountries;
		}
	
	public String usaCountryTab() {
		String usaCountries ="";
		usa.click();
		List<WebElement> uk = driver.findElements(By.xpath("//div[@class='amber-Tabs-panel amber-qyby9e']/section/div[2]"));
		for(int i=0; i<uk.size(); i++) {
			usaCountries = uk.get(i).getText();
			System.out.println(usaCountries);
		}
		return usaCountries;
		}
	
	public String canCountryTab() {
		String canCountries ="";
		can.click();
		List<WebElement> uk = driver.findElements(By.xpath("//div[@class='amber-Tabs-panel amber-qyby9e']/section/div[2]"));
		for(int i=0; i<uk.size(); i++) {
			canCountries = uk.get(i).getText();
			System.out.println(canCountries);
		}
		return canCountries;
		}
	
	public String gerCountryTab() {
		String gerCountries ="";
		ger.click();
		List<WebElement> uk = driver.findElements(By.xpath("//div[@class='amber-Tabs-panel amber-qyby9e']/section/div[2]"));
		for(int i=0; i<uk.size(); i++) {
			gerCountries = uk.get(i).getText();
			System.out.println(gerCountries);
		}
		return gerCountries;
		}
	
	public String espCountryTab() {
		String espCountries ="";
		esp.click();
		List<WebElement> uk = driver.findElements(By.xpath("//div[@class='amber-Tabs-panel amber-qyby9e']/section/div[2]"));
		for(int i=0; i<uk.size(); i++) {
			espCountries = uk.get(i).getText();
			System.out.println(espCountries);
		}
		return espCountries;
		}

	
}
