package main.java.test.TestMaksym;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import main.java.data.User;
import main.java.data.UserRepository;
import main.java.pages.login.LoginPage;
import main.java.pages.main.MainPage;
import main.java.pages.register.RegisterPage;
import main.java.test.test;
import main.java.tools.OurWebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestNewUser extends test {

	@Severity( SeverityLevel.CRITICAL )
	@Description( "Verify if new user account can be created" )
	@Test
	public void testCreateNewUser() throws InterruptedException {

		OurWebDriver webDriver = new OurWebDriver();
		UserRepository userRepository = new UserRepository();

		MainPage mainPageUserUnregistered = new MainPage();
		Thread.sleep(2000); // for demonstration purposes only

		// click at sign in button to get new LoginPage
		LoginPage loginPage = mainPageUserUnregistered.clickSignIn();
		Thread.sleep(2000); // for demonstration purposes only

		// click at link "No account? Create one here" to get new RegisterPage
		RegisterPage registerPage = loginPage.getLoginForm().noAccountClick();
		Thread.sleep(2000); // for demonstration purposes only

		// create unique User
		User user = userRepository.getUniqueUser();

		// create new account according to Users' details
		MainPage mainPageUserRegistered = registerPage.regform.createAccountFor(user);

		// actual User name from the Page's header
		String userNameAtTheHeader = mainPageUserRegistered.getLogUserInformation().getLogUserInfo().getUserNameFromHeader();

		// expected User name
		String userNameFromObjectUser = user.getFirstName() + " " + user.getLastName();

		assertEquals(userNameAtTheHeader, userNameFromObjectUser,
				"Expected user FirstName, LastName is not found in the main page's header after the User was created");

		webDriver.closeDriver ();
	}
}
