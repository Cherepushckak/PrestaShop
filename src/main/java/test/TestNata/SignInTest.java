package main.java.test.TestNata;

import main.java.pages.header.UnlogUserInfo;
import main.java.pages.login.LoginForm;
import main.java.tools.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignInTest {

    WebDriver webDriver = new WebDriver();
    private WebElement runPage;
    private WebElement actual;


    @BeforeMethod
    public void before() {
        webDriver.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.driver.manage().window().maximize();
        runPage = webDriver.driver.findElement(By.xpath("//div[@class='header-top']//img[@class='logo img-responsive']"));
    }



    @Test
    public void signIn(){

        LoginForm loginForm = new UnlogUserInfo().clickSignIn();
        //Act
        actual = webDriver.driver.findElementByCssSelector(".login-form");
        //Assert
        Assert.assertTrue(actual.isDisplayed());
        System.out.println("LogIn form is opened");

    }
    @AfterClass
    public void afterClass(){
        webDriver.closeDriver();
    }
}
