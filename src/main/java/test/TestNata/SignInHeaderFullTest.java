package main.java.test.TestNata;

import main.java.pages.header.UnlogUserInfo;
import main.java.pages.login.LoginForm;
import main.java.tools.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignInHeaderFullTest {

    WebDriver webDriver = new WebDriver();
    private WebElement actual;


    @BeforeMethod
    public void before() {
        webDriver.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.driver.manage().window().maximize();
    }



    @Test
    public void signIn(){

        //Arrange
        LoginForm loginForm = new UnlogUserInfo().clickSignInHeaderFull();

        //Act
        actual = loginForm.emailClick();

        //Assert
        Assert.assertTrue(actual.isDisplayed());
        System.out.println("LogIn form is opened");

    }
    @AfterClass
    public void afterClass(){
        webDriver.closeDriver();
    }
}
