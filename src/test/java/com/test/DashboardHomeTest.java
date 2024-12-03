package com.test;

import java.io.IOException;

import org.testng.annotations.Test;

import utilities.ExcelRead;

public class DashboardHomeTest extends BaseClass{
    @Test
	public void verifyOwnerandAnimalManagement() throws IOException {
		ws.navigateToLoginPage();
		lp.clickAHDOfficial();
		lp.enterUsername(ExcelRead.read("Credentials", 1, 1));
		lp.enterpassword(ExcelRead.read("Credentials", 1, 2));
		lp.clickLetMeInButton();
		lp.selectRole();
		dhp.clickOwnerandAnimalManagement();
	}
    @Test
    public void verifyHospitalManagement() throws IOException {
		ws.navigateToLoginPage();
		lp.clickAHDOfficial();
		lp.enterUsername(ExcelRead.read("Credentials", 1, 1));
		lp.enterpassword(ExcelRead.read("Credentials", 1, 2));
		lp.clickLetMeInButton();
		lp.selectRole();
		dhp.clickHospitalManagement();
	}
    @Test
    public void verifyHealthManagement() throws IOException {
		ws.navigateToLoginPage();
		lp.clickAHDOfficial();
		lp.enterUsername(ExcelRead.read("Credentials", 1, 1));
		lp.enterpassword(ExcelRead.read("Credentials", 1, 2));
		lp.clickLetMeInButton();
		lp.selectRole();
		dhp.clickHealthManagement();
	}
    @Test
    public void verifyBreedingManagement() throws IOException {
		ws.navigateToLoginPage();
		lp.clickAHDOfficial();
		lp.enterUsername(ExcelRead.read("Credentials", 1, 1));
		lp.enterpassword(ExcelRead.read("Credentials", 1, 2));
		lp.clickLetMeInButton();
		lp.selectRole();
		dhp.clickBreedingManagement();
	}
    @Test
    public void verifyLabManagement() throws IOException {
		ws.navigateToLoginPage();
		lp.clickAHDOfficial();
		lp.enterUsername(ExcelRead.read("Credentials", 1, 1));
		lp.enterpassword(ExcelRead.read("Credentials", 1, 2));
		lp.clickLetMeInButton();
		lp.selectRole();
		dhp.clickLabManagement();
	}
    @Test
    public void verifyDashboard() throws IOException {
		ws.navigateToLoginPage();
		lp.clickAHDOfficial();
		lp.enterUsername(ExcelRead.read("Credentials", 1, 1));
		lp.enterpassword(ExcelRead.read("Credentials", 1, 2));
		lp.clickLetMeInButton();
		lp.selectRole();
		dhp.clickDashboard();
	}
    
    
    
}
