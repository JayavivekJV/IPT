package com.listener;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.IPT_Project.BaseClass;
import com.aventstack.extentreports.ExtentTest;

public class ExtendReport_Test {
	
	public static ExtentTest extentTest;
	
	@BeforeSuite
	 public void extendReportStartUp() {
		 
	 BaseClass base = new BaseClass() ;
	 
	 base.extendReportStart(null);
	 
	 }
	@AfterSuite
	public void extendReportEnd() throws IOException {
		 
		 BaseClass base = new BaseClass() ;
		 
		 base.extentReportTearDown(null);
		 
		 }
	 

}
