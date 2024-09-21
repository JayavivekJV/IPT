package com.listener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.IPT_Project.BaseClass;
import com.aventstack.extentreports.MediaEntityBuilder;

public class iTestListenerClass extends BaseClass implements ITestListener {

	public String testName;
	
	public String methodName;
	
	@Override
	public void onTestStart(ITestResult result) {
		
		try {
			ExtendReport_Test.extentTest.pass(result.getMethod() + " : " + "Test pass",MediaEntityBuilder.createScreenCaptureFromPath
					                                                                                                (takeScreenshot()).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
		try {
			ExtendReport_Test.extentTest.fail(result.getMethod() + " : " + "Test fail",MediaEntityBuilder.createScreenCaptureFromPath
					                                                                                                (takeScreenshot()).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
		
	}

	@Override
	public void onStart(ITestContext context) {
	
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}
	
	

}
