package main.java.pages.Search;

import org.openqa.selenium.WebElement;
import tools.WebDriver;
import java.util.ArrayList;
/**
 * 
 */
public class Categories {

    private WebElement categoryName;
    private ArrayList<Category> categories;
    /**
     * Default constructor
     */
    public Categories() {
        categoryName = WebDriver.driver.findElementByXPath("//a[@class='text-uppercase h6']");

        ArrayList<Category> temp;

        for (WebElement c: WebDriver.driver.findElementsByXPath("//li[@data-depth='0']")) {
            categories.add(new Category(c));
        }
        //categories = (ArrayList<WebElement>) WebDriver.driver.findElementsByXPath("//li[@data-depth=0]/a");
    }

    public String getCategoryName(){
        return categoryName.getText();
    }

    public void clickCategoryName(){
        categoryName.click();
    }

    public void clickCategory(int index) {
        //categories.get(index).click();
    }


}