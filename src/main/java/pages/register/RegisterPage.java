package main.java.pages.register;

import main.java.pages.common.APageParent;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends APageParent {

    WebDriver driver;
    public RegisterForm regform;

    /**
     * Default constructor
     */
    public RegisterPage(WebDriver driver) {
        super();
        regform = new RegisterForm(driver);
    }

}