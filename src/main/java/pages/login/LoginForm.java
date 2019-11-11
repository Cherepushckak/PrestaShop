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
	
	public LoginForm () {
		initLogin ();
	}
	
	public void initLogin () {
		setEmail ();
		setPassword ();
		setForgotPassword ();
		setNoAccount ();
		setShow ();
		setSignIn ();
	}
	
	public WebElement emailClick () {
		getEmail ().click ();
		return email;
	}
	
	public WebElement writeEmailClick ( String email ) {
		emailClick ().sendKeys ( email );
		return this.email;
	}
	
	public WebElement passwordClick () {
		getPassword ().click ();
		return password;
	}
	
	public WebElement writePasswordClick ( String password ) {
		passwordClick ().sendKeys ( password );
		return this.password;
	}
	
	public WebElement showClick () {
		getShow ().click ();
		return show;
	}
	
	public UserPage writeDefaultCredantials ( String email, String password ) {
		writeEmailClick ( email );
		writePasswordClick ( password );
		signInClick ();
		return new UserPage ();
	}
	
	public void signInClick () {
		getSignIn ().click ();
	}
	
	public ForgotPassword forgotPasswordClick () {
		getForgotPassword ().click ();
		return new ForgotPassword ();
	}
	
	public WebElement getEmail () {
		return email;
	}
	
	public WebElement getPassword () {
		return password;
	}
	
	public WebElement getShow () {
		return show;
	}
	
	public WebElement getForgotPassword () {
		return forgotPassword;
	}
	
	public WebElement getSignIn () {
		return signIn;
	}
	
	public WebElement getNoAccount () {
		return noAccount;
	}
	
	public void setEmail () {
		email = WebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > " +
				"div:nth-child(2) input" ) );
	}
	
	public void setPassword () {
		password = WebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > " +
				"div:nth-child(3) > div.col-md-6 > div > input" ) );
	}
	
	public void setShow () {
		show = WebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > " +
				"div:nth-child(3) > div.col-md-6 > div > span > button" ) );
	}
	
	public void setForgotPassword () {
		forgotPassword = WebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > " +
				"div.forgot-password > a" ) );
	}
	
	public void setSignIn () {
		signIn = WebDriver.driver.findElement ( By.cssSelector ( "#submit-login" ) );
	}
	
	public void setNoAccount () {
	}
}