package main.java.pages.header;


import com.google.gson.annotations.Until;
import main.java.pages.login.LoginForm;


import main.java.pages.login.LoginPage;
import main.java.tools.OurWebDriver;
import main.java.pages.header.LogCont;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 */
public class UnlogUserInfo extends LogUserInformation {

    /**
     * element signInHeaderFull on HeaderFull
     */
    private WebElement signInHeaderFull;

    /**
     * Default constructor
     */
    public UnlogUserInfo() {

        signInHeaderFull = OurWebDriver.driver.findElement(By.xpath("//div[@class='user-info']//span[@class='hidden-sm-down']"));

    }

    /**
     * method opens LoginForm method
     */

//    public LoginForm clickSignInHeaderFull() {
//        signInHeaderFull.click();
//        return new LoginForm();
//    }
    public LoginPage clickSignInHeaderFull() {

        signInHeaderFull.click();
       return new LoginPage ();

   }
}