package Header;

import java.util.*;

/**
 * 
 */
public class LogUserInfo {

    private WebElement signOut;
    private WebElement userAccount;
    /**
     * Default constructor
     */
    public LogUserInfo() {
        //signOut = driver.find....
        //userAccount = driver.find...
    }

    public clickSignOut() {
        signOut.click();
    }

    public clickUserAccount() {
        userAccount.click();
    }

}