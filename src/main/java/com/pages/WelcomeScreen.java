package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class WelcomeScreen {
	GeneralUtilities gu=new GeneralUtilities();
	WebDriver driver;
	// Constructor for initializing the WebDriver and Page Factory
    public WelcomeScreen(WebDriver driver) {
        this.driver = driver;
        // Initialize elements using PageFactory
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath="/html[1]/body[1]/main[1]/nav[1]/div[1]/div[2]/form[1]/a[1]")
	WebElement loginButton;
	
	public void navigateToLoginPage() {
		gu.clickButton(loginButton);
	}
}

