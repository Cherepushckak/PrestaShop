package main.java.pages.cart;

import main.java.pages.product.ProductPage;
import main.java.tools.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 
 */
public class ShoppingItem {
    /**
     * container of one item
     */

    WebElement shoppingItemContainer;
    /**
     * fields
     */
    private WebElement name;
    private WebElement increaseQuantity;
    private WebElement decreaseQuantity;
    private WebElement price;
    private WebElement totalPrice;
    private WebElement basket;
    private WebElement quantity;



    /**
     * Default constructor
     */
    public ShoppingItem(WebElement shoppingItemContainer) {
        initShoppingItem();
    }

    /**
     * initialization
     */

    private void initShoppingItem () {
        name = WebDriver.driver.findElement(By.cssSelector(".product-line-info>.label"));
        increaseQuantity = WebDriver.driver.findElement(By.cssSelector(".material-icons.touchspin-up"));
        decreaseQuantity = WebDriver.driver.findElement(By.cssSelector(".material-icons.touchspin-down"));
        price = WebDriver.driver.findElement(By.cssSelector(".current-price>.price"));
        totalPrice = WebDriver.driver.findElement(By.cssSelector(".col-md-6.col-xs-2.price>.product-price"));
        basket = WebDriver.driver.findElement(By.cssSelector(".material-icons.float-xs-left"));
        quantity = WebDriver.driver.findElement(By.cssSelector(".js-cart-line-product-quantity.form-control"));
    }


    /**
     * getters
     */

    public WebElement getShoppingItemContainer() {
        return shoppingItemContainer;
    }

    public WebElement getName() {
        return name;
    }

    public WebElement getIncreaseQuantity() {
        return increaseQuantity;
    }

    public WebElement getDecreaseQuantity() {
        return decreaseQuantity;
    }

    public WebElement getPrice() {
        return price;
    }

    public WebElement getTotalPrice() {
        return totalPrice;
    }

    public WebElement getBasket() {
        return basket;
    }

    public String getNameText () {
       return getName().getText();
    }

    public double getPriceValue() {
        return Integer.parseInt(getPrice().getText().replace("₴", "").trim());
    }

    public int getQuantity () {
        return Integer.parseInt(quantity.getCssValue("value"));
    }

    public double getTotalPriceValue () {
        return Integer.parseInt(getTotalPrice().getText().replace("₴", "").trim());
    }

    public void clickIncreaseQuantity () {
        increaseQuantity.click();
    }

    public void clickDecreaseQuantity () {
        decreaseQuantity.click();
    }

    public ProductPage clickName () {
        name.click();
        return new ProductPage();
    }

    public void clickBasket () {
        basket.click();
    }
}