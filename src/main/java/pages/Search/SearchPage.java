package pages.Search;

import org.openqa.selenium.WebElement;
import pages.Common.APageParent;

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