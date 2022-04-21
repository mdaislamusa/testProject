package com.basepage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoGuru99PageObjectModel {

	public DemoGuru99PageObjectModel(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@name='userName']")
	private WebElement EnterUserName;

	@FindBy(xpath = "//*[@name='password']")
	private WebElement EnterPassword;

	@FindBy(xpath = "//*[@name='submit']")
	private WebElement ClickSubmitLogin;

	@FindBy(xpath = "//*[contains(text(),'Login Successfully')]")
	private WebElement LoginSuccessMsg;

	@FindBy(xpath = "//*[contains(text(),'SIGN-OFF')]")
	private WebElement Sign_OffButton;

	@FindBy(xpath = "//a[@href='reservation.php']")
	private WebElement ClickFlightButton;

	@FindBy(xpath = "(//*[@type='radio'])[1]")
	private WebElement TripTypeRadio;

	@FindBy(xpath = "//*[@type='radio']")
	private List<WebElement> ListTripTypeRadio_1;

	@FindBy(xpath = "//*[@name='passCount']")
	private WebElement SelectPassengers;

	@FindBy(xpath = "//*[@name='fromPort']")
	private WebElement SelectDeptPort;

	@FindBy(xpath = "//*[@name='fromMonth']")
	private WebElement SelectDepartMonth;

	@FindBy(xpath = "//*[@name='fromDay']")
	private WebElement SelectDepartDay;

	@FindBy(xpath = "//*[@name='toPort']")
	private WebElement SelectArrivePort;

	@FindBy(xpath = "//*[@name='toMonth']")
	private WebElement SelectReturnMonth;

	@FindBy(xpath = "//*[@name='toDay']")
	private WebElement SelectReturnDay;

	@FindBy(xpath = "(//*[@name='servClass'])[3]")
	private WebElement ServiceCoachRadio;

	@FindBy(xpath = "//*[@name='servClass']")
	private WebElement ServiceCoachRadioList_3;

	@FindBy(xpath = "//*[@name='airline']")
	private WebElement SelectAirline;

	@FindBy(xpath = "//*[@name='findFlights']")
	private WebElement FindFlights;

	public WebElement getEnterUserName() {
		return EnterUserName;
	}

	public WebElement getEnterPassword() {
		return EnterPassword;
	}

	public WebElement getClickSubmitLogin() {
		return ClickSubmitLogin;
	}

	public WebElement getLoginSuccessMsg() {
		return LoginSuccessMsg;
	}

	public WebElement getSign_OffButton() {
		return Sign_OffButton;
	}

	public WebElement getClickFlightButton() {
		return ClickFlightButton;
	}

	public WebElement getTripTypeRadio() {
		return TripTypeRadio;
	}

	public List<WebElement> getListTripTypeRadio_1() {
		return ListTripTypeRadio_1;
	}

	public WebElement getSelectPassengers() {
		return SelectPassengers;
	}

	public WebElement getSelectDeptPort() {
		return SelectDeptPort;
	}

	public WebElement getSelectDepartMonth() {
		return SelectDepartMonth;
	}

	public WebElement getSelectDepartDay() {
		return SelectDepartDay;
	}

	public WebElement getSelectArrivePort() {
		return SelectArrivePort;
	}

	public WebElement getSelectReturnMonth() {
		return SelectReturnMonth;
	}

	public WebElement getSelectReturnDay() {
		return SelectReturnDay;
	}

	public WebElement getServiceCoachRadio() {
		return ServiceCoachRadio;
	}

	public WebElement getServiceCoachRadioList_3() {
		return ServiceCoachRadioList_3;
	}

	public WebElement getSelectAirline() {
		return SelectAirline;
	}

	public WebElement getFindFlights() {
		return FindFlights;
	}

}
