package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class OwnerProfilePage {
	GeneralUtilities gu = new GeneralUtilities();
	WebDriver driver;

	public OwnerProfilePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/h2[1]")
	WebElement heading;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h4[1]")
	WebElement animalOwned;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h1[1]")
	WebElement noOfAnimlas;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h4[1]/span[1]")
	WebElement OwnerName;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")
	WebElement AddAnimal;
	@FindBy(id = "frmAddEdit")
	WebElement AddAnimalPopup;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/span[1]/span[1]/span[1]/span[1]")
	WebElement OwnershipType;
	@FindBy(xpath = "//*[@title='Govt. Farm']")
	WebElement ownershipType1;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
	WebElement AnimalType;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[2]/div[4]/span[1]/span[1]/span[1]/span[1]")
	WebElement animalType1;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/span[1]/span[1]/span[1]/span[1]")
	WebElement Breed;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/span[1]/span[1]/span[1]/span[1]")
	WebElement Petname;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/span[1]/span[1]/span[1]/span[1]")
	WebElement DobAge;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/span[1]/span[1]/span[1]/span[1]")
	WebElement DobMonths;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/span[1]/span[1]/span[1]/span[1]")
	WebElement gender;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/span[1]/span[1]/span[1]/span[1]")
	WebElement color;

	public String checkHeading() {
		return gu.readText(heading);
	}

	public String checkAnimal() {
		return gu.readText(animalOwned);
	}

	public String totalNoOfAnimals() {
		return gu.readText(noOfAnimlas);
	}

	public String NameOfOwner() {
		return gu.readText(OwnerName);
	}

	public void clickAddAnimal() {
		gu.clickButton(AddAnimal);
	}

	public String isAddAnimalPopupPresent() {
		return gu.readText(AddAnimalPopup);
	}
	/*
	 * public void selectAnimalOwnershipType() { gu.WaitandClick(OwnershipType);
	 * gu.WaitandClick(ownershipType1);
	 * 
	 * }
	 */
	/*
	 * public void selectAnimalType() { gu.WaitandClick(AnimalType);
	 * gu.WaitandClick(animalType1); }
	 */

}
