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
import static org.testng.Assert.assertTrue;


public class TestCreateAccountWithoutBirthday extends test {

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that new account can be created without setting user's birthday")
    @Test
    public void TestCreateAccountWithoutBirthday() throws InterruptedException {

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
        user.setBirthday("");

        // create new account according to Users' details
        MainPage mainPageUserRegistered = registerPage
                .regform
                .createAccountFor(user);

        // Assert SignOut button is present on the page, which means User is signed in
        assertTrue(mainPageUserRegistered
                        .initHeaderFull()
                        .getLogUserInformation()
                        .getLogUserInfo()
                        .findSignOut()
                , "User is not signed in");
    }
}
