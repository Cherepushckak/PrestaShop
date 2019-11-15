package main.java.pages.cart;

import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * aggregation of cart page that describes alert pop-up in case of invalid quantity of products in cart
 */
public class AlertMessage {
    /**
     * fields
     */
    private WebElement message;

    /**
     * default constructor
     */
    public AlertMessage() {
        message = OurWebDriver.driver.findElement(By.cssSelector(".alert.alert-danger"));
    }

    /**
     * getters
     */
    public WebElement getMessage() {
        return message;
    }
}
