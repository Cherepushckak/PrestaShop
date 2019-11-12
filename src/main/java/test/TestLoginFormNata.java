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
    UserPageInstrument userPageInstrument;

    @BeforeMethod
    public void beforeMethod() {
        userPageInstrument = new UserPageInstrument();


    }

    @Test
    public void nataTestLoginForm() {
      // LogUserInfo logUserInfo =
       //UserPage userPage = new HeaderFull().getLogUserInformation().getUnlogogUserInfo().clickSignInHeaderFull().getLoginForm().sendKeysToLoginForm();
       // userPageInstrument.initLogUserInfoText();
        String actual = new UserPageInstrument().getLogUserInfo().getUserNameFromHeader(); //logUserInfo.getUserNameFromHeader();
        String expected = "Admin ";
        assertEquals(actual, expected);
    }

    @AfterMethod
    public void afterMethod() {
        OurWebDriver.driver.close();
    }
}