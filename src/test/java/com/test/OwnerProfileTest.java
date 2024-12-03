package com.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.ExcelRead;

public class OwnerProfileTest extends BaseClass {
	@Test
	public void verifyWhetherOwnerProfileIsdisplayed() throws IOException {
		ws.navigateToLoginPage();
		lp.clickAHDOfficial();
		lp.enterUsername(ExcelRead.read("Credentials", 1, 1));
		lp.enterpassword(ExcelRead.read("Credentials", 1, 2));
		lp.clickLetMeInButton();
		lp.selectRole();
		dhp.clickOwnerandAnimalManagement();
		oap.searchOwner(ExcelRead.read("Owners", 1, 1));
		oap.clickSearch();
		oap.clickViewProfile();
		String actual = opp.checkHeading();
		System.out.println(actual);
		String expected = " Owner Profile";
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void verifyWhetherAnimalOwnedByOwnerIsdisplayed() throws IOException {
		ws.navigateToLoginPage();
		lp.clickAHDOfficial();
		lp.enterUsername(ExcelRead.read("Credentials", 1, 1));
		lp.enterpassword(ExcelRead.read("Credentials", 1, 2));
		lp.clickLetMeInButton();
		lp.selectRole();
		dhp.clickOwnerandAnimalManagement();
		oap.searchOwner(ExcelRead.read("Owners", 1, 1));
		oap.clickSearch();
		oap.clickViewProfile();
		String actual = opp.checkAnimal();
		System.out.println(actual);
		String expected = "Currently Owned Animals";
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void verifyTotalNoOfAnimlasOwnedByOwner() throws IOException, InterruptedException {
		ws.navigateToLoginPage();
		lp.clickAHDOfficial();
		lp.enterUsername(ExcelRead.read("Credentials", 1, 1));
		lp.enterpassword(ExcelRead.read("Credentials", 1, 2));
		lp.clickLetMeInButton();
		lp.selectRole();
		dhp.clickOwnerandAnimalManagement();
		oap.searchOwner(ExcelRead.read("Owners", 2, 1));
		oap.clickSearch();
		oap.clickViewProfile();
		Thread.sleep(1000);
		String actual = opp.totalNoOfAnimals().toString();
		System.out.println("Animals Owned By the Owner " +opp.NameOfOwner()+ " is " +actual);
		//String expected = "";
		//Assert.assertEquals(actual, expected);
	}
	@Test
	public void verifyWhetherAddAnimalPopPuApperas() throws IOException, InterruptedException {
		ws.navigateToLoginPage();
		lp.clickAHDOfficial();
		lp.enterUsername(ExcelRead.read("Credentials", 1, 1));
		lp.enterpassword(ExcelRead.read("Credentials", 1, 2));
		lp.clickLetMeInButton();
		lp.selectRole();
		dhp.clickOwnerandAnimalManagement();
		oap.searchOwner(ExcelRead.read("Owners", 2, 1));
		oap.clickSearch();
		oap.clickViewProfile();
		Thread.sleep(1000);
		opp.clickAddAnimal();
		Assert.assertTrue(opp.isAddAnimalPopupPresent().contains("Add/Edit Animal Details"));
	


}
	@Test(enabled=false)
	public void verifyWhetherUserCanAddAnimal() throws IOException, InterruptedException {
		ws.navigateToLoginPage();
		lp.clickAHDOfficial();
		lp.enterUsername(ExcelRead.read("Credentials", 1, 1));
		lp.enterpassword(ExcelRead.read("Credentials", 1, 2));
		lp.clickLetMeInButton();
		lp.selectRole();
		dhp.clickOwnerandAnimalManagement();
		oap.searchOwner(ExcelRead.read("Owners", 2, 1));
		oap.clickSearch();
		oap.clickViewProfile();
		Thread.sleep(1000);
		opp.clickAddAnimal();
		
		
	}}
