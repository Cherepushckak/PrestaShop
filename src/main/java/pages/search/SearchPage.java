package main.java.pages.search;

import main.java.pages.common.AParentPage;
import main.java.pages.common.PagePath;
import main.java.pages.header.HeaderFull;


/**
 * 
 */
public class SearchPage extends AParentPage {
    //elements
    //private WebElement description;
    //instants
    private Categories categories;          //75%
    private Description description;        //25%
    private SortBy sortBy;                  //60%
    private ActiveFilter activeFilter;      //10%
    private PagePath pagePath;              //75%
    //containers
    private Filter filter;                  //60%
    private Products products;              //??%
    /**
     * Default constructor
     */
    public SearchPage() {
        //createHeaderFull();
    }

}