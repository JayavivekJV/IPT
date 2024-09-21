package com.IPT_Project;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {
	
	protected static WebDriver driver;
	
	public static ExtentReports extentReports;
	
	public static File file;
	
	protected static void browserLaunch(String browserName) {
		
		try {
			if(browserName.equalsIgnoreCase("Chrome")) {
				driver = new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("edge")){
				driver = new EdgeDriver();
			}
			else {
				System.out.println("Invalid browser name");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	    driver.manage().window().maximize();
	}
//TO LAUNCH URL
	protected static void urlLaunch(String url) {
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(durations));
		driver.get(url);
		
	}
//NAVIGATE TO
	protected static void navigate(WebDriver driver , String navUrl) {
		
		driver.navigate().to(navUrl);
	}
	
//NAVIGATE METHODS
	protected static void navigateMethods(WebDriver driver , String methods) {
		
		try {
			if(methods.equalsIgnoreCase("forward")) {
				driver.navigate().forward();
			}else if(methods.equalsIgnoreCase("back")) {
				driver.navigate().back();
			}else if(methods.equalsIgnoreCase("refresh")) {
				driver.navigate().refresh();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//SEND KEYS
	protected static void keys(WebDriver driver , WebElement element , String value) {
		element.sendKeys(value);
	}
//CLICK
	protected static void click(WebDriver driver , WebElement element) {
		element.click();
	}
//DROPDOWN
	protected static void dropDown(WebDriver driver , WebElement element , String options , String value ) {
		try {
			Select select = new Select(element);
			   if(options.equalsIgnoreCase("value")) {
				   select.selectByValue(value);
			   }else if(options.equalsIgnoreCase("index")) {
				   select.selectByIndex(Integer.parseInt(value));
			   }else if(options.equalsIgnoreCase("text")) {
				   select.selectByVisibleText(value);
			   }
		} catch (Exception e) {
     		e.printStackTrace();
		}
	}
//FRAMES
	protected static void frame(WebDriver driver , WebElement element) {
		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//ACTIONS
	protected static void action(WebDriver driver , WebElement element) {
		try {
			Actions action = new Actions(driver);
			action.moveToElement(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//ALERTS
	protected static void alert(WebDriver driver , String options) {
		try {
			driver.switchTo().alert();
			
			if(options.equalsIgnoreCase("accept")) {
				driver.switchTo().alert().accept();
			}else if (options.equalsIgnoreCase("dismiss")) {
				driver.switchTo().alert().dismiss();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//IS ENABLED
	protected static void isEnabled(WebDriver driver , WebElement element) {
		if(element.isEnabled()) {
		element.click();
		}else {
			System.out.println("element is not enabled");
		}
	}
//IS SELECTED
	protected static void isSelected(WebDriver driver , WebElement element) {
		if(element.isSelected()) {
		element.click();
		}
	}
//SCREENSHOT
	protected static void ScreenShot(WebDriver driver , String name , String format) {
		   TakesScreenshot tc=(TakesScreenshot) driver;
	       File source=tc.getScreenshotAs(OutputType.FILE);
	       File Destination=new File("C:\\Users\\jayav\\eclipse-workspace\\IPT_Project\\Screenshot\\.png");
	       try {
			FileHandler.copy(source, Destination);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
//GET TITLE
	protected static void getTitle(WebDriver driver , String title) {
		try {
			String Title = driver.getTitle();
			System.out.println(Title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//GET TEXT
	protected static void getText(WebDriver driver , WebElement element , String text) {
		String Text = element.getText();
		System.out.println(Text);
	}
//GET CURRENT URL
	protected static void getCurrentUrl(WebDriver driver , String currenturl) {
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);
	}
//Get Attribute
	protected static void getAttribute(WebDriver driver , WebElement element , String value) {
		try {
			String attribute = element.getAttribute(value);
			System.out.println(attribute);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//IMPLICIT WAIT
	protected static void implicitWait(WebDriver driver , int sec) {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void extendReportStart(String location) {
		extentReports = new ExtentReports();
		file = new File(location);
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		extentReports.attachReporter(sparkReporter);
		extentReports.setSystemInfo("OS", System.getProperty("os.name"));
		extentReports.setSystemInfo("Java vesion", System.getProperty("java.version"));
		
	}
	public static void extentReportTearDown(String location) throws IOException {
		extentReports.flush();
		file = new File(location);
		Desktop.getDesktop().browse((file).toURI());
	}
	public String takeScreenshot() throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmSS").format(new Date());
		File scrfile = screenshot.getScreenshotAs(OutputType.FILE);
		File destfile = new File("Screenshot\\.png" + "_"+ timeStamp + ".png");
		FileUtils.copyFile(scrfile, destfile);
		return destfile.getAbsolutePath();
	}
	public static void validation(WebDriver act, String ect ) {
		Assert.assertEquals(act.getTitle(), ect);
 
	}
	
	
//CLOSE	
	protected static void close(WebDriver driver) {
		driver.close();
	}
//QUIT
	protected static void quit(WebDriver driver) {
		driver.quit();
	}
	
	      
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
