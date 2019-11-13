package main.java.test;


import main.java.tools.OurWebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
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
