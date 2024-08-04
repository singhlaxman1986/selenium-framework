package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public enum BrowserFactory {

	CHROME {
		public WebDriver getDriver() {
			WebDriver driver = new ChromeDriver();
			return driver;

		}
	}

}
