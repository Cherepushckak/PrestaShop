package main.java.test;

import static org.testng.Assert.*;

import io.qameta.allure.*;
import main.java.pages.header.UnlogUserInfo;
import main.java.pages.user.UserPage;
import org.testng.annotations.*;
@Listeners (test.class)


public class TestLoginForm extends test {
	
	@Severity ( SeverityLevel.CRITICAL )
	@Description ( "Verify if customer can log in" )
	@Test
	public void testLoginForm () {
		UserPage userPage = new UnlogUserInfo ().clickSignIn ().getLoginForm ()
				.logIn ( "admin@gmail.com", "admin" );
		String expected = "Admin ";
		String actual = userPage.createHeader ().getLogUserInformation ().getLogUserInfo ().getUserNameFromHeader ();
		assertEquals ( actual, expected );
		
	}
}
