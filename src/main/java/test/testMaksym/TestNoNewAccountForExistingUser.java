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
import main.java.tools.OurWebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class TestNoNewAccountForExistingUser extends test {

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that new account can not be created for existing user")
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

        // Get existing User
        User user = userRepository
                .getMaria();

        // Try to create new account with existing User's email. Check appropriate error message
        try {
            MainPage mainPageUserRegistered = registerPage
                    .regform
                    .createAccountFor(user);
        } catch (Exception e) {
            WebElement errorMessage = OurWebDriver.driver.findElementByCssSelector(".alert");
            Assert.assertTrue(errorMessage.getText().contains("The email is already used"));
        }
    }
}

