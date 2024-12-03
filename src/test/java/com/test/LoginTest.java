package com.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.ExcelRead;

public class LoginTest extends BaseClass {

	@Test
	public void verifyvalidLogin() throws IOException {
		ws.navigateToLoginPage();
		lp.clickAHDOfficial();
		lp.enterUsername(ExcelRead.read("Credentials", 1, 1));
		lp.enterpassword(ExcelRead.read("Credentials", 1, 2));
		lp.clickLetMeInButton();
		lp.selectRole();
	}

	@Test
	public void verifyInvalidLogin() throws IOException {

		ws.navigateToLoginPage();
		lp.clickAHDOfficial();
		lp.enterUsername(ExcelRead.read("Credentials", 4, 1));
		lp.enterpassword(ExcelRead.read("Credentials", 4, 2));
		lp.clickLetMeInButton();
		String actual = lp.AlertMessage();
		String expected="The entered username ' is invalid. It must be minimum 6 chars and maximum 7 chars.";
		Assert.assertEquals(actual, expected, "Test passed");
		
	}
	
	@Test
	public void verifyExpiredLogin() throws IOException {
		ws.navigateToLoginPage();
		lp.clickAHDOfficial();
		lp.enterUsername(ExcelRead.read("Credentials", 5, 1));
		lp.enterpassword(ExcelRead.read("Credentials", 5, 2));
		lp.clickLetMeInButton();
		String actual = lp.AlertMessageforRetired();
		String expected="Retired or Contract Expired!";
		Assert.assertEquals(actual, expected, "Test passed");
		
	}
	@Test
	public void verifyLogoutFunctionality() throws IOException {
		ws.navigateToLoginPage();
		lp.clickAHDOfficial();
		lp.enterUsername(ExcelRead.read("Credentials", 1, 1));
		lp.enterpassword(ExcelRead.read("Credentials", 1, 2));
		lp.clickLetMeInButton();
		lp.clickLogout();
	}
	
	

}
