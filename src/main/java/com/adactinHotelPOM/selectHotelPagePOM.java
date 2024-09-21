package com.adactinHotelPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.IPT_Project.BaseClass;
import com.POM_ManagerFile.POM_PageObjectManager;
import com.interfaceValues.selectHotelPageElements;

public class selectHotelPagePOM extends BaseClass implements selectHotelPageElements{
	

 	public selectHotelPagePOM (WebDriver driver) {
 		
 		this.driver = driver;
 		
 		PageFactory.initElements(driver, this);
 	}
	
	static WebDriver driver;
	
	@FindBy (id = select_id)
	private WebElement Select;
	
	@FindBy ( id = Continue_id)
	private WebElement Continue;

	public void getSelectHotelPageManager() {
	
	POM_PageObjectManager manager = new POM_PageObjectManager();
	
	click(driver, Select);
	click(driver, Continue);

	}
}	
