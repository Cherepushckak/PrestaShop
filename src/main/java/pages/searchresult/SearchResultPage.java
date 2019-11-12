package main.java.pages.searchresult;

import main.java.pages.header.HeaderFull;
import main.java.pages.search.Products;

public class SearchResultPage extends HeaderFull {

    private Products products;
    /**
     * Default constructor
     */
    public SearchResultPage() {
        super();
        products = new Products();
    }

    public Products getProducts(){
        return products;
    }

}
