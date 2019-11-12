package main.java.test;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import org.testng.annotations.AfterTest;
import main.java.tools.OurWebDriver;
@Listeners(test.class)

public class TestCreateNewAddress extends test{


    @Test(priority = 1)
    public void createNewAddress() {
        OurWebDriver webDriver = new OurWebDriver();

    }

    @Test(priority = 2)
    public void createNewAddress2() {
        System.out.println("It WORKs 2! =D");
    }

}
