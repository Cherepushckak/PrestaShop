package main.java.pages.header;

import main.java.tools.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


/**
 * Class contains webElement: logo and Contact Us
 */
public class LogCont {

    /** element 'MyStore' on the pages.Header */
    private WebElement logo;

    /** element 'ContactUS' on pages.Header*/
    private WebElement contactUS;
    /**
     * Default constructor
     */
    public LogCont() {
        logo = WebDriver.driver.findElement(By.xpath("//header[@id='header']//div[@class='col-md-2 hidden-sm-down']"));

   //     logo = WebDriver.driver.findElement(By.cssSelector("#_desktop_logo > h1 > a"));

        contactUS = WebDriver.driver.findElement(By.cssSelector("#contact-link"));
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