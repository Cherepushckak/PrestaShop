package main.java.test.olegstests;

import main.java.helperinstrument.LogInHelper;
import main.java.pages.header.LogUserInformation;
import main.java.pages.login.LoginForm;
import main.java.test.test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Listeners ( test.class)
public class TestNegativeLoginForm extends test{
	@Test
	public void testLoginFormWithWrongData(){
		new LogUserInformation ()
				.getUnloggedUserInfo()
				.clickSignInHeaderFull()
				.getLoginForm ()
				.logInVoid ( "some@gmail.com" , "somes" );
		String expected = "some@gmail.com";
		String actual = new LoginForm ().getEmail ().getAttribute ( "value" );
		assertEquals(actual, expected);
	}
}
