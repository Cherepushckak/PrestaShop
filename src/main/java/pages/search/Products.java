package main.java.pages.search;

import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

/**
 * 
 */
public class Products {

    private ArrayList<Product> products = new ArrayList<Product>();

    /**
     * Default constructor
     */
    public Products() {
        for (WebElement p : OurWebDriver.driver.findElements(By.cssSelector(".thumbnail-container"))) {
                this.products.add(new Product(p));
        }
    }

    public int getProductsCount() {
        return products.size();
    }




}