package main.java.pages.header;

import main.java.pages.login.LoginPage;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 
 */
public class UnlogUserInfo {

    /**
     * element signIn on HeaderFull
     */
    private WebElement signIn;

    /**
     * Default constructor
     */
    public UnlogUserInfo() {
        signIn = OurWebDriver.driver.findElement(By.xpath("//div[@class='user-info']//span[@class='hidden-sm-down']"));
    }

    /**
     * method opens LoginForm method
     */
    public LoginPage clickSignIn() {
        signIn.click();
        return new LoginPage ();
    }
}