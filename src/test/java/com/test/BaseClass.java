package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pages.DashboardHomePage;
import com.pages.LoginPage;
import com.pages.OwnerAnimalPage;
import com.pages.OwnerProfilePage;
import com.pages.WelcomeScreen;

import utilities.ScreenshotUtilites;

public class BaseClass {
	WebDriver driver;
	WelcomeScreen ws;
	LoginPage lp;
	DashboardHomePage dhp;
	OwnerAnimalPage oap;
	OwnerProfilePage opp;
	Properties prop;
	ScreenshotUtilites sc;

	public void testBasic() throws IOException {
		prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"C:\\Users\\kudsit\\eclipse-workspace\\e_Samrudha\\src\\test\\resources\\Config.Properties");
		prop.load(ip);
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() throws IOException {
		testBasic();
		driver = new ChromeDriver();
		driver.get(prop.getProperty("baseURL"));
		driver.manage().window().maximize();
		ws = new WelcomeScreen(driver);
		lp = new LoginPage(driver);
		dhp = new DashboardHomePage(driver);
		oap = new OwnerAnimalPage(driver);
		opp = new OwnerProfilePage(driver);

	}

	/*
	 * @AfterMethod(alwaysRun = true, enabled = false) public void
	 * afterMethod(ITestResult itestResult) throws IOException {
	 * 
	 * if (itestResult.getStatus() == ITestResult.FAILURE) { sc = new
	 * ScreenshotUtilites(); sc.captureScreenshotFailures(driver,
	 * itestResult.getName());
	 * 
	 * } // for capturing screenshot if program fails
	 * 
	 * driver.close(); }
	 */

}
