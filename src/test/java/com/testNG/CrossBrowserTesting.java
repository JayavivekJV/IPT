package com.testNG;

import org.testng.annotations.Test;

import com.IPT_Project.BaseClass;

public class CrossBrowserTesting extends BaseClass {
	
	@Test
	
	private void edge() {
		browserLaunch("edge");
		urlLaunch("https://www.google.com/");
		System.out.println("Browser ID :  "+Thread.currentThread().getId());
		quit(driver);
	}
	
	@Test
	
	private void chrome() {
		browserLaunch("chrome");
		urlLaunch("https://www.google.com/");
		System.out.println("Browser ID : "+Thread.currentThread().getId());
		quit(driver);
	}

}
