package Header;

import java.util.*;

/**
 * Тут треба буде створити дві змінні типу WebElement
 * В них записати ссилки на лого і на contactUS
 * І зрбити це в конструкторі
 * Після того добавити методи: clickLogo i clickContactUS
 */
public class LogCont {

    public WebElement logo;
    public WebElement contactUS;
    /**
     * Default constructor
     */
    public LogCont() {
        //logo = driver.findElementByXpath("//a/img[@class='logo img-responsive']");
        // contactUS = driver.findElementByXpath...
    }

    public void clickLogo() {
        logo.click();
    }

    public void clickContactUS() {
        contactUS.click();
    }
}