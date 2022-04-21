package com.test.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import com.basepage.DemoGuru99PageObjectModel;
import com.util.BaseConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoGuruFlightStepDef {

	WebDriver driver;
	DemoGuru99PageObjectModel dom;
	SoftAssert soft;

	@Given("User can open browser")
	public void user_can_open_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@Given("Go to the URL")
	public void go_to_the_url() throws Throwable {
		driver.navigate().to(BaseConfig.getConfig("URL"));
	}

	@When("Enter Username")
	public void enter_username() throws Throwable {
		dom = new DemoGuru99PageObjectModel(driver);

		dom.getEnterUserName().sendKeys(BaseConfig.getConfig("User"));

	}

	@When("Enter Password")
	public void enter_password() throws Throwable {
		dom.getEnterPassword().sendKeys(BaseConfig.getConfig("Pass"));
		dom.getClickSubmitLogin().click();
	}

	@When("LoginSuccess Message should be Visible")
	public void login_success_message_should_be_visible() {
		soft = new SoftAssert();
		soft.assertTrue(dom.getLoginSuccessMsg().isDisplayed());
	}

	@When("Click on Flight Button")
	public void click_on_flight_button() {
		dom.getClickFlightButton().click();
	}

	@When("Book a Flight")
	public void book_a_flight() throws Throwable {
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

	@Then("Close the browser")
	public void close_the_browser() {
		driver.quit();
		soft.assertAll();
	}

}
