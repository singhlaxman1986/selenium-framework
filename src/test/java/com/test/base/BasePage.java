package com.test.base;

import org.openqa.selenium.WebDriver;

import com.test.actions.BrowserActions;

public class BasePage {

	protected WebDriver driver;
	protected BrowserActions selenium;

	public BasePage(WebDriver webdriver, BrowserActions browserAction) {

		driver = webdriver;
		selenium = browserAction;

	}

}