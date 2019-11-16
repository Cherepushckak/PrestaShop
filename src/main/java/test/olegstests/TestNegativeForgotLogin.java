package main.java.test.olegstests;

import main.java.pages.header.LogUserInformation;
import main.java.pages.header.UnlogUserInfo;
import main.java.pages.login.ForgotLoginMessage;
import main.java.pages.login.LoginForm;
import main.java.test.test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Listeners ( test.class )
public class TestNegativeForgotLogin {
	@Test
	public void testNegativeForgotLogin () {
		 new UnlogUserInfo ()
				.clickSignInHeaderFull ()
				.getLoginForm ()
				.forgotPasswordClick ()
				.writeNegativeEmail ( "someEmail" );
		String expected = "some@gmail.com";
		String actual = new LoginForm ().getEmail ().getAttribute ( "value" );
		assertEquals ( actual, expected );
	}
}
