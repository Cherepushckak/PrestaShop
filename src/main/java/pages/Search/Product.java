package pages.Search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *
 */
public class Product {
    /**
     * name of product
     */
    private WebElement name;


    /**
     * Default constructor
     */
    public Product() {
        initProduct();
    }

    /**
     * method to init product fields
     */

    public void initProduct() {
        this.name = driver.findElement(By.cssSelector(".h3.product-title>a"));
    }

    public WebElement getName() {
        return name;
    }

    public void setName(WebElement name) {
        this.name = name;
    }

    public void clickProductName() {
        name.click();
    }
}