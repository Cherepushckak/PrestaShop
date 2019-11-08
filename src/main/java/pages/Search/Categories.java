package main.java.pages.Search;

import main.java.tools.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.util.Locale;

>>>>>>> c5217616128c234952f78025e319a8de3d33d7b2
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