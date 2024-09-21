package com.adactinHotelPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IPT_Project.BaseClass;
import com.POM_ManagerFile.POM_PageObjectManager;
import com.interfaceValues.searchHotelPageElements;

public class searchHotelPagePOM extends BaseClass implements searchHotelPageElements{
	
	static WebDriver driver;
	
		@FindBy (id = location_id)
		private WebElement location;
	
		@FindBy(id = hotels_id )
        private WebElement hotels;
		
		@FindBy (id = roomType_id)
		private WebElement roomType;
		
		@FindBy (id = noOfRooms_id)
		private WebElement noOfRooms;
		
		@FindBy (name = checkInDate_name)
		private WebElement checkInDate;
		
		@FindBy (name = checkOutDate_name )
		private WebElement checkOutDate;
		
		@FindBy (name = adultsPerRoom_name)
		private WebElement adultPerRoom ;
		
		@FindBy (name = childPerRoom_name)
		private WebElement childPerRoom;
		
		@FindBy (name = searchBtn_name)
		private WebElement searchBtn;
		
		public void getSearchHotelPageManager() {
		
		POM_PageObjectManager manager = new POM_PageObjectManager();
		
		dropDown(driver, location, "value" , manager.getConfigReader().getLocation());
		dropDown(driver, hotels, "value" , manager.getConfigReader().getHotel());
		dropDown(driver, roomType, "value" , manager.getConfigReader().getRoomType());
		dropDown(driver, noOfRooms, "value", manager.getConfigReader().getNoOfRooms());
		dropDown(driver, adultPerRoom, "value" , manager.getConfigReader().getAdultPerRoom());
		dropDown(driver, childPerRoom, "value" , manager.getConfigReader().getChildPerRoom());
		click(driver, searchBtn);
		
		}
	
		public searchHotelPagePOM (WebDriver driver) {
			
			this.driver = driver;
			
			PageFactory.initElements(driver , this);
		}
}
	

