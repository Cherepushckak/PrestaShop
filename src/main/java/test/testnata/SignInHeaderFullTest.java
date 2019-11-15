package main.java.test.testnata;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import main.java.pages.header.UnlogUserInfo;
import main.java.test.test;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(test.class)

public class SignInHeaderFullTest extends test {

    private WebElement actual;

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verifies opening logInForm")
    @Test

    public void signIn() {

        //Act
        actual = new UnlogUserInfo().clickSignInHeaderFull().getLoginForm().getEmail();

        //Assert
        Assert.assertTrue(actual.isEnabled());
        System.out.println("LogIn form is opened");

    }

}
