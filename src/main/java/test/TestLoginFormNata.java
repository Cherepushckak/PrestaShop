package main.java.test;

import main.java.helperInstrument.UserPageInstrument;
import main.java.pages.header.HeaderFull;
import main.java.pages.header.LogUserInfo;
import main.java.pages.login.LoginPage;
import main.java.pages.user.UserPage;
import main.java.tools.OurWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class TestLoginFormNata extends test {


    @Test
    public void nataTestLoginForm() {

        String actual = new UserPageInstrument().getLogUserInfo().getUserNameFromHeader();
        String expected = "Admin admin";
        assertEquals(actual, expected);
    }

    @AfterMethod
    public void afterMethod() {
        OurWebDriver.driver.close();
    }
}