package com.OrangeHRM.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.orangeHRM.POMClasses.POM0_Login;
import com.orangeHRM.POMClasses.POM1_Logout;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseClass
{
	WebDriver driver;
	
	@BeforeClass
	public  void setUp()
	{
		WebDriverManager.chromedriver().driverVersion("121").setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@BeforeMethod
	public void login()
	{
		POM0_Login li = new POM0_Login(driver);
		li.sendUsername();
		li.sendPassword();
		li.clickOnLoginBtn();
		
	}
	
	@AfterMethod
	public void logout()
	{
		POM1_Logout lo = new POM1_Logout(driver);
		lo.clickUserDropdown();
		lo.clickOnLoginBtn();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}	
}




