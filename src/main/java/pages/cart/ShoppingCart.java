package main.java.pages.cart;

import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

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
        initShoppingItemsList();
    }


    private void initShoppingItemsList() {
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

    public List<ShoppingItem> getShoppingItemsList() {
        initShoppingItemsList();
        return shoppingItemsList;
    }

    public void deleteAllFromCart() {
        OurWebDriver.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        for (ShoppingItem current : shoppingItemsList) {
            if (current.getBasket().isEnabled()) {
                current.clickBasket();
            } else {
                break;
            }
        }
        OurWebDriver.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".no-items")));
        OurWebDriver.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    /**
     * click Continue shopping and proceed to Main Page
     */

    public void clickContinueShoppingButton() {
        continueShoppingButton.click();
    }
}
