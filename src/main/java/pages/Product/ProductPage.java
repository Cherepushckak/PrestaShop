package main.java.pages.Product;

import main.java.pages.Common.APageParent;
import main.java.tools.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *
 */
public class ProductPage extends APageParent {

    /**
     * fields
     */
    private WebElement addToCartButton;
    // private WebDriver driver;

    /**
     * Default constructor
     */
    public ProductPage() {
        super();
        initProductPage();
    }

    /**
     * init field Cart Button
     */
    public void initProductPage() {
        addToCartButton = WebDriver.driver.findElement(By.cssSelector(".btn.btn-primary.add-to-cart"));
    }

    /**
     * getters
     */

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    /**
     * click Cart Button and move to AddedToCart class
     */
    public AddedToCart setAddToCartButtonClick() {
        addToCartButton.click();
        return new AddedToCart();
    }


}