package pages.Login;

import pages.Register.RegisterForm;
import org.openqa.selenium.WebElement;

/**
 * 
 */
public class LoginForm {
    private WebElement email;
    private WebElement password;
    private WebElement show;
    private WebElement forgotPassword;
    private WebElement signIn;
    private RegisterForm registerForm;
    
    
    /**
     * Default constructor
     */
    public LoginForm() {
        initLogin ( e, p );
    }
    
    public void initLogin(WebElement email, WebElement password){
        this.email = email;
        this.password = password;
    }
}