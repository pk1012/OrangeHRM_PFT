package com.orangeHRM.UtilityClasses;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener
{
	WebDriver driver;
	
	public void onStart(ITestContext context)
	{
		System.out.println("Test Started");
	}
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test execution is started");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test execution is succesfull");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test execution is skipped");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test execution is failed and taking the screenshot");
	}	
	
	public void onFinish(ITestContext context)
	{
		System.out.println("Test Ended");		
	}
}

