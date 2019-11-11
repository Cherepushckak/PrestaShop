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

        initLogUserInfo();
    }

    //Changed!!!!!!!!! taken away from constructor!!!!!!!
    public LogUserInfo initLogUserInfo() {
        signOut = OurWebDriver.driver.findElement(By.xpath("//div[@class='user-info']//a[@class='logout hidden-sm-down']"));
        userAccount =OurWebDriver.driver.findElement(By.cssSelector("#_desktop_user_info > div > a.account > span"));
        return new LogUserInfo();

//        signOut = OurWebDriver.driver.findElement(By.xpath("//div[@class='user-info']//a[@class='logout hidden-sm-down']"));
//        userAccount = OurWebDriver.driver.findElement(By.cssSelector("#_desktop_user_info > div > a.account > span"));

    }
    /**
     * method create instance of LogUserInfo class;
     * @return instance of LogUserInfo.
     */
    public static LogUserInfo createLogUser(){
       
        return new LogUserInfo ();
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
    
    public String getUserNameFromHeader() {
        String userName = userAccount.getText ();
        return userName;
    }
}
