package main.java.test;


import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import main.java.pages.header.UnlogUserInfo;
import main.java.pages.user.UserPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
@Listeners(test.class)



public class TestLoginForm extends test {

	@Severity ( SeverityLevel.CRITICAL )
	@Description ( "Verify if customer can log in" )
	@Test
	public void testLoginForm () {

		//change for this!!!!!!!!
// String actual = new LogInHelper().getLogUserInfo().getUserNameFromHeader();
		
		UserPage userPage = new UnlogUserInfo ().clickSignInHeaderFull().getLoginForm ()
				.logIn ( "admin@gmail.com", "admin" );
		String expected = "Admin ";
		String actual = userPage.getLogUserInformation ().getLogUserInfo ().getUserNameFromHeader ();
		assertEquals ( actual, expected );
		
	}

}
