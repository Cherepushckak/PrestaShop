package main.java.pages.main;

import main.java.pages.header.HeaderFull;
import main.java.pages.login.LoginPage;

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

    public LoginPage clickSignIn() {
        return getLogUserInformation().getUnlogogUserInfo().clickSignIn(); // takes method from headerFull
    }   // takes method from headerFull. init class for unlogged user . uses its method click
}