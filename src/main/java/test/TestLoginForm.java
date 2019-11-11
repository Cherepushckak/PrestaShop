package main.java.test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import main.java.pages.header.UnlogUserInfo;
import main.java.pages.user.UserPage;
import main.java.tools.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestLoginForm {
    @BeforeTest
    private void setUpWebDriver() {
        WebDriver webDriver = new WebDriver();
    }

    @AfterTest
    private void closeWebDriver() {
        WebDriver.driver.quit();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify if customer can log in")
    @Test

    public void testLoginForm() {
        UserPage userPage = new UnlogUserInfo().clickSignInHeaderFull()
                .logIn("admin@gmail.com", "admin");
        String expected = "Admin admin";
        String actual = userPage.createHeader().getLogUserInformation().getLogUserInfo().getUserAccount();
        assertEquals(actual, expected);
    }
}
