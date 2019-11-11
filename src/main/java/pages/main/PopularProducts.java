package main.java.pages.main;



import main.java.tools.WebDriver;
import org.openqa.selenium.By;
import main.java.pages.search.Product;
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


    private WebElement allProducts;
    private String partialProductName;

    /**
     * Default constructor
     */
    public PopularProducts() {
        initPopularProducts();
    }

    /**
     * getter for list of popular products
     */

    public List<Product> getProducts() {
        return products;
    }

    /**
     * method to create list of products and initialization of allProducts field
     */

    private void initPopularProducts() {
        allProducts = WebDriver.driver.findElement(By.cssSelector(".all-product-link.float-xs-left.float-md-right.h4"));
        products = new ArrayList<Product>();
        for (WebElement current : WebDriver.driver.findElements(By.cssSelector(".thumbnail-container"))) {
            products.add(new Product(current));
        }
    }


        /**
         * method to get product by part of name
         */

       public Product getProductByPartialName (String partialProductName) {
            Product result = null;
            for (Product current : getProducts()) {
                if (current.getNameProductText().toLowerCase()
                .contains(partialProductName.toLowerCase())) {
                    result = current;
                    break;
                }
            }
            return result;
        }
    }





