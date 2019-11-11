package main.java.test.TestNata;

import main.java.pages.header.Header;
import main.java.pages.header.HeaderFull;
import main.java.pages.header.LogCont;

import main.java.pages.main.MainPage;
import main.java.pages.main.PopularProducts;
import main.java.pages.search.Product;
import main.java.tools.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class LogContTest {

    WebDriver webDriver = new WebDriver();
    LogCont logCont;
    private WebElement actual;

    @BeforeMethod
    public void before() {
        webDriver.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.driver.manage().window().maximize();
        logCont = new LogCont();
    }

    @Test(priority = 1)
    public void clickContactUsTest() throws InterruptedException {
        //Act
        //No ContactUs page!!!!!!!!!!
        logCont.clickContactUS();
        actual = webDriver.driver.findElement(By.cssSelector(".contact-form"));

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
        List actuallList = mainPage.getPopularProducts().getProducts();
        int actual = actuallList.size();

        Assert.assertEquals(actual, expected);
        System.out.println("list of products is present");
    }


    @AfterClass
    public void afterMethod() {
        webDriver.driver.close();

    }
}