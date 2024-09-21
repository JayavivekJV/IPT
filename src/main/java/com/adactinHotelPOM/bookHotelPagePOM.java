package com.adactinHotelPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IPT_Project.BaseClass;
import com.POM_ManagerFile.POM_PageObjectManager;
import com.interfaceValues.bookHotelPageElements;

public class bookHotelPagePOM extends BaseClass implements bookHotelPageElements{
	
public bookHotelPagePOM (WebDriver driver) {
 		
 		this.driver = driver;
 		
 		PageFactory.initElements(driver, this);
 	}

	static  WebDriver driver;
	
	@FindBy (id = firstName_id)
	private WebElement firstName;
	
	@FindBy (id = lastName_id)
	private WebElement lastName;
	
	@FindBy (id = billingAddress_id)
	private WebElement billingAddress;
	
	@FindBy (id = creditCardNo_id)
	private WebElement creditCardNo;
	
	@FindBy (id = creditCardType_id)
	private WebElement creditCardType;
	
	@FindBy (id = expiryDateMonth_id)
	private WebElement expiryDateMonth;
	
	@FindBy (id = expiryDateYear_id)
	private WebElement expiryDateYear;
	
	@FindBy (id = cvvNumber_id)
	private WebElement cvvNumber;
	
	@FindBy (id = bookNow_id)
	private WebElement bookNow;
	
	public void getBookHotelPageManager() {
		
		POM_PageObjectManager manager = new POM_PageObjectManager();
		
		keys(driver, firstName, manager.getConfigReader().getFirstName());
		keys(driver, lastName, manager.getConfigReader().getLastName());
		keys(driver, billingAddress, manager.getConfigReader().getBillingAddress());
		keys(driver, creditCardNo, manager.getConfigReader().getCreditCardNo());
		dropDown(driver, creditCardType, "value", manager.getConfigReader().getCreditCardType());
		dropDown(driver, expiryDateMonth, "value", manager.getConfigReader().getExpiryDateMonth());
		dropDown(driver, expiryDateYear, "value", manager.getConfigReader().getExpiryDateYear());
		keys(driver, cvvNumber, manager.getConfigReader().getCvvNumber());
		click(driver, bookNow);
	}
	
	
	
}

