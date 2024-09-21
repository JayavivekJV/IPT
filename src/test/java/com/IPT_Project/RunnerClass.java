package com.IPT_Project;

import com.POM_ManagerFile.POM_PageObjectManager;
import com.adactinHotelPOM.LoginPagePOM;
import com.adactinHotelPOM.searchHotelPagePOM;
import com.helper.configReader;


public class RunnerClass extends BaseClass {
		
	public static void main(String[] args) {
		
		configReader cr = new configReader();
		
		browserLaunch( cr.getBrowserName());
		
		urlLaunch(cr.getUrl());
		
//		LoginPagePOM lpp = new LoginPagePOM(driver);	
//		searchHotelPagePOM spp = new searchHotelPagePOM(driver);	
//		keys(driver, lpp.getUsername(), cr.getUserName());	
//		keys(driver, lpp.getPassword(), cr.getPassword());	
//		click(driver, lpp.getLogin_btn());	
		POM_PageObjectManager manager = new POM_PageObjectManager();
		
		manager.getLoginPagePom().getLoginPageManager();	
//		dropDown(driver, spp.getLocation() ,"value", cr.getLocation());
//		dropDown(driver, spp.getHotels(), "value", cr.getHotel());
//		dropDown(driver, spp.getRoomType(), "value", cr.getRoomType());
//		dropDown(driver, spp.getNoOfRooms(), "value", cr.getNoOfRooms());
//		dropDown(driver, spp.getAdultPerRoom(), "value", cr.getAdultPerRoom());
//		dropDown(driver, spp.getChildPerRoom(), "value", cr.getChildPerRoom());
//		click(driver, spp.getSearchBtn());
		manager.getSearchHotelPagePOM().getSearchHotelPageManager();
		
		manager.getSelectHotelPagePOM().getSelectHotelPageManager();
		
		manager.getBookHotelPagePOM().getBookHotelPageManager();
		
		manager.getLogOutPagePOM().getLogOutPageManager();
		
		quit(driver);
		
	}
	
	
}
