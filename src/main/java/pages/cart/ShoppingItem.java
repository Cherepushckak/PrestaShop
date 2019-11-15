package main.java.pages.cart;

import main.java.pages.product.ProductPage;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

/**
 * describes one product item in cart
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
     * constructor
     */
    public ShoppingItem(WebElement shoppingItemContainer) {
        initShoppingItem();
    }

    /**
     * initialization of variables
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

    public WebElement getQuantity() {
        return quantity;
    }

    public String getNameText () {
       return getName().getText();
    }

    public double getPriceValue() {
        return Double.parseDouble(getPrice().getText().substring(1));
    }

    public int getQuantityValue() {
        return Integer.parseInt(quantity.getAttribute("value"));
    }

    public double getTotalPriceValue () {
//        clickTotalPrice();
        return Double.parseDouble(getTotalPrice().getText().substring(1));
    }

    public void clickIncreaseQuantity () {
        OurWebDriver.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        increaseQuantity.click();
        OurWebDriver.getWait().until(ExpectedConditions.stalenessOf(quantity));
        OurWebDriver.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void clickDecreaseQuantity () {
        OurWebDriver.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        decreaseQuantity.click();
        OurWebDriver.getWait().until(ExpectedConditions.stalenessOf(quantity));
        OurWebDriver.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public ProductPage clickName () {
        name.click();
        return new ProductPage();
    }

    public void clickBasket () {
        basket.click();
    }

    public void clickTotalPrice () {
        totalPrice.click();
    }

    private void quantityClick () {
        quantity.click();
    }

    private void quantityClear () {
        quantity.sendKeys(Keys.BACK_SPACE);
    }

    private void quantitySetValue (String value) {
        OurWebDriver.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        quantity.sendKeys(value);
        OurWebDriver.getWait().until(ExpectedConditions.visibilityOf(quantity));
        OurWebDriver.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void quantityChangeValue (String value){
        quantityClick();
        quantityClear();
        quantitySetValue(value);
        quantity.sendKeys(Keys.ENTER);
    }

}