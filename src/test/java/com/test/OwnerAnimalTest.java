package com.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.ExcelRead;

public class OwnerAnimalTest extends BaseClass {
	@Test
	public void verifySearchFunctionality() throws IOException {
		ws.navigateToLoginPage();
		lp.clickAHDOfficial();
		lp.enterUsername(ExcelRead.read("Credentials", 1, 1));
		lp.enterpassword(ExcelRead.read("Credentials", 1, 2));
		lp.clickLetMeInButton();
		lp.selectRole();
		dhp.clickOwnerandAnimalManagement();
		oap.searchOwner(ExcelRead.read("Owners", 1, 1));
		oap.clickSearch();
		String actual=oap.viewProfileButton();
		String expected="View Profile";
		Assert.assertEquals(actual, expected);
		
	}
	@Test
	public void verifyUnregistetedmobilenumberSearch() throws IOException {
		ws.navigateToLoginPage();
		lp.clickAHDOfficial();
		lp.enterUsername(ExcelRead.read("Credentials", 1, 1));
		lp.enterpassword(ExcelRead.read("Credentials", 1, 2));
		lp.clickLetMeInButton();
		lp.selectRole();
		dhp.clickOwnerandAnimalManagement();
		oap.searchOwner(ExcelRead.read("Owners", 3, 1));
		oap.clickSearch();
		String actual=oap.validationforunregisterednumber();
		String expected="Details not found.";
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void verifyWhetherValidationMessageIsDisplayedForInvalidInput() throws IOException {
		ws.navigateToLoginPage();
		lp.clickAHDOfficial();
		lp.enterUsername(ExcelRead.read("Credentials", 1, 1));
		lp.enterpassword(ExcelRead.read("Credentials", 1, 2));
		lp.clickLetMeInButton();
		lp.selectRole();
		dhp.clickOwnerandAnimalManagement();
		oap.searchOwner(ExcelRead.read("Owners", 4, 1));
		String actual=oap.warningMessagedisplayed();
		String expected="Input length must be 10,12,14 or 16 characters.";
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void verifyWhetherSearchButtonIsEnabledforInvalidData() throws IOException {
		ws.navigateToLoginPage();
		lp.clickAHDOfficial();
		lp.enterUsername(ExcelRead.read("Credentials", 1, 1));
		lp.enterpassword(ExcelRead.read("Credentials", 1, 2));
		lp.clickLetMeInButton();
		lp.selectRole();
		dhp.clickOwnerandAnimalManagement();
		oap.searchOwner(ExcelRead.read("Owners", 4, 1));
		boolean actual=oap.SearchButtonStatus();
		boolean expected=true;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void verifyWhethervalidationMessageApperasForSearchWithoutOwnerName() throws IOException {
		ws.navigateToLoginPage();
		lp.clickAHDOfficial();
		lp.enterUsername(ExcelRead.read("Credentials", 1, 1));
		lp.enterpassword(ExcelRead.read("Credentials", 1, 2));
		lp.clickLetMeInButton();
		lp.selectRole();
		dhp.clickOwnerandAnimalManagement();
		oap.clickSearchByOwnerName();
		String actual=oap.alertPopUp();
		//System.out.println(actual);
		String expected="Please enter atleast 3 letters of the name";
		Assert.assertEquals(actual, expected);
		
	}
	@Test
	public void verifyWhetherValidationDisplayedForSearchedByOnwerName() throws IOException {
		ws.navigateToLoginPage();
		lp.clickAHDOfficial();
		lp.enterUsername(ExcelRead.read("Credentials", 1, 1));
		lp.enterpassword(ExcelRead.read("Credentials", 1, 2));
		lp.clickLetMeInButton();
		lp.selectRole();
		dhp.clickOwnerandAnimalManagement();
		oap.enterOwnerName(ExcelRead.read("Owners", 5, 2));
		oap.clickSearchByOwnerName();
		String actual=oap.validationforunregisterednumber();
		String expected="Details not found.";
		Assert.assertEquals(actual, expected, "Test completed");
		
	}
	@Test
	public void verifyWhetherOwnerCanBeSearchedByOnwerName() throws IOException {
		ws.navigateToLoginPage();
		lp.clickAHDOfficial();
		lp.enterUsername(ExcelRead.read("Credentials", 1, 1));
		lp.enterpassword(ExcelRead.read("Credentials", 1, 2));
		lp.clickLetMeInButton();
		lp.selectRole();
		dhp.clickOwnerandAnimalManagement();
		oap.enterOwnerName(ExcelRead.read("Owners", 6, 2));
		oap.clickSearchByOwnerName();
	    String actual=oap.OwnerFoundMessage(); 
		String expected="Basic Details";
		Assert.assertEquals(actual, expected, "Test passed");
	}
	@Test(enabled=true)
	public void verifyWhetherDistrictisAutopopulated() throws IOException {
		ws.navigateToLoginPage();
		lp.clickAHDOfficial();
		lp.enterUsername(ExcelRead.read("Credentials", 1, 1));
		lp.enterpassword(ExcelRead.read("Credentials", 1, 2));
		lp.clickLetMeInButton();
		lp.selectRole();
		dhp.clickOwnerandAnimalManagement();
		oap.clickDistrictDropdown();
		boolean actual=oap.IsPresent();
		boolean expected =true;
		Assert.assertEquals(actual, expected);
		
	}
	
	
	
	
}
