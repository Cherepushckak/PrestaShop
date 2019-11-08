package main.java.pages.Register;

import main.java.pages.Common.APageParent;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends APageParent {

    WebDriver driver;
    private RegisterForm regform;

    /**
     * Default constructor
     */
    public RegisterPage(WebDriver driver) {
        super();
        regform = new RegisterForm(driver);
    }

}