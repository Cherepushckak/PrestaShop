package main.java.test;


import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

import static org.testng.Assert.*;

import io.qameta.allure.*;

import main.java.pages.header.UnlogUserInfo;
import main.java.pages.user.UserPage;
import org.testng.annotations.*;





public class TestLoginForm extends test {

	@Severity ( SeverityLevel.CRITICAL )
	@Description ( "Verify if customer can log in" )
	@Test
	public void testLoginForm () {

		
		UserPage userPage = new UnlogUserInfo ().clickSignInHeaderFull().getLoginForm ()

				.logIn ( "admin@gmail.com", "admin" );
		String expected = "Admin ";
		String actual = userPage.createHeader ().getLogUserInformation ().getLogUserInfo ().getUserNameFromHeader ();

		assertEquals ( actual, expected );
		
	}

}
