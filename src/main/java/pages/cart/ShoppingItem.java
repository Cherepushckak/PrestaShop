package main.java.pages.cart;

import main.java.pages.product.ProductPage;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * 
 */
public class ShoppingItem {
    /**
     * container of one item
     */

    private WebElement shoppingItemContainer;
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
        name = OurWebDriver.driver.findElement(By.cssSelector(".product-line-info>.label"));
        increaseQuantity = OurWebDriver.driver.findElement(By.cssSelector(".material-icons.touchspin-up"));
        decreaseQuantity = OurWebDriver.driver.findElement(By.cssSelector(".material-icons.touchspin-down"));
        price = OurWebDriver.driver.findElement(By.cssSelector(".current-price>.price"));
        totalPrice = OurWebDriver.driver.findElement(By.cssSelector(".col-md-6.col-xs-2.price>.product-price"));
        basket = OurWebDriver.driver.findElement(By.cssSelector(".material-icons.float-xs-left"));
        quantity = OurWebDriver.driver.findElement(By.cssSelector(".js-cart-line-product-quantity.form-control"));
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
        return Double.parseDouble(getPrice().getText().replace("₴", "").trim());
    }

    public int getQuantity () {
        return Integer.parseInt(quantity.getCssValue("value"));
    }

    public double getTotalPriceValue () {
        return Double.parseDouble(getTotalPrice().getText().replace("₴", "").trim());
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