package main.java.pages.cart;

import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertMessage {
    private WebElement message;

    public AlertMessage() {
        message = OurWebDriver.driver.findElement(By.cssSelector(".alert.alert-danger"));
    }

    public WebElement getMessage() {
        return message;
    }

}
