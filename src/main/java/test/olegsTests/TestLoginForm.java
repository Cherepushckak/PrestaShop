package main.java.test.olegsTests;


import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;



import main.java.helperInstrument.LogInHelper;
import main.java.test.test;
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
		String actual = logInHelper.getUserPage ().initHeaderFull().getLogUserInformation ().getLogUserInfo ().getUserNameFromHeader ();
		assertEquals ( actual, expected );
		
	}

}
