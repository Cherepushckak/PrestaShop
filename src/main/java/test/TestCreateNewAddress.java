package main.java.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import main.java.tools.WebDriver;
import static org.testng.Assert.*;

public class TestCreateNewAddress {

    @BeforeTest
    public void launchBrowser() {
        System.out.println("\tLaunching Volodya's test suite:\n");
    }

    @Test(priority = 1)
    public void createNewAddress() {
        WebDriver webDriver = new WebDriver ();
        UserPage userPage = new UnlogUserInfo().clickSignIn ()
                .writeDefaultCredantional();
        String expected = "Admin admin";
        String actual = userPage.createHeader ().initLogUser ().getUserAccount ();
        assertEquals ( actual, expected );
        webDriver.closeDriver ();
    }

    @Test(priority = 2)
    public void createNewAddress2() {
        System.out.println("It WORKs 2! =D");
    }

    @AfterTest
    public void terminateBrowser() {
        // Close test browser windows to release hardware resources
        WebDriver.driver.quit();
    }
}
