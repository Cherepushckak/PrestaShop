package main.java.test.testMaksym;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import main.java.data.User;
import main.java.data.UserRepository;
import main.java.pages.login.LoginPage;
import main.java.pages.main.MainPage;
import main.java.pages.register.RegisterPage;
import main.java.pages.user.UserPage;
import main.java.test.test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class TestUserMayLogInAfterAccountCreation extends test {

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user may login after account creation")
    @Test
    public void testCreateNewUser() throws InterruptedException {

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

        // sign out, Main Page is shown (clickSignOut() is void method)
        mainPageUserRegistered
                .getLogUserInformation()
                .getLogUserInfo()
                .clickSignOut();

        // Sign in with credentials of the newly created User,
        UserPage userPage = new MainPage()
                .clickSignIn()
                .getLoginForm()
                .logIn(user.getEmail(), user.getPassword());


        // Assert SignOut button is present on the page, which means User is signed in
        assertTrue(userPage
                .getLogUserInformation()
                .getLogUserInfo()
                .findSignOut()
                , "User is not signed in");

    }
}
