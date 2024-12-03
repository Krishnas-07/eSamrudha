package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class DashboardHomePage {
	GeneralUtilities gu = new GeneralUtilities();
	WebDriver driver;

	public DashboardHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[6]/a[1]/div[1]")
    WebElement OwnerAndAnimalManagement;
	@FindBy(xpath="/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/a[1]/div[1]")
    WebElement HospitalManagement;
	@FindBy(xpath="/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/a[1]/div[1]")
    WebElement HealthManagement;
	@FindBy(xpath="/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[3]/a[1]/div[1]")
    WebElement BreedinglManagement;
	@FindBy(xpath="/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[4]/a[1]/div[1]")
    WebElement LabManagement;
	@FindBy(xpath="/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[5]/a[1]/div[1]")
    WebElement DashboardRegisterReport;
	
	public void clickOwnerandAnimalManagement() {
		gu.WaitandClick(OwnerAndAnimalManagement);
	}
	public void clickHospitalManagement() {
		gu.WaitandClick(HospitalManagement);
	}
	public void clickHealthManagement() {
		gu.WaitandClick(HealthManagement);
	}
	public void clickBreedingManagement() {
		gu.WaitandClick(BreedinglManagement);
	}
	public void clickLabManagement() {
		gu.WaitandClick(LabManagement);
	}
	public void clickDashboard() {
		gu.WaitandClick(DashboardRegisterReport);
	}
}

