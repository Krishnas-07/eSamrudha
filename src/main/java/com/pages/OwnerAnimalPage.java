package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class OwnerAnimalPage {
	GeneralUtilities gu = new GeneralUtilities();
	WebDriver driver;

	public OwnerAnimalPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement search;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/i[1]")
	WebElement searchButton;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")
	WebElement viewProfile;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p[1]")
	WebElement unregistetednumber;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
	WebElement validationMessage;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
	WebElement SearchByOwner;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/input[1]")
	WebElement ownerName;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p[2]/strong[1]")
	WebElement OwnerFoundMessage;
	@FindBy(id = "select2-adv_search_district-container")
	WebElement districtDropdown;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
	WebElement Tvm;
	
    
    public void searchOwner(String number) {
		search.sendKeys(number);
	}

	public void clickSearch() {
		gu.clickButton(searchButton);
	}

	public String viewProfileButton() {
		gu.pageScrollDown(driver, 0, 1000);
		return gu.readText(viewProfile);
	}

	public void clickViewProfile() {
		gu.pageScrollDown(driver, 0, 1000);
		gu.WaitandClick(viewProfile);
	}

	public String validationforunregisterednumber() {
		return gu.readText(unregistetednumber);
	}

	public String warningMessagedisplayed() {
		return gu.readText(validationMessage);
	}

	public boolean SearchButtonStatus() {
		return gu.ButtonEnable(searchButton);
	}

	public void clickSearchByOwnerName() {
		gu.clickButton(SearchByOwner);
	}

	public void enterOwnerName(String name) {
		ownerName.sendKeys(name);
	}

	public String alertPopUp() {
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		return alertText;
	}

	public String OwnerFoundMessage() {
		gu.pageScrollDown(driver, 0, 1000);
		return gu.readText(OwnerFoundMessage);
	}

	public void clickDistrictDropdown() {
		gu.clickButton(districtDropdown);
	}

	public boolean IsPresent() {
		return gu.isPresent(Tvm);
	}

	
	/*
	 * public void selectDistrict() {
	 * 
	 * gu.selectFromDropDown2(districtDropdown, "Thiruvananthapuram"); } public
	 * boolean checkSelection() { return gu.selection(districtDropdown); }
	 */

}
