package main.java.test.testnata;

import main.java.pages.header.LogCont;
import main.java.test.test;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Listeners(test.class)

public class ContactUsTest extends test {

    LogCont logCont;
    private WebElement actual;
    private final By contactUsForm = By.cssSelector(".contact-form");

    @BeforeMethod
    public void before() {
        logCont = new LogCont();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verifies opening contctUs form")
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