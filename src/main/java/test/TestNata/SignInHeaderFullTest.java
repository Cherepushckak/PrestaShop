package main.java.test.TestNata;

import main.java.pages.header.UnlogUserInfo;
import main.java.pages.login.LoginPage;
import main.java.test.test;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
@Listeners(test.class)

public class SignInHeaderFullTest extends test {

    private WebElement actual;
    
    @BeforeMethod
    public void before() {
        OurWebDriver.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    
    @Test
    public void signIn() {

        //Arrange

        LoginPage loginPage = new UnlogUserInfo().clickSignInHeaderFull();

        //Act
        actual = loginPage.getLoginForm().emailClick();

        //Assert
        Assert.assertTrue(actual.isDisplayed());
        System.out.println("LogIn form is opened");

    }

}
