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
		email = OurWebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > " +
				"div:nth-child(2) input" ) );
		password = OurWebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > " +
				"div:nth-child(3) > div.col-md-6 > div > input" ) );
		show = OurWebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > " +
				"div:nth-child(3) > div.col-md-6 > div > span > button" ) );
		forgotPassword = OurWebDriver.driver.findElement ( By.cssSelector ( "#login-form > section > " +
				"div.forgot-password > a" ) );
		signIn = OurWebDriver.driver.findElement ( By.cssSelector ( "#submit-login" ) );
		noAccount = OurWebDriver.driver.findElement ( By.cssSelector ( "#content > div > a" ) );
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
	@Step ("Logging in with email/password...")
	public void logInVoid ( String email, String password ) {
		writeEmailClick ( email );
		writePasswordClick ( password );
		signInClick ();
	}
	@Step ("Clicking at the link 'No account? Create one here' to get new RegisterPage")
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
}

