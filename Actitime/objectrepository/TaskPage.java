package com.crm.Actitime.objectrepository;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Actitime.GenericLabrary.Excelfile;

public class TaskPage {
	@FindBy(xpath="//div[.='Add New']")
	private WebElement Addnewbtn;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement NewCustbtn;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement CustName;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement Descrip;
	
	@FindBy(xpath="(//div[.='- Select Customer -'])[2]")
	private WebElement dropdown;
	
	@FindBy(xpath="//div[.='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement OurCompany;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement Createbtn;
	
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}

	public WebElement getAddnewbtn() {
		return Addnewbtn;
	}

	public WebElement getNewCustbtn() {
		return NewCustbtn;
	}

	public WebElement getCustName() {
		return CustName;
	}

	public WebElement getDescrip() {
		return Descrip;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getOurCompany() {
		return OurCompany;
	}

	public WebElement getCreatebtn() {
		return Createbtn;
	}
	
	//business logic
	
	public void CreateCust() throws InterruptedException, EncryptedDocumentException, IOException {
		Addnewbtn.click();
		NewCustbtn.click();
		Excelfile ef = new Excelfile();
		String custname = ef.excel("Sheet1", 1, 1);
		CustName.sendKeys(custname);
		String descrip = ef.excel("Sheet1", 1, 2);
		Descrip.sendKeys(descrip);
		dropdown.click();
		Thread.sleep(3000);
		OurCompany.click();
		Createbtn.click();
		
		
	}
	
	
	
	
	

}
