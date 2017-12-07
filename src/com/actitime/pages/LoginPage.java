package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.actitime.generic.BasePage;

public class LoginPage extends BasePage
{
	//Declaration
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	
	@FindBy(xpath="//span[contains(text(),'invalid')]")
	private WebElement errMsg;
	
	@FindBy(xpath="//nobr[contains(text(),'actiTIME')]")
	private WebElement version;
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void enterUserName(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void enterPassword(String pwd)
	{
		pwTB.sendKeys(pwd);
	}
	
	public void clickOnLogin()
	{
		loginBTN.click();
	}
	
	public void verifyingTitle(String title)
	{
		verifyTitle(title);
	}
	
	public void verifyErrMsg()
	{
		verifyElement(errMsg);
	}
	
	public void verifyVersion(String eVersion)
	{
		try
		{
			Assert.assertEquals(version.getText(), eVersion);
			Reporter.log("version is matching:",true);
		}
		catch(Exception e)
		{
		}
	}
}
