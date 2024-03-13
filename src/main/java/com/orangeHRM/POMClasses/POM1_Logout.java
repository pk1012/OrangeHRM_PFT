package com.orangeHRM.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1_Logout 
{
	WebDriver driver;

	public POM1_Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p [@class = 'oxd-userdropdown-name']")
	private WebElement userDropdown;
	
	@FindBy(xpath = "//a [contains (@href, '/web/index.php/auth/logout')]")
	private WebElement logoutBtn;
	
	public void clickUserDropdown()
	{
		userDropdown.click();
	}
	
	public void clickOnLoginBtn()
	{
		logoutBtn.click();
	}
}
