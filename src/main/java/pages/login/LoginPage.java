package main.java.pages.login;

import main.java.pages.common.AParentPage;
import main.java.pages.header.HeaderFull;

/**
 * 
 */
public class LoginPage extends AParentPage {
    /**
     * Default constructor
     */
    public LoginPage() {
        getLoginForm ();
    }
    
    public LoginForm getLoginForm () {
        return new LoginForm ();
    }
}