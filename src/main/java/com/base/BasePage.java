package com.base;

import org.openqa.selenium.WebDriver;

import com.action.BrowserActions;

public class BasePage {
	
	
	protected WebDriver driver;
	protected BrowserActions selenium;
	
	public BasePage (WebDriver webdriver, BrowserActions selenium) {
		
		this.driver=webdriver;
		this.selenium=selenium;
		
	}
	
	
}