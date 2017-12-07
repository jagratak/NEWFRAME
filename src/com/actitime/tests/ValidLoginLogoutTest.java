package com.actitime.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LoginPage;

@Listeners(com.actitime.generic.ListenersTest.class)
public class ValidLoginLogoutTest extends BaseTest
{

	@Test
	public void testValidLoginLogout()
	{
		String user = ExcelData.getData(file_path, "Login", 1, 0);
		String pass = ExcelData.getData(file_path, "Login", 1, 1);
		String lpTitle = ExcelData.getData(file_path, "Login", 1, 2);
		String epTitle = ExcelData.getData(file_path, "EnterTimeTrack", 1, 0);


		
		LoginPage lp = new LoginPage(driver);
		EnterTimeTrackPage ep = new EnterTimeTrackPage(driver);
		
		//Verify Login page title
		lp.verifyingTitle(lpTitle);
		
		//Enter valid username
		lp.enterUserName(user);
		
		//Enter valid password
		lp.enterPassword(pass);
		
		//click on login
		lp.clickOnLogin();
		
		//verify enter time track page title
		lp.verifyingTitle(epTitle);
		
		//click on logout
		ep.clickOnLogout();
		
		//Verify Login page title
		lp.verifyingTitle(lpTitle);
	}
}
