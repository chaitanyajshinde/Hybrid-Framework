package com.crm.Actitime.GenericLabrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.crm.Actitime.objectrepository.Loginpage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	ReadtheDataFromProperty rp = new ReadtheDataFromProperty();
	public static WebDriver driver;
	@BeforeSuite
	public void databaseconnected() {
		Reporter.log("database is connected",true);
	}
	@AfterSuite
	public void databasedisconnected() {
		Reporter.log("database is disconnected",true);
	}
	@BeforeClass
	public void launchthebrowser() throws IOException {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String URL =rp.readdatafromproperty("url");
		driver.get(URL);
	}
	@AfterClass
	public void closethebrowser() {
		driver.close();
		
	}
	@BeforeMethod
	public void login() throws IOException {
		String UN=rp.readdatafromproperty("username");
		String pwd=rp.readdatafromproperty("password");
		Loginpage lp = new Loginpage(driver);
		lp.LogintoActitime(UN, pwd);
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.id("logoutLink")).click();
	}
	
	
	
}

	



