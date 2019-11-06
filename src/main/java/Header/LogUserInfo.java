package Header;

import java.util.*;

/**
 *
 */
public class LogUserInfo {

    /** to sign out from the cabinet */
    private WebElement signOut;

    /** shows name of the user on Header */
    private WebElement userAccount;

    /**
     * Default constructor
     */
    public LogUserInfo() {
        signOUt = driver.findElement(By.xpath("//div[@class='user-info']//a[@class='logout hidden-sm-down']"));
        userAccount = driver.findElement(By.cssSelector(".account"));
    }

    /**
     * Method sign out from the cabinet
     */
    public void clickSignOut() {
        signOut.click();
    }

    /**
     * Method open 'Your Acount'
     */
    public void clickUserAccount() {
        userAccount.click();
    }
    public void findSignOut(){
        if(signOut.isEvailable)
    }
}
