package main.java.test.TestMaksym;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import main.java.data.User;
import main.java.data.UserRepository;
import main.java.pages.login.LoginPage;
import main.java.pages.main.MainPage;
import main.java.pages.register.RegisterPage;
import main.java.pages.user.UserPage;
import main.java.pages.user.YourPersonalInformationPage;
import main.java.test.test;

import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class TestNewUser extends test {

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify creation of the new user account")
    @Test
    public void testCreateNewUser() throws InterruptedException {

        UserRepository userRepository = new UserRepository();

        MainPage mainPageUserUnregistered = new MainPage();
        Thread.sleep(500); // for demonstration purposes only

        // click at sign in button to get new LoginPage
        LoginPage loginPage = mainPageUserUnregistered.clickSignIn();
        Thread.sleep(500); // for demonstration purposes only

        // click at link "No account? Create one here" to get new RegisterPage
        RegisterPage registerPage = loginPage.getLoginForm().noAccountClick();
        Thread.sleep(500); // for demonstration purposes only

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

        // User page is opened
        UserPage userPage = mainPageUserRegistered.getLogUserInformation().getLogUserInfo().clickUserAccount();
        Thread.sleep(500); // for demonstration purposes only

        // Your Personal Information Page is opened
        YourPersonalInformationPage ypiPage = userPage.getUserPageContainer().clickUserInformation();
        Thread.sleep(500); // for demonstration purposes only

        // Verification that all user details are as expected
        ypiPage.checkUserDetailsFor(user);

        // sign out, loginPage is shown
        ypiPage.getLogUserInformation().getLogUserInfo().clickSignOut();
        loginPage = new LoginPage();
        Thread.sleep(500); // for demonstration purposes only

        // Sign in with credentials of the newly created User, YourPersonalInformationPage is shown
        loginPage.getLoginForm().logInVoid(user.getEmail(), user.getPassword());
        YourPersonalInformationPage ypiPage1 = new YourPersonalInformationPage();
        Thread.sleep(500); // for demonstration purposes only

        // actual User name from the Page's header
        userNameAtTheHeader = ypiPage1.getLogUserInformation().getLogUserInfo().getUserNameFromHeader();

        // Verification that user was really signed in
        assertEquals(userNameAtTheHeader, userNameFromObjectUser,
                "Expected user FirstName, LastName is not found in the main page's header after the User was signed in");
    }
}
