package main.java.test;

import main.java.tools.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCreateNewAddress {

    @BeforeTest
    public void launchBrowser() {
        System.out.println("\tLaunching Volodya's test suite:\n");
    }

    @Test(priority = 1)
    public void createNewAddress() {
        WebDriver webDriver = new WebDriver();

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
