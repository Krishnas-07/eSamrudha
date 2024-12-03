package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class WelcomeScreenTest extends BaseClass{
	
	
	@Test
	public void verifyLoginButton() {
		ws.navigateToLoginPage();
	}

}
