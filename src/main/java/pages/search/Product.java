package main.java.pages.search;

import main.java.pages.product.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *Class that describes one container of product
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
     *constructor with
     * @param productContainer
     */
    public Product(WebElement productContainer) {
        this.productContainer = productContainer;
        initProduct();
    }

    /**
     * method to init product fields
     */
    private void initProduct() {
        name = productContainer.findElement(By.cssSelector(".h3.product-title>a"));
    }

    /**
     * getters
     */
    public WebElement getProductContainer() {
        return productContainer;
    }
    public WebElement getName() {
        return name;
    }

    /**
     * atomic click at name method
     */
    private void clickName () {
        name.click();
    }

    /**
     * get name in String format
     * @return name of product
     */
    public String getNameProductText () {
        return getName().getText();
    }

    /**
     * click name and go to Product Page
     * @return Product Page
     */
    public ProductPage goToProductPage() {
        clickName();
        return new ProductPage();
    }
}