package main.java.pages.Search;


import main.java.pages.Common.APageParent;
import main.java.pages.Common.PagePath;
import main.java.pages.Search.Categories;
import org.openqa.selenium.WebElement;


/**
 * 
 */
public class SearchPage extends APageParent {
    //elements
    private WebElement Description;
    //instants
    private Categories categories;
    private Description description;
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
        //createHeader();

    }

}