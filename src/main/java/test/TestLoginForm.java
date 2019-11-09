package main.java.test;

import static org.testng.Assert.*;
import main.java.pages.header.UnlogUserInfo;
import main.java.pages.login.LoginForm;
import main.java.tools.WebDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestLoginForm {
	@Test
	public void testLoginForm(){
		WebDriver webDriver = new WebDriver();
		UnlogUserInfo unlogUserInfo = new UnlogUserInfo ();
		unlogUserInfo.clickSignIn ();
		LoginForm loginForm = new LoginForm (  );
		loginForm.writeDefaultCredantional ();
		loginForm.signInClick ();
		String expected = "Admin admin";
		String actual = WebDriver.driver.findElement ( By.cssSelector ( "#_desktop_user_info > div >" +
				" a.account > span" ) ).getText ();
		assertEquals ( actual, expected );
		webDriver.closeDriver ();
	}
}
