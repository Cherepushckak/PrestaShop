package main.java.pages.product;

import main.java.pages.header.HeaderFull;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *
 */
public class ProductPage extends HeaderFull {

    /**
     * fields
     */
    private ProductInfo productInfo;
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
        productInfo = new ProductInfo();
    }

    /**
     * getters
     */

    public ProductInfo getProductInfo() {
        return productInfo;
    }
}