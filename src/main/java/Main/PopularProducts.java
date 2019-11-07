package Main;


import Search.Product;
import Tools.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.*;

/**
 * 
 */
public class PopularProducts {
    /**
     * List with product items, uses class Product from package Search (it`s the same class we use in main page)
     */
    private List <Product> popularProducts;

    private WebElement allProducts;

    /**
     * Default constructor
     */
    public PopularProducts() {
        initPopularProducts();
    }

    /**
     * method to create list of products
     */

    public void initPopularProducts () {
        popularProducts = new ArrayList<Product>();
        for (WebElement current : WebDriver.driver.findElements(By.cssSelector(".thumbnail-container"))) {
            popularProducts.add(new Product(current));
        }
    }





}