package main.java.test;

import static org.testng.Assert.*;


import main.java.pages.header.HeaderFull;
import main.java.pages.header.LogUserInfo;
import main.java.pages.header.UnlogUserInfo;
import main.java.pages.login.LoginForm;
import main.java.pages.user.UserPage;
import main.java.tools.WebDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestLoginForm {
	@Test
	public void testLoginForm() {
		WebDriver webDriver = new WebDriver ();
		UserPage userPage = new UnlogUserInfo().clickSignIn ()
				.writeDefaultCredantional();
		String expected = "Admin admin";
		String actual = userPage.createHeader ().initLogUser ().getUserAccount ();
		assertEquals ( actual, expected );
		webDriver.closeDriver ();
	}
}
