package com.crm.Actitime.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tasklink;
	
	
	@FindBy(xpath = "//div[.='Reports']")
	private WebElement reportslink;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}


	public WebElement getTasklink() {
		return tasklink;
	}


	public WebElement getReportslink() {
		return reportslink;
	}
	
//	public void clickontask() {
//		tasklink.click();
//	}
	

}
