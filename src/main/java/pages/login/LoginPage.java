package main.java.pages.login;

import main.java.pages.header.HeaderFull;

/**
 * 
 */
public class LoginPage extends HeaderFull {
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