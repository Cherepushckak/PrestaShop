package main.java.pages.cart;

import main.java.tools.WebDriver;
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
        continueShoppingButton = WebDriver.driver.findElement(By.cssSelector(".cart-grid-body>.label"));
        initShoppingItemsList();
    }


    private void initShoppingItemsList() {
        shoppingItemsList = new ArrayList<ShoppingItem>();
        for (WebElement current : WebDriver.driver.findElements(By.cssSelector(".cart-item"))) {
            shoppingItemsList.add(new ShoppingItem(current));
        }
    }

    /**
     * getter
     */

    public WebElement getContinueShoppingButton() {
        return continueShoppingButton;
    }

    public List<ShoppingItem> getShoppingItemsList() {
        initShoppingItemsList();
        return shoppingItemsList;
    }

    /**
     * click Continue shopping and proceed to Main Page
     */

    public void clickContinueShoppingButton() {
        continueShoppingButton.click();
    }
}
