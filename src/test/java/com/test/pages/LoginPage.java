package com.test.pages;

import org.openqa.selenium.WebDriver;

import com.test.actions.BrowserActions;
import com.test.base.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver webdriver, BrowserActions selenium) {
		super(webdriver, selenium);
	}

	public void loginToGoogle() {
		selenium.getURL("https://www.google.com/");

	}

}
