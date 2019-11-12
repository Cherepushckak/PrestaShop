package main.java.test;

import main.java.helperInstrument.LogInHelper;
import main.java.tools.OurWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestLoginFormNata extends test {


    @Test
    public void nataTestLoginForm() {

        String actual = new LogInHelper().getLogUserInfo().getUserNameFromHeader();
        String expected = "Admin admin";
        assertEquals(actual, expected);
    }

    @AfterMethod
    public void afterMethod() {
        OurWebDriver.driver.close();
    }
}