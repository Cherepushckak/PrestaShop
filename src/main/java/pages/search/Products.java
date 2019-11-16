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
    //Nata added wait
    public Products() {
    }

    public ArrayList<Product> getProducts(){
        for (WebElement p : OurWebDriver.driver.findElements(By.cssSelector(".thumbnail-container"))) {
            this.products.add(new Product(p));
        }
        return products;
        //getProductsArrayList();
    }

    //Nata created for test!!!!!!!!
    public ArrayList<Product> getProductsArrayList() {
        for (WebElement p : OurWebDriver.driver.findElements(By.cssSelector(".thumbnail-container"))) {
            this.products.add(new Product(p));
            // OurWebDriver.getWait().until(org.openqa.selenium.support.ui.ExpectedConditions.numberOfElementsToBe((By.xpath("//div[@class='thumbnail-container']")),5));
        }
        return products;
    }

    public int getProductsCount() {
        return getProductsArrayList().size();
    }

}