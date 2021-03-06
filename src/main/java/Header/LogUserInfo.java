package Header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import

import java.util.*;

/**
 *
 */
public class LogUserInfo {

    /**
     * to sign out from the cabinet
     */
    private WebElement signOut;

    /**
     * shows name of the user on Header
     */
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
