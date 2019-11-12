package main.java.pages.login;

import org.openqa.selenium.By;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
	private WebElement emailAddress;
	private WebElement sendResetLink;
	private WebElement backToLogin;
	
	public ForgotPassword () {
		initResentLink ();
	}
	
	public void initResentLink(){
		setEmailAddress ();
		setSendResetLink ();
		setBackToLogin ();
	}
	
	public WebElement emailAddressClick (){
		getEmailAddress ().click ();
		return emailAddress;
	}
	
	public ForgotLoginMessage sendResetLinkClick (){
		getSendResetLink ().click ();
		return new ForgotLoginMessage ();
	}
	
	public WebElement backToLoginClick(){
		getBackToLogin ().click ();
		return backToLogin;
	}
	
	public ForgotLoginMessage writeEmail(){
		emailAddressClick ().sendKeys ( "admin@gmail.com" );
		sendResetLinkClick ();
		return new ForgotLoginMessage ();
	}
	
	public WebElement getEmailAddress () {
		return emailAddress;
	}
	
	public void setEmailAddress (  ) {
		emailAddress = OurWebDriver.driver.findElement ( By.cssSelector ( "#email" ) );
	}
	
	public WebElement getSendResetLink () {
		return sendResetLink;
	}
	
	public void setSendResetLink (  ) {
		sendResetLink = OurWebDriver.driver.findElement ( By.cssSelector ( "#content > form > section > div > " +
				"button.form-control-submit.btn.btn-primary.hidden-xs-down" ) );
	}
	
	public WebElement getBackToLogin () {
		return backToLogin;
	}
	
	public void setBackToLogin (  ) {
		backToLogin = OurWebDriver.driver.findElement ( By.cssSelector ( "#main > footer > a" ) );
	}
}
