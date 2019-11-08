package main.java.pages.login;

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
    
    public LoginForm ( String email, String password ) {
        
        emailClick ().sendKeys ( email );
        passwordClick ().sendKeys ( password );
        
        
    }
    
    public void initLogin () {
        WebDriver webDriver = new WebDriver ();
        webDriver.driver.get ( "http://3.124.147.74/index.php?controller=authentication&back=my-account" );
//		writeDefaultCredantional ();
//		showClick ();
//		signInClick ();
        forgotPasswordClick ();
    }
    
    public WebElement emailClick () {
        email = WebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > " +
                "div:nth-child(2) input" ) );
        email.click ();
        return email;
    }
    
    public WebElement passwordClick () {
        password = WebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > " +
                "div:nth-child(3) > div.col-md-6 > div > input" ) );
        password.click ();
        return password;
    }
    
    public WebElement showClick (  ){
        show = WebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > " +
                "div:nth-child(3) > div.col-md-6 > div > span > button" ) );
        show.click ();
        return show;
    }
    
    public void writeDefaultCredantional () {
        emailClick ().sendKeys ( "admin@gmail.com" );
        passwordClick ().sendKeys ( "admin" );
    }
    
    public WebElement signInClick(){
        signIn = WebDriver.driver.findElement ( By.cssSelector ( "#submit-login" ) );
        signIn.click ();
        return signIn;
    }
    
    public ForgotPassword forgotPasswordClick(){
        forgotPassword = WebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > div.forgot-password > a" ) );
        forgotPassword.click ();
        ForgotPassword fPassword = new ForgotPassword ();
        return fPassword;
    }
}