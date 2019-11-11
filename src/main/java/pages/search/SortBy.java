package main.java.pages.search;

import main.java.tools.WebDriver;
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

    private ArrayList<WebElement> sortType;
    /**
     * Default constructor
     */
    public SortBy() {
        for( WebElement s : WebDriver.driver.findElementsByXPath("//div[@class='dropdown-menu']//a")) {
            sortType.add(s);
        }
    }

    /**
     * Maybe I will need to rewrite this method in future, if test will be fallen
     * @param index
     */
    public void selectSort(int index){
        sortType.get(index).click();
    }


}