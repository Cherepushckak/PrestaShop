package main.java.pages.main;

import main.java.pages.header.HeaderFull;

/**
 * 
 */
public class MainPage extends HeaderFull {

    private PopularProducts popularProducts;

    /**
     * Default constructor
     */
    public MainPage() {
        super();
        initPopularProducts();
    }

    private void initPopularProducts () {
        popularProducts = new PopularProducts();
    }

}