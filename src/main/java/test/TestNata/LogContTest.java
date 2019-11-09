package main.java.test.TestNata;

import main.java.pages.header.LogCont;
import main.java.pages.header.UnlogUserInfo;
import main.java.pages.login.LoginForm;
import main.java.pages.main.PopularProducts;
import main.java.pages.search.Product;
import main.java.test.TestLoginForm;
import main.java.tools.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class LogContTest {

        WebDriver webDriver = new WebDriver();

    private  WebElement actual;

    @BeforeMethod
    public void beforeTest(){
        WebDriver.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriver.driver.manage().window().maximize();

    }

    @Test
    public void goToMainPage() {

        //Act

      actual =  WebDriver.driver.findElement(By.xpath("//div[@class='header-top']//img[@class='logo img-responsive']"));
      //Assert
        Assert.assertTrue(actual.isDisplayed());
        System.out.println("HomePage");
    }
    @Test
    public void testLoginForm()throws InterruptedException{

        //Using this test temporally!!!!!111y
        UnlogUserInfo unlogUserInfo = new UnlogUserInfo ();
        unlogUserInfo.clickSignIn ();
        LoginForm loginForm = new LoginForm (  );
        loginForm.writeDefaultCredantional ();
        loginForm.signInClick ();




        LogCont logCont = new LogCont();

        //Assert
        logCont.clickLogo();
        actual = WebDriver.driver.findElement(By.cssSelector(".products"));

        Assert.assertTrue(actual.isEnabled());
        System.out.println("list of products is present");
    }


    @AfterMethod
    public void afterMethod() {
       WebDriver.driver.close();

    }
}