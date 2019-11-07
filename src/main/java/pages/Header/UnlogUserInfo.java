<<<<<<< HEAD:src/main/java/Header/UnlogUserInfo.java
package Header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.*;
=======
package pages.Header;
>>>>>>> 094937e35fd9cbf05a8ff92fda8d44e3c701e858:src/main/java/pages/Header/UnlogUserInfo.java

/**
 * 
 */
public class UnlogUserInfo {

    /** element signIn on HeaderFull */
    private WebElement signIn;

    /** Default constructor */
    public UnlogUserInfo() {
        signIn = driver.findElement(By.xpath("//div[@class='user-info']//span[@class='hidden-sm-down']"));
    }

    /**
     * method opens LoginForm
     */
    public void clickSignIn() {
        signIn.click();
    }

}