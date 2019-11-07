<<<<<<< HEAD:src/main/java/Header/LogUserInfo.java
package Header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import

import java.util.*;
=======
package pages.Header;
>>>>>>> 094937e35fd9cbf05a8ff92fda8d44e3c701e858:src/main/java/pages/Header/LogUserInfo.java

/**
 *
 */
public class LogUserInfo {

    /**
     * to sign out from the cabinet
     */
    private WebElement signOut;

<<<<<<< HEAD:src/main/java/Header/LogUserInfo.java
    /**
     * shows name of the user on Header
     */
=======
    /** shows name of the user on pages.Header */
>>>>>>> 094937e35fd9cbf05a8ff92fda8d44e3c701e858:src/main/java/pages/Header/LogUserInfo.java
    private WebElement userAccount;

    /**
     * Default constructor
     */
    public LogUserInfo() {
        signOut = driver.findElement(By.xpath("//div[@class='user-info']//a[@class='logout hidden-sm-down']"));
        userAccount = driver.findElement(By.cssSelector(".account"));
    }

    /**
     * Method sign out from the cabinet
     */
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
