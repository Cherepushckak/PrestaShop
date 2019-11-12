package main.java.pages.login;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import main.java.pages.header.HeaderFull;
import main.java.pages.header.UnlogUserInfo;
import main.java.pages.register.RegisterPage;
import main.java.pages.user.UserPage;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
		setNoAccount();
	}
	
	public WebElement emailClick () {
		getEmail ().click ();
		return email;
	}
	
	@Step("Step 1")
	public WebElement writeEmailClick ( String email ) {
		emailClick ().sendKeys ( email );
		return this.email;
	}
	
	public WebElement passwordClick () {
		getPassword ().click ();
		return password;
	}
	
	@Step("Step 2")
	public WebElement writePasswordClick ( String password ) {
		passwordClick ().sendKeys ( password );
		return this.password;
	}
	
	public WebElement showClick () {
		getShow ().click ();
		return show;
	}
	
	public UserPage logIn ( String email, String password ) {
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

	public RegisterPage noAccountClick () {
		getNoAccount().click();
		return new RegisterPage();
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
		email = OurWebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > " +
				"div:nth-child(2) input" ) );
	}
	
	public void setPassword () {
		password = OurWebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > " +
				"div:nth-child(3) > div.col-md-6 > div > input" ) );
	}
	
	public void setShow () {
		show = OurWebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > " +
				"div:nth-child(3) > div.col-md-6 > div > span > button" ) );
	}
	
	public void setForgotPassword () {
		forgotPassword = OurWebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > " +
				"div.forgot-password > a" ) );
	}
	
	public void setSignIn () {
		signIn = OurWebDriver.driver.findElement ( By.cssSelector ( "#submit-login" ) );
	}
	
	public void setNoAccount () {
		noAccount = OurWebDriver.driver.findElement ( By.cssSelector ( "#content > div > a" ) );
	}

	//Nata created for helper!!!!!!!!!!!
	public UserPage sendKeysToLoginForm(){

		return new HeaderFull().getLogUserInformation().getUnlogogUserInfo().clickSignInHeaderFull().getLoginForm ()
				.logIn ( "admin@gmail.com", "admin" );
	}
}

