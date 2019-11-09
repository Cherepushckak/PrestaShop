package main.java.pages.header;

import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
        logo = OurWebDriver.driver.findElement(By.cssSelector("h1>a>img"));
        contactUS = OurWebDriver.driver.findElement(By.cssSelector("#contact-link"));
    }

    /** method opens homePage          change for method that returns HomePage */
    public void clickLogo() {
        logo.click();
    }

    /** method opens Contact Us form  change for method that returns contactUs page*/
    public void clickContactUS() {
        contactUS.click();
    }
}