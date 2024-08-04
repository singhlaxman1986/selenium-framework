package com.test.utils;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserManagerUtils {

	private BrowserManagerUtils() {
	}

	public static WebDriver initializeDriver(String browser) {

		WebDriver driver = null;

		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = WebDriverManager.chromedriver().create();
			break;
		case "firefox":
			driver = WebDriverManager.firefoxdriver().create();
			break;
		case "edge":
			driver = WebDriverManager.edgedriver().create();
			break;
		case "safari":
			driver = WebDriverManager.safaridriver().create();
			break;
		default:
			WebDriverManager.chromedriver().setup();
			driver = WebDriverManager.chromedriver().create();
			break;

		}
		return driver;
	}
}
