package Header;

import java.util.*;

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