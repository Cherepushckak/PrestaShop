package main.java.test.testMaksym;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import main.java.data.User;
import main.java.data.UserRepository;
import main.java.pages.login.LoginPage;
import main.java.pages.main.MainPage;
import main.java.pages.register.RegisterPage;
import main.java.test.test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class TestUserNameIsShownInHeaderAfterAccountCreation extends test {

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that immediately after new user creation, User's name is shown in the header")
    @Test
    public void TestUserNameIsShownInHeaderAfterAccountCreation() throws InterruptedException {

        UserRepository userRepository = new UserRepository();
        MainPage mainPageUserUnregistered = new MainPage();

        // click at sign in button to get new LoginPage
        LoginPage loginPage = mainPageUserUnregistered
                .clickSignIn();

        // click at link "No account? Create one here" to get new RegisterPage
        RegisterPage registerPage = loginPage
                .getLoginForm()
                .noAccountClick();

        // create unique User
        User user = userRepository
                .getUniqueUser();

        // create new account according to Users' details
        MainPage mainPageUserRegistered = registerPage
                .regform
                .createAccountFor(user);

        // actual User name from the Page's header
        String userNameAtTheHeader = mainPageUserRegistered
                .initHeaderFull()
                .getLogUserInformation()
                .getLogUserInfo()
                .getUserNameFromHeader();

        // expected User name
        String userNameFromObjectUser = user.getFirstName() + " " + user.getLastName();

        assertEquals(userNameAtTheHeader, userNameFromObjectUser,
                "Expected user FirstName, LastName are not found in the main page's header after the User was created");
    }
}
