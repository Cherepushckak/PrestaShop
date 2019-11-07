package Login;

import tools.WebDriver;

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
	
	public LoginForm ( String email, String password ) {
		
		emailClick ().sendKeys ( email );
		passwordClick ().sendKeys ( password );
		
	}
	
	public void initLogin () {
		WebDriver webDriver = new WebDriver ();
		webDriver.driver.get ( "http://3.124.147.74/index.php?controller=authentication&back=my-account" );
		writeDefaultCredantional ();
		showClick ();
	}
	
	public WebElement emailClick () {
		WebElement clickEmail = WebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > " +
				"div:nth-child(2) input" ) );
		clickEmail.click ();
		return clickEmail;
	}
	
	public WebElement passwordClick () {
		WebElement clickPassword = WebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > " +
				"div:nth-child(3) > div.col-md-6 > div > input" ) );
		clickPassword.click ();
		return clickPassword;
	}
	
	public WebElement showClick (  ){
		WebElement clickShow = WebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > " +
				"div:nth-child(3) > div.col-md-6 > div > span > button" ) );
		clickShow.click ();
		return clickShow;
	}
	
	public void writeDefaultCredantional () {
		emailClick ().sendKeys ( "admin@gmail.com" );
		passwordClick ().sendKeys ( "admin" );
	}
}