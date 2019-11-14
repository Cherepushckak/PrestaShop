package main.java.pages.register;

import main.java.pages.header.HeaderFull;

public class RegisterPage extends HeaderFull {

    public RegisterForm regform;

    /**
     * Default constructor
     */
    public RegisterPage() {
        super();
        regform = new RegisterForm();
    }

}