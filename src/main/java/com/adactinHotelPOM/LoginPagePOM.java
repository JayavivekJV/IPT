package com.adactinHotelPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IPT_Project.BaseClass;
import com.POM_ManagerFile.POM_PageObjectManager;
import com.interfaceValues.LoginPageElements;

public class LoginPagePOM extends BaseClass implements LoginPageElements{
	
	static WebDriver driver;
	
	@FindBy (name = username_name)
	private WebElement username;
	
	@FindBy (name = password_name )
	private WebElement password;
	
	@FindBy (name = loginbutton_name)
    private WebElement login_btn;
//	public WebElement getUsername() {
//		return username;
//	}
//	public WebElement getPassword() {
//		return password;
//	}
//	public WebElement getLogin_btn() {
//		return login_btn;
//	}
public 	LoginPagePOM (WebDriver driver) {
	
	this.driver = driver;
	
	PageFactory.initElements(driver , this);
}
public void getLoginPageManager() {
	
	POM_PageObjectManager manager = new POM_PageObjectManager();
	
	keys(driver, username, manager.getConfigReader().getUserName());
	
	keys(driver, password, manager.getConfigReader().getPassword());
	
	click(driver, login_btn);
}





}
