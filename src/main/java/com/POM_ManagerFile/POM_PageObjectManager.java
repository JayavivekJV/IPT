package com.POM_ManagerFile;

import com.IPT_Project.BaseClass;
import com.adactinHotelPOM.LoginPagePOM;
import com.adactinHotelPOM.bookHotelPagePOM;
import com.adactinHotelPOM.logOutPagePOM;
import com.adactinHotelPOM.searchHotelPagePOM;
import com.adactinHotelPOM.selectHotelPagePOM;
import com.helper.configReader;

public class POM_PageObjectManager extends BaseClass{
	
	private LoginPagePOM Login;
	
	public LoginPagePOM getLoginPagePom() {
		
		if(Login == null) {
			
			Login = new LoginPagePOM (driver);	
		}
		return Login;
	}
	private searchHotelPagePOM Search;
	
	public searchHotelPagePOM getSearchHotelPagePOM() {
		
		if (Search == null) {
			
			Search = new searchHotelPagePOM(driver);
		}
		return Search;
	}
	private selectHotelPagePOM Select;
	
	public selectHotelPagePOM getSelectHotelPagePOM() {
		
		if(Select == null) {
			
			Select = new selectHotelPagePOM(driver);
		}
		return Select;
	}
	private bookHotelPagePOM Book;
	
	public bookHotelPagePOM getBookHotelPagePOM() {
		
		if(Book == null) {
			
			Book = new bookHotelPagePOM(driver);
		}
		return Book;
	}
	private logOutPagePOM LogOut;
	
	public logOutPagePOM getLogOutPagePOM() {
		
		if(LogOut == null) {
			
			LogOut = new logOutPagePOM(driver);
		}
		return LogOut;
	}
	
	
	private configReader Reader;
	
	public configReader getConfigReader() {
		
		if (Reader == null) {
			
			Reader = new configReader();
		}
		return Reader;
	}

}
