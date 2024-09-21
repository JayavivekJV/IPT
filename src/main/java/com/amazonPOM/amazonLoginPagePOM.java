package com.amazonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.IPT_Project.BaseClass;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class amazonLoginPagePOM extends BaseClass {
	
	public WebDriver driver;
	
	@FindBy(id = "nav-link-accountList")
	private WebElement signInBtn;
	
	@FindBy (xpath = "//input[@type='email']")
	private WebElement emailId;
	
	@FindBy ( xpath = "//input[@id='continue']")
	private WebElement continueBtn;
	
	@FindBy ( xpath = "//div[contains(text(),'Enter your email')]")
	private WebElement emptyEmail;
	
	@FindBy ( xpath = "//div[contains(text(),'Enter a valid email address')]")
	private WebElement wrongEmail;
	
	@FindBy ( xpath = "//input[@id='ap_password']")
	private WebElement password;
	
	@FindBy ( xpath = "//input[@id='signInSubmit']")
	private WebElement signInBtn1;
	
	@FindBy (xpath = "//div[contains(text(),'Enter your pass')]")
	private WebElement emptyPassword;
	
	@FindBy (xpath = "//span[contains(text(),'Your password is in')]")
	private WebElement wrongPassword;
	
	public amazonLoginPagePOM(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public Boolean validLogin(ExtentTest extentTest ) {
		
		try {
			urlLaunch("https://www.amazon.in/");
			click(driver, signInBtn);
			keys(driver, emailId, "jayavivek879@gmail.com");
			click(driver, continueBtn);
			keys(driver, password, "jayavivek...");
			click(driver, signInBtn1);
			String title = driver.getTitle();
			Assert.assertEquals(title, "Online Shopping site in India:Shop Online for Mobiles, Books, Watches, Shoes and more-Amazon.in");
			extentTest.log(Status.PASS, "Login Successfull");
		}
		catch (Exception e) {
			extentTest.log(Status.FAIL, "Login Failed");
			return false;
		}
		return true;
	}
	public void invalidMailId() {
		
		urlLaunch("https://www.amazon.in/");
		click(driver, signInBtn);
		keys(driver, emailId, "jayavivek879@gmail");
		click(driver, continueBtn);
		String emailError = driver.getTitle();
		Assert.assertEquals(emailError, "Enter a valid email address or phone number");
	}
	public void invalidPassword() {
		
		urlLaunch("https://www.amazon.in/");
		click(driver, signInBtn);
		keys(driver, emailId, "jayavivek879@gmail.com");
		click(driver, continueBtn);
		keys(driver, password, "jayavivek.");
		click(driver, signInBtn1);
		String textpop = driver.getTitle();
		Assert.assertEquals(textpop, "Incorrect Password");
	}
	public void nullMail(){
		
		urlLaunch("https://www.amazon.in/");
		click(driver, signInBtn);
		click(driver, continueBtn);
		String textpop = driver.getTitle();
		Assert.assertEquals(textpop, "Enter your mobile or phone number");
	}
	public void nullPassword() {
		
		urlLaunch("https://www.amazon.in/");
		click(driver, signInBtn);
		keys(driver, emailId, "jayavivek879@gmail.com");
		click(driver, continueBtn);
		click(driver, signInBtn1);
		String textpop = driver.getTitle();
		Assert.assertEquals(textpop, "Enter your Password");
	}
	
	
}
