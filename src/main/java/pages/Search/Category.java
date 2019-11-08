package main.java.pages.Search;

import org.openqa.selenium.WebElement;
import tools.WebDriver;

import java.util.ArrayList;

public class Category {

    private WebElement self;
    private String categoryName;
    private ArrayList<WebElement> subCategory;
    private WebElement collapse;
    private boolean isCollapsed;

    public Category(WebElement self){
        this.self = self;
        categoryName = self.getText();
        isCollapsed = false;
        //subCategory = WebDriver.driver.findElementsByXPath("");
    }

    public void addSubCategory(WebElement subCategory){
        this.subCategory.add(subCategory);
    }

    //public void open

}
