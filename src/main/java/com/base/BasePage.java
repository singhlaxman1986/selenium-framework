package com.base;

import org.openqa.selenium.WebDriver;

public class BasePage {
	
	
	protected WebDriver driver;
	protected AutomationEngine selenium;
	
	public BasePage (WebDriver webdriver, AutomationEngine selenium) {
		
		this.driver=webdriver;
		this.selenium=selenium;
		
	}
	
	
}