package pages.Main;



//import Tools.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Search.Product;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class PopularProducts {
    /**
     * List with product items, uses class pages.Product from package pages.Search (it`s the same class we use in main page)
     */
    private List<Product> products;

    private WebDriver driver;

    private WebElement allProducts;

    /**
     * Default constructor
     */
    public PopularProducts(WebDriver driver) {
        this.driver = driver;
        initPopularProducts();
    }

    /**
     * getter for list of popular products
     */

    public List<Product> getProducts() {
        return products;
    }

    /**
     * method to create list of products
     */

    public void initPopularProducts () {
        allProducts = driver.findElement(By.cssSelector(".all-product-link.float-xs-left.float-md-right.h4"));
        products = new ArrayList<Product>();
        for (WebElement current : driver.findElements(By.cssSelector(".thumbnail-container"))) {
            products.add(new Product(current));
        }
    }





}