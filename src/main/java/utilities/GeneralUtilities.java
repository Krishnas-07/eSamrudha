package utilities;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralUtilities {
	WebDriver driver;

	public void clickButton(WebElement element) {
		element.click();

	}

	public void passValue(WebElement element, String text) {
		element.sendKeys(text);
	}

	public String readText(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return element.getText();
	}

	public void pageScrollDown(WebDriver driver, int horizontalScroll, int verticalScroll) {
		JavascriptExecutor js = (JavascriptExecutor) driver;// interface to trigger javascript
		js.executeScript("window.scrollBy(" + horizontalScroll + "," + verticalScroll + ")", "");
	}

	public void WaitandClick(WebElement element) {

		// Wait for the element to be clickable (up to 10 seconds)
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));

		// Click on the element once it's clickable
		element.click();

	}

	public boolean ButtonEnable(WebElement element) {
		return element.isEnabled();
	}
	public boolean selection(WebElement element) {
		return element.isSelected();
	}
	public boolean isPresent(WebElement element) {
		return element.isDisplayed();
	}
	
	
	public void selectFromDropDown(WebElement element, int dropdown) {
		Select obj = new Select(element);
		obj.selectByIndex(dropdown);
	}
	public void selectFromDropDown2(WebElement element, String district) {
		Select obj = new Select(element);
		obj.selectByVisibleText(district);
	}
	/*
	 * public void alertmsg(WebDriver driver) { driver.switchTo().alert();//accept()
	 * to accept message }
	 */

}
