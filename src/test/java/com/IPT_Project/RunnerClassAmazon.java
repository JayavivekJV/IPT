package com.IPT_Project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.amazonPOM.amazonLoginPagePOM;
import com.listener.ExtendReport_Test;
import com.listener.iTestListenerClass;

@Listeners(iTestListenerClass.class)


public class RunnerClassAmazon extends BaseClass{
	
      public static WebDriver driver;
		
		@BeforeTest
		public static void setUp() {
			browserLaunch("Chrome"); 
			urlLaunch("https://www.amazon.in/");
			implicitWait(driver, 1000);
		}
		
		@Test
		public static void validLoginTest() {
			
			ExtendReport_Test.extentTest = extentReports.createTest("Login Test" + " : " + Thread.currentThread().getStackTrace()[1]
					                                                                 .getMethodName().toString()).info("valid email id & password");
			amazonLoginPagePOM lp= new amazonLoginPagePOM(driver);
			Assert.assertTrue(lp.validLogin(ExtendReport_Test.extentTest));
			}
		@Test
		public static void invalidMailId() {
			
			ExtendReport_Test.extentTest = extentReports.createTest("Login Test" + " : " + Thread.currentThread().getStackTrace()[1]
                                                                   .getMethodName().toString()).info("Enter a valid email address or phone number");
			amazonLoginPagePOM lp= new amazonLoginPagePOM(driver);
			lp.invalidMailId();
		}
		@Test
		public static void invalidPassword() {
			
			ExtendReport_Test.extentTest = extentReports.createTest("Login Test" + " : " + Thread.currentThread().getStackTrace()[1]
                                                                                            .getMethodName().toString()).info("Incorrect Password");
			amazonLoginPagePOM lp= new amazonLoginPagePOM(driver);
			lp.invalidPassword();
		}
		@Test
		public static void nullMail() {
			
			ExtendReport_Test.extentTest = extentReports.createTest("Login Test" + " : " + Thread.currentThread().getStackTrace()[1]
                                                                            .getMethodName().toString()).info("Enter your mobile or phone number");
			amazonLoginPagePOM lp= new amazonLoginPagePOM(driver);
			lp.nullMail();
		}
		@Test
		public static void nullPassword() {
			
			ExtendReport_Test.extentTest = extentReports.createTest("Login Test" + " : " + Thread.currentThread().getStackTrace()[1]
                                                                            .getMethodName().toString()).info("Enter your Password");
			amazonLoginPagePOM lp= new amazonLoginPagePOM(driver);
			lp.nullPassword();
		}
			
		@AfterTest
		public static void termination() {
			quit(driver);	
		}
		
		@BeforeSuite
		private void extentStartUp() {
			extendReportStart("C:\\Users\\sathi\\eclipse-workspace\\SelePr\\mavenproject\\Reports");
		}
		
		@AfterSuite
		private void extentReportEnd() throws IOException {
			extentReportTearDown("C:\\Users\\sathi\\eclipse-workspace\\SelePr\\mavenproject\\Reports\\index.html");
		}

	

}
