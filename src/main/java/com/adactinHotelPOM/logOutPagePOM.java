package com.adactinHotelPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IPT_Project.BaseClass;
import com.POM_ManagerFile.POM_PageObjectManager;
import com.interfaceValues.logOutPageElements;

public class logOutPagePOM extends BaseClass implements logOutPageElements {
	
public logOutPagePOM (WebDriver driver) {
 		
 		this.driver = driver;
 		
 		PageFactory.initElements(driver, this);
 	}

	static  WebDriver driver;
	
	@FindBy (xpath = logOut_xpath)
	private WebElement logOut;
	
	public void getLogOutPageManager() {
		
		POM_PageObjectManager manager = new POM_PageObjectManager();
		
		implicitWait(driver, 30);
		
		click(driver, logOut);
	}

}
