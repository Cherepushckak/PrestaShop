package main.java.pages.search;

import main.java.pages.common.PagePath;
import main.java.pages.common.ParentPage;


/**
 * 
 */
public class SearchPage extends ParentPage {
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
    }

    //geters
    public Categories getCategories() {
        categories = new Categories();
        return categories;
    }

    public Description getDescription(){
        description = new Description();
        return description;
    }

    public PagePath getPagePath(){
        pagePath = new PagePath();
        return pagePath;
    }

    public SortBy getSortBy(){
        sortBy = new SortBy();
        return sortBy;
    }
}