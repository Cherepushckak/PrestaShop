package main.java.pages.search;


import main.java.pages.common.APageParent;
import main.java.pages.common.PagePath;
import org.openqa.selenium.WebElement;


/**
 * 
 */
public class SearchPage extends APageParent {
    //elements
    //private WebElement description;
    //instants
    private Categories categories;          //75%
    private Description description;        //
    private SortBy sortBy;
    private ActiveFilter activeFilter;
    private PagePath pagePath;
    //containers
    private Filter filter;
    private Products products;
    /**
     * Default constructor
     */
    public SearchPage() {
        //createHeaderFull();
    }

}