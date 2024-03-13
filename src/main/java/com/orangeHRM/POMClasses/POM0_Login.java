package com.orangeHRM.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM0_Login 
{
	WebDriver driver;

	public POM0_Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input [@name = 'username']")
	private WebElement username;
	
	@FindBy(xpath = "//input [@name = 'password']")
	private WebElement password;
	
	@FindBy(xpath = "//button [@type= 'submit']")
	private WebElement loginBtn;
	
	public void sendUsername()
	{
		username.sendKeys("Admin");
	}
	
	public void sendPassword()
	{
		password.sendKeys("admin123");
	}
	
	public void clickOnLoginBtn()
	{
		loginBtn.click();
	}
}
