package main.java.test.TestNata;

import main.java.pages.header.LogCont;
import main.java.test.test;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(test.class)

public class ContactUsTest extends test{

    LogCont logCont;
    private WebElement actual;
    private final By contactUsForm = By.cssSelector(".contact-form");

    @BeforeMethod
    public void before() {
        logCont = new LogCont();
    }


    @Test
    public void clickContactUsTest() {

        //No ContactUs page!!!!!!!!!!
        logCont.clickContactUS();
        actual = OurWebDriver.driver.findElement(contactUsForm);

        //Assert
        Assert.assertTrue(actual.isDisplayed());
        System.out.println("contact us page is opened");

    }

}