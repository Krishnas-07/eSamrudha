package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelRead;
import utilities.GeneralUtilities;

public class LoginPage {
	GeneralUtilities gu = new GeneralUtilities();
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/label[1]")
	WebElement AHDoffials;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/form[1]/div[2]/input[1]")
	WebElement userName;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/form[1]/div[3]/input[1]")
	WebElement passWord;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/form[1]/button[1]")
	WebElement LetMeIn;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/button[1]/div[1]/div[1]/p[1]")
	WebElement chooseRole;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]")
	WebElement AlertMsg;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]")
    WebElement AlertMsg2;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/a[2]")
	WebElement logOut;
	public void clickAHDOfficial() {
		gu.clickButton(AHDoffials);
	}

	/*
	 * public void enterUserName() throws IOException { gu.passValue(userName,
	 * ExcelRead.read("Credentials", 1, 1)); }
	 * 
	 * public void enterPassword() throws IOException { gu.passValue(passWord,
	 * ExcelRead.read("Credentials", 1, 2)); }
	 */
	public void enterUsername(String name) {
		userName.sendKeys(name);
	}

	public void enterpassword(String name1) {
		passWord.sendKeys(name1);
	}

	public void clickLetMeInButton() {
		gu.clickButton(LetMeIn);
	}

	public void selectRole() {
		gu.pageScrollDown(driver,0,1000);
		gu.WaitandClick(chooseRole);
	}

	public String AlertMessage() {
		return gu.readText(AlertMsg);
	}
	
	public String AlertMessageforRetired() {
		return gu.readText(AlertMsg2);
	}
	public void clickLogout() {
		gu.pageScrollDown(driver, 0, 1000);
		gu.WaitandClick(logOut);
	}
}
