package main.java.pages.search;

import main.java.tools.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.Locale;
/**
 * 
 */
public class Categories {

    private WebElement categoryName;
    private ArrayList<Locale.Category> categories;
    /**
     * Default constructor
     */
    public Categories() {
        categoryName = WebDriver.driver.findElementByXPath("//a[@class='text-uppercase h6']");

        ArrayList<Category> temp;

        for (WebElement c: WebDriver.driver.findElementsByXPath("//li[@data-depth='0']")) {
            //categories.add(new Category(c));
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