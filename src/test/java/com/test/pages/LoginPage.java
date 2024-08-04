package com.test.pages;

import org.openqa.selenium.WebDriver;

import com.test.actions.BrowserActions;
import com.test.base.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver webdriver, BrowserActions browserAction) {
		super(webdriver, browserAction);
	}

	public void loginToGoogle() {
		selenium.getURL("https://www.google.com/");
		selenium.refreshPage();
		
	}

}
