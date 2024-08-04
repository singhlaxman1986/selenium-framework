package com.test.base;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.test.actions.BrowserActions;
import com.test.utils.BrowserManagerUtils;
import com.test.utils.ConfiManagerUtils;

public class BaseTest {

	private String browser;
	private String platform;
	private String browserversion;
	private String SauceLabs;
	private WebDriver driver;
	public ThreadLocal<WebDriver> threadlocalDriver = new ThreadLocal<WebDriver>();
	public BrowserActions selenium;

	@BeforeSuite
	public void initializeDriver(ITestContext context) {
		Map<String, String> suiteParameters = context.getCurrentXmlTest().getSuite().getParameters();
//		browser = suiteParameters.get("browser");
//		platform = suiteParameters.get("platform");
//		browserversion = suiteParameters.get("browserversion");
//		SauceLabs = suiteParameters.get("sauce");
//		setSauceLabs(SauceLabs);

	}

	@BeforeClass
	public void beforeClass() {
		String implicit_wait = ConfiManagerUtils.getProperty("implicit_wait");
		driver = BrowserManagerUtils.initializeDriver("chrome");
		setDriver(driver);
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(implicit_wait)));
		selenium = new BrowserActions(driver);

	}

	@AfterClass
	public void closeDriver() {
		getDriver().quit();
	}

	private void setDriver(WebDriver driver) {
		threadlocalDriver.set(driver);
	}

	public WebDriver getDriver() {
		return threadlocalDriver.get();
	}

	private void setSauceLabs(String sauceLabs2) {
		SauceLabs = sauceLabs2;

	}

}
