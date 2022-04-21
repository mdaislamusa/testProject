package com.testng.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.basepage.DemoGuru99PageObjectModel;
import com.util.BaseConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoGuruTestNG {
	
	 WebDriver driver;
	 DemoGuru99PageObjectModel dom;
	 SoftAssert soft;
	
	@BeforeTest
	public void setUP() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	@Test
	public void goFlight() throws Throwable {
driver.navigate().to(BaseConfig.getConfig("URL"));
		
		dom = new DemoGuru99PageObjectModel(driver);
		
		dom.getEnterUserName().sendKeys(BaseConfig.getConfig("User"));
		dom.getEnterPassword().sendKeys(BaseConfig.getConfig("Pass"));
		dom.getClickSubmitLogin().click();
		//((JavascriptExecutor)driver).executeScript("arguments[0].click()", driver.findElement(By.xpath("//*[@name='submit']")));
		
		soft = new SoftAssert();
		soft.assertTrue(dom.getLoginSuccessMsg().isDisplayed());
		dom.getClickFlightButton().click();
		dom.getListTripTypeRadio_1().get(0).sendKeys(BaseConfig.getConfig("TripType"));
		dom.getSelectPassengers().sendKeys(BaseConfig.getConfig("Passengers"));
		dom.getSelectDeptPort().sendKeys(BaseConfig.getConfig("DepartPort"));
		dom.getSelectDepartMonth().sendKeys(BaseConfig.getConfig("DepartMonth"));
		dom.getSelectDepartDay().sendKeys(BaseConfig.getConfig("DepartDay"));
		dom.getSelectArrivePort().sendKeys(BaseConfig.getConfig("ArrivePort"));
		dom.getSelectReturnMonth().sendKeys(BaseConfig.getConfig("ReturnMonth"));
		dom.getSelectReturnDay().sendKeys(BaseConfig.getConfig("ReturnDay"));
		dom.getSelectAirline().sendKeys(BaseConfig.getConfig("ServiceCoach"));
		dom.getSelectAirline().sendKeys(BaseConfig.getConfig("AirLine"));
		dom.getFindFlights().click();
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		soft.assertAll();
	}

}
