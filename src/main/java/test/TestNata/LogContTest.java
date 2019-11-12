package main.java.test.TestNata;

import main.java.pages.header.LogCont;

import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public class LogContTest {

    OurWebDriver webDriver = new OurWebDriver();
    LogCont logCont;
    private WebElement runPage;
    private WebElement actual;

    @BeforeMethod
    public void before() {
        webDriver.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.driver.manage().window().maximize();
        logCont = new LogCont();
        runPage = webDriver.driver.findElement(By.xpath("//div[@class='header-top']//img[@class='logo img-responsive']"));
    }

    @Test(priority = 1)
    public void clickContactUsTest() throws InterruptedException {
        //Act

        logCont.clickContactUS();
        actual = webDriver.driver.findElement(By.cssSelector(".contact-form"));

        //Assert
        Assert.assertTrue(actual.isDisplayed());
        System.out.println("contact us page is opened");

    }
    @Test(priority = 2)
    public void clickLogoTest() {

        //Act
        logCont.clickLogo();

        //Assert
        actual = webDriver.driver.findElement(By.cssSelector(".products"));

        Assert.assertTrue(actual.isEnabled());
        System.out.println("list of products is present");
    }



    @AfterClass
    public void afterMethod() {
        webDriver.driver.close();

    }
}