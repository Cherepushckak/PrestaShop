package main.java.pages.header;

import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *
 */
public class LogUserInfo {

    /** to sign out from the cabinet */
    private WebElement signOut;

    /**shows name of the user on Header */
    private WebElement userAccount;

    /** Default constructor */
    public LogUserInfo() {
        signOut = OurWebDriver.driver.findElement(By.xpath("//div[@class='user-info']//a[@class='logout hidden-sm-down']"));
        userAccount = OurWebDriver.driver.findElement(By.cssSelector(".account"));
    }

    /**
     * method create instance of LogUserInfo class;
     * @return instance of LogUserInfo.
     */
    public static LogUserInfo createLogUser(){
        LogUserInfo logUserInfo = new LogUserInfo();
        return logUserInfo;
    }

    /** Method sign out from the cabinet */
    public void clickSignOut() {
        signOut.click();
    }


    /** method find signOut element */
    public boolean findSignOut() {
        return signOut.isEnabled();
    }
    /**
     * Method open 'Your Acount'
     */
    public void clickUserAccount() {
        userAccount.click();
    }
}
