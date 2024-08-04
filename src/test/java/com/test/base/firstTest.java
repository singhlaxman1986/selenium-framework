package com.test.base;

import org.testng.annotations.Test;

import com.test.pages.LoginPage;

public class firstTest extends BaseTest {

	LoginPage loginPage;

	@Test
	public void f() {

		loginPage = new LoginPage(getDriver(), selenium);
		loginPage.loginToGoogle();

	}
}
