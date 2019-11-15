package main.java.test.olegstests;

import main.java.helperinstrument.LogInHelper;
import main.java.pages.login.LoginForm;
import main.java.test.test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Listeners ( test.class)
public class TestNegativeLoginForm extends test{
	@Test
	public void testLoginFormWithWrongData(){
		LogInHelper logInHelper = new LogInHelper ();
		LoginForm loginForm = new LoginForm ();
		logInHelper.initWrongLogUserInfo ();
		loginForm.emailClick ();
		String expected = "some@gmail.com";
		String actual = loginForm.emailClick ().getText ();
		assertEquals(actual, expected);
	}
}
