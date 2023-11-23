package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class ResultPage extends BaseClass {
	
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[4]/div[1]/span[1]")
	WebElement moreFilter;
	
	@FindBy(xpath="//input[@value='private_room']")
	WebElement pvtRoom;
	
	@FindBy(xpath="//input[@value='private_bathroom']")
	WebElement pvtBathroom;
	
	@FindBy(xpath="//div[@class='amber-Grid-col amber-1vbm1jp']/following::button")
	WebElement showResult;

	public ResultPage() throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}
	
	
	
	/*
	 * This method click on more filter, then click on pvt room, pvt bathroom and click on show result
	 */
	public void clickOnMoreFilter() throws InterruptedException {
		moreFilter.click();
		pvtRoom.click();
		pvtBathroom.click();
		showResult.click();
	}
	
	
	/*
	 * This method return the string
	 * 
	 */
	public String validateTitleOfTheProperty() {
		String title = driver.findElement(By.xpath("//div[@class='amber-1u1u4a5']/div[1]/a[1]/h2[text()='Station Court, London']")).getText();
	     return title; 
	}
	
	public String validateLocationOfTheProperty() {
	String location = 	driver.findElement(By.xpath("//div[@class='amber-Group-root amber-1mlewhq']/div[text()='High Rd, London']")).getText();
	return location;
	}
	
	

}
