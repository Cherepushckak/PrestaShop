package main.java.pages.search;

import main.java.pages.product.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *
 */
public class Product {
    /**
     * container of one product
     */
    private WebElement productContainer;
    /**
     * name of product
     */
    private WebElement name;


    /**
     * Default constructor
     */
    public Product(WebElement productContainer) {
        this.productContainer = productContainer;
        initProduct();
    }

    /**
     * method to init product fields
     */

    public void initProduct() {
        name = productContainer.findElement(By.cssSelector(".h3.product-title>a"));
    }

    /**
     * getter for productContainer
     */

    public WebElement getProductContainer() {
        return productContainer;
    }

    /**
     * name
     */

    //getter

    public WebElement getName() {
        return name;
    }

    //name click

    public ProductPage clickProductName() {
        name.click();
        return new ProductPage();
    }

    //get name in String format

    public String getNameProductText () {
        return getName().getText();
    }

}