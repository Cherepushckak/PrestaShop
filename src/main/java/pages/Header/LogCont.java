<<<<<<< HEAD:src/main/java/Header/LogCont.java
package Header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;
=======
package pages.Header;
>>>>>>> 094937e35fd9cbf05a8ff92fda8d44e3c701e858:src/main/java/pages/Header/LogCont.java

/**
 * Class contains webElement: logo and Contact Us
 */
public class LogCont {

    /** element 'MyStore' on the pages.Header */
    public WebElement logo;

    /** element 'ContactUS' on pages.Header*/
    public WebElement contactUS;
    /**
     * Default constructor
     */
    public LogCont() {
        logo = driver.findElement(By.cssSelector("h1>a>img"));
        contactUS = driver.findElement(By.cssSelector("#contact-link"));
    }

    /** method opens homePage */
    public void clickLogo() {
        logo.click();
    }

    /** method opens Contact Us form*/
    public void clickContactUS() {
        contactUS.click();
    }
}