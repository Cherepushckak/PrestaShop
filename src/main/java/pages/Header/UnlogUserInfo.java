package main.java.pages.Header;

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
    public void clickSignIn() {
        signIn.click();
        //////////  change method so it can return LoginForm page////////////
//    public void clickSignIn() {
//        LoginForm loginForm = new LoginForm();
//        signIn.click();
//        return loginForm.initLogin();
//
//    }

    }
}