package com.test.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StandardActions {

	private WebDriver driver;

	public StandardActions(WebDriver driver) {
		this.driver = driver;
	}

	public void click(By locator, String name) {

		getElement(locator).click();

	}

	public void type(By locator, String typeText, String name) {
		getElement(locator).sendKeys(typeText);
	}

	WebElement getElement(By locatorName) {

		return driver.findElement(locatorName);

	}

}
