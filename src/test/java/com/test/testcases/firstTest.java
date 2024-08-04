package com.test.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.base.BaseTest;
import com.test.pages.LoginPage;

public class firstTest extends BaseTest {

	LoginPage loginPage;

	@Test
	public void f() {

		loginPage = new LoginPage(getDriver(), selenium);
		loginPage.loginToGoogle();
		Assert.assertTrue(false);

	}
}
