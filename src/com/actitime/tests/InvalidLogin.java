package com.actitime.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.LoginPage;

@Listeners(com.actitime.generic.ListenersTest.class)
public class InvalidLogin extends BaseTest
{
	@Test
	public void testInvalidLogin()
	{
		String user = ExcelData.getData(file_path, "Login", 2, 0);
		String pass = ExcelData.getData(file_path, "Login", 2, 1);
		String lpTitle = ExcelData.getData(file_path, "Login", 1, 2);
		
		LoginPage lp = new LoginPage(driver);
		
		//Verify Login page title
		lp.verifyingTitle(lpTitle);
		
		//Enter invalid username
		lp.enterUserName(user);
		
		//Enter invalid password
		lp.enterPassword(pass);
		
		//click on login
		lp.clickOnLogin();
		
		//verify the error message
		lp.verifyErrMsg();
	}
}
