package main.java.pages.header;

import main.java.pages.main.MainPage;
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

        logo = WebDriver.driver.findElement(By.xpath("//img[@class='logo img-responsive']"));
        contactUS = WebDriver.driver.findElement(By.xpath("//div[@class='row']//div[@id='_desktop_contact_link']"));
    }

    /** method opens homePage          change for method that returns HomePage */
    public MainPage clickLogo() {
        logo.click();
        return new MainPage();
    }

    /** method opens Contact Us form  change for method that returns contactUs page*/
    public void clickContactUS() {
        contactUS.click();
    }
}