package main.java.test.olegstests;


import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

import main.java.helperinstrument.LogInHelper;
import main.java.test.test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Listeners(test.class)

public class TestLoginForm extends test {

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify if customer can log in")
    @Test
    public void testLoginForm() {

        LogInHelper logInHelper = new LogInHelper();
        String expected = "Admin admin";
        String actual = logInHelper.getUserPage().getLogUserInformation().getLogUserInfo().getUserNameFromHeader();
        assertEquals(actual, expected);
    }

}
