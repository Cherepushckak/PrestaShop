package main.java.pages.login;

import main.java.pages.user.UserPage;
import main.java.tools.WebDriver;
import org.openqa.selenium.By;
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
    private WebElement noAccount;
    
    
    /**
     * Default constructor
     */
    public LoginForm () {
        initLogin ();
    }
    
//    public LoginForm ( String email, String password ) {
//        this.email = WebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > " +
//                "div:nth-child(2) input" ) );
//        this.password = WebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > " +
//                "div:nth-child(3) > div.col-md-6 > div > input" ) );
//        this.show = WebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > " +
//                "div:nth-child(3) > div.col-md-6 > div > span > button" ) );
//        this.signIn = WebDriver.driver.findElement ( By.cssSelector ( "#submit-login" ) );
//        this.forgotPassword = WebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > " +
//                "div.forgot-password > a" ) );
//        emailClick ().sendKeys ( email );
//        passwordClick ().sendKeys ( password );
//    }
    
    public void initLogin () {
        email = WebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > " +
                "div:nth-child(2) input" ) );
        password = WebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > " +
                "div:nth-child(3) > div.col-md-6 > div > input" ) );
        show = WebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > " +
                "div:nth-child(3) > div.col-md-6 > div > span > button" ) );
        signIn = WebDriver.driver.findElement ( By.cssSelector ( "#submit-login" ) );
        forgotPassword = WebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > " +
                "div.forgot-password > a" ) );
        
    }
    
    public WebElement emailClick () {
        email.click ();
        return email;
    }
    
    public WebElement passwordClick () {
        password.click ();
        return password;
    }
    
    public WebElement showClick (  ){
        show.click ();
        return show;
    }
    
    public UserPage writeDefaultCredantional () {
        emailClick ().sendKeys ( "admin@gmail.com" );
        passwordClick ().sendKeys ( "admin" );
        signInClick ();
        return new UserPage();
    }
    
    public void signInClick(){
        signIn.click ();
    }
    
    public ForgotPassword forgotPasswordClick(){
        forgotPassword.click ();
        ForgotPassword fPassword = new ForgotPassword ();
        return fPassword;
    }
}