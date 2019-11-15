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
import main.java.pages.user.YourPersonalInformationPage;
import main.java.test.test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class TestUserDataIsCorrectAfterAccountCreation extends test {

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that all User details were correctly saved after account creation")
    @Test
    public void TestUserDataIsCorrectAfterAccountCreation() throws InterruptedException {

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

        // User page is opened
        UserPage userPage = mainPageUserRegistered
                .initHeaderFull()
                .getLogUserInformation()
                .getLogUserInfo()
                .clickUserAccount();

        // Your Personal Information Page is opened
        YourPersonalInformationPage ypiPage = userPage
                .getUserPageContainer()
                .clickUserInformation();

        // Verification that all user details are as expected
        ypiPage.checkUserDetailsFor(user);
    }
}
