package main.java.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import main.java.tools.OurWebDriver;

public class TestCreateNewAddress {

    @BeforeTest
    public void launchBrowser() {
        System.out.println("\tLaunching Volodya's test suite:\n");
    }

    @Test(priority = 1)
    public void createNewAddress() {
        OurWebDriver webDriver = new OurWebDriver();

    }

    @Test(priority = 2)
    public void createNewAddress2() {
        System.out.println("It WORKs 2! =D");
    }

    @AfterTest
    public void terminateBrowser() {
        // Close test browser windows to release hardware resources
        OurWebDriver.driver.quit();
    }
}
