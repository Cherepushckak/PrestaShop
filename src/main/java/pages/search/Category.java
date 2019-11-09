package main.java.pages.search;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class Category {

    private WebElement self;
    private String categoryName;
    private ArrayList<WebElement> subCategory;

    public Category(WebElement self){
        this.self = self;
        categoryName = self.getText();
        //subCategory = WebDriver.driver.findElementsByXPath("");
    }
}
