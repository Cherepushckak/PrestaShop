package main.java.pages.cart;

import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class ShoppingCart {

    private WebElement continueShoppingButton;
    private List<ShoppingItem> shoppingItemsList;

    /**
     * Default constructor
     */
    public ShoppingCart() {
        initShoppingCart();
    }

    /**
     * initialization method
     */

    private void initShoppingCart() {
        continueShoppingButton = OurWebDriver.driver.findElement(By.cssSelector(".cart-grid-body>.label"));
        shoppingItemsList = new ArrayList<ShoppingItem>();
        for (WebElement current : OurWebDriver.driver.findElements(By.cssSelector(".cart-item"))) {
            shoppingItemsList.add(new ShoppingItem(current));
        }
    }

    /**
     * getter
     */

    public WebElement getContinueShoppingButton() {
        return continueShoppingButton;
    }

    /**
     * click Continue shopping and proceed to Main Page
     */

    public void clickContinueShoppingButton () {
        continueShoppingButton.click();
    }
}