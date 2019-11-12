package main.java.test.TestNata;

import main.java.pages.header.UnlogUserInfo;
import main.java.pages.login.LoginForm;
import main.java.test.test;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
@Listeners ( test.class)

public class SignInTest {

    OurWebDriver webDriver = new OurWebDriver();
    private WebElement runPage;
    private WebElement actual;
    
    @Test
    public void signIn(){

        LoginForm loginForm = new UnlogUserInfo().clickSignIn().getLoginForm();
        //Act
        actual = webDriver.driver.findElementByCssSelector(".login-form");
        //Assert
        Assert.assertTrue(actual.isDisplayed());
        System.out.println("LogIn form is opened");

    }
}
