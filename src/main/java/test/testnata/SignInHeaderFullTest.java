package main.java.test.testnata;

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

    @Test
    public void signIn() {

        //Act
        actual = new UnlogUserInfo().clickSignInHeaderFull().getLoginForm().getEmail();


        //Assert
        Assert.assertTrue(actual.isEnabled());
        System.out.println("LogIn form is opened");

    }

}
