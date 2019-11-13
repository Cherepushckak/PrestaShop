package main.java.test.olegsTests;


import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

import static org.testng.Assert.*;

import io.qameta.allure.*;

import main.java.data.UserRepository;
import main.java.helperInstrument.LogInHelper;
import main.java.pages.header.UnlogUserInfo;
import main.java.pages.user.UserPage;
import main.java.test.test;
import org.testng.annotations.*;
@Listeners( test.class)



public class TestLoginForm extends test {

	@Severity ( SeverityLevel.CRITICAL )
	@Description ( "Verify if customer can log in" )
	@Test
	public void testLoginForm () {

		//change for this!!!!!!!!
// String actual = new LogInHelper().getLogUserInfo().getUserNameFromHeader();
		
		LogInHelper logInHelper = new LogInHelper ();
		
		String expected = "Admin admin";
		String actual = logInHelper.getUserPage ().getLogUserInformation ().getLogUserInfo ().getUserNameFromHeader ();
		assertEquals ( actual, expected );
		
	}

}
