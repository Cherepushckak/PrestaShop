package main.java.pages.search;

import main.java.tools.OurWebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

/**
 * Use method selectSort, with int argument variant of sorting
 * Use template:
 * Sort by:
 *      Relevance           > 0
 *      Name, A to Z        > 1
 *      Name, Z to A        > 2
 *      Price, low to high  > 3
 *      Price, high to low  > 4
 */
public class SortBy {

    private ArrayList<WebElement> sortTypes = new ArrayList<WebElement>();
    /**
     * Default constructor
     */
    public SortBy() {
    }

    /**
     * Maybe I will need to rewrite this method in future, if test will be fallen
     * @param index
     */
    public void selectSort(int index){
        sortTypes.get(index).click();
    }

    public ArrayList<WebElement> getSortTypes(){
        sortTypes.addAll(OurWebDriver.driver.findElementsByXPath("//div[@class='dropdown-menu']//a"));
        return sortTypes;
    }

}