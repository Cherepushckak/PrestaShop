package main.java.pages.product;

import main.java.pages.common.AParentPage;
import main.java.pages.header.HeaderFull;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *class that describes product page
 */
public class ProductPage extends AParentPage {

    /**
     * fields
     */
    private ProductInfo productInfo;

    /**
     * Default constructor
     */
    public ProductPage() {
        super();
        initProductPage();
    }

    /**
     * initialisation of fields
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