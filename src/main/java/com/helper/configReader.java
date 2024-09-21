package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader {
	
	FileInputStream fis;
	Properties pro;
	
	private Properties getConfigFileValues() {
		
		File file = new File("C:\\Users\\jayav\\eclipse-workspace\\IPT_Project\\src\\main\\java\\com\\configProperties\\configProperties");
		
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		pro = new Properties();
		
		try {
			pro.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return pro;
			
	}
	
	public String getBrowserName() {
		
		String browsername = getConfigFileValues().getProperty("browser");
		
		return browsername ;
	}
	
	public String getUrl() {
		
		String url = getConfigFileValues().getProperty("url");
		
		return url;
	}
	
	public String getUserName() {
		
		String username = getConfigFileValues().getProperty("username");
		
		return username;	
	}
	
	public String getPassword() {
		
		String password = getConfigFileValues().getProperty("password");
		
		return password;
	}
	public String getLocation() {
		
		String location = getConfigFileValues().getProperty("location");
		
		return location;
	}
	public String getHotel() {
		
		String hotel = getConfigFileValues().getProperty("hotel");
		
		return hotel;		
	}
	public String getRoomType() {
		
		String roomType = getConfigFileValues().getProperty("room_type");
		
		return roomType;
	}
	public String getNoOfRooms() {
		
		String noOfRooms = getConfigFileValues().getProperty("number_of_rooms");
		
		return noOfRooms;
	}
	public String getAdultPerRoom () {
		
		String adultPerRoom = getConfigFileValues().getProperty("adult_per_room");
		
		return adultPerRoom;
	}
	public String getChildPerRoom() {
		
		String childPerRoom = getConfigFileValues().getProperty("child_per_room");
		
		return childPerRoom;
	}
	public String getFirstName() {
		
		String firstName = getConfigFileValues().getProperty("first_name");
		
		return firstName;
	}
	public String getLastName() {
		
		String lastName = getConfigFileValues().getProperty("last_name");
		
		return lastName;
	}
	public String getBillingAddress() {
		
		String billingAddress = getConfigFileValues().getProperty("billing_address") ;
		
		return billingAddress;
	}
	public String getCreditCardNo() {
		
		String creditCardNo = getConfigFileValues().getProperty("credit_card_no");
		
		return creditCardNo;
	}
	public String getCreditCardType() {
		
		String creditCardType = getConfigFileValues().getProperty("credit_card_type");
		
		return creditCardType;
	}
	public String getExpiryDateMonth() {
		
		String expiryDateMonth = getConfigFileValues().getProperty("expiry_date_month");
		
		return expiryDateMonth;
	}
	public String getExpiryDateYear() {
	
		String expiryDateYear = getConfigFileValues().getProperty("expiry_date_year");
	
		return expiryDateYear;
	}
	public String getCvvNumber() {
	
		String cvvNumber = getConfigFileValues().getProperty("cvv_number");
	
		return cvvNumber;
	}
	

}
