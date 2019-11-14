package main.java.pages.cart;

import main.java.pages.header.HeaderFull;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * 
 */
public class CartPage extends HeaderFull {
    private ShoppingCart shoppingCart;
    private WebElement errorMessage;

    /**
     * Default constructor
     */
    public CartPage() {
        super();
        initShoppingPage();

    }

    public void initShoppingPage() {
        shoppingCart = new ShoppingCart();
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public WebElement getErrorMessage() {
        OurWebDriver.getWait().until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(errorMessage));
        return errorMessage;
    }
}