package com.action;

import org.openqa.selenium.WebDriver;

public class BrowserActions {

	private WebDriver driver;

	BrowserActions(WebDriver driver) {
		this.driver = driver;

	}

	public void getURL(String url) {
		driver.get(url);

	}

	public void refreshPage() {
		driver.navigate().refresh();
	}
	
	public StandardActions action() {
		return new StandardActions(driver);
	}
	
	public FrameActions frameActions() {
		return new FrameActions(driver);
	}
}
