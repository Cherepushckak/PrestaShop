package main.java.test.TestNata;

import main.java.pages.header.LogCont;
import main.java.pages.main.MainPage;
import main.java.test.test;
import main.java.tools.OurWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;
@Listeners(test.class)

public class LogContTest extends test{

    LogCont logCont;
    private WebElement actual;

    @BeforeMethod
    public void before() {
        OurWebDriver.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        logCont = new LogCont();
    }


    @Test(priority = 1)
    public void clickContactUsTest() throws InterruptedException {
        //Act
        //No ContactUs page!!!!!!!!!!
        logCont.clickContactUS();
        actual = OurWebDriver.driver.findElement(By.cssSelector(".contact-form"));

        //Assert
        Assert.assertTrue(actual.isDisplayed());
        System.out.println("contact us page is opened");

    }

    @Test(priority = 2)
    public void clickLogoTest() {

        //Arrange
        int expected = 8;

        //Act
        MainPage mainPage = new LogCont().clickLogo();

        //Assert
        List actualList = mainPage.getPopularProducts().getProducts();
        int actual = actualList.size();

        Assert.assertEquals(actual, expected);
        System.out.println("list of products is present");
    }

}