package main.java.pages.header;

import main.java.pages.login.LoginForm;
import main.java.tools.WebDriver;
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
        signIn = WebDriver.driver.findElement(By.xpath("//div[@class='user-info']//span[@class='hidden-sm-down']"));
    }

    /**
     * method opens LoginForm method
     */
    public LoginForm clickSignIn() {
        signIn.click();
        return new LoginForm ();
    }
}