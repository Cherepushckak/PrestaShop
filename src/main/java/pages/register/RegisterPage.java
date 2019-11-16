package main.java.pages.register;

import main.java.pages.common.AParentPage;
import main.java.pages.header.HeaderFull;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends AParentPage {

    public RegisterForm regform;

    /**
     * Default constructor
     */
    public RegisterPage() {
        super();
        regform = new RegisterForm();
    }

}