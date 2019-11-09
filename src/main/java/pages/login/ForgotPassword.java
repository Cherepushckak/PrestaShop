package main.java.pages.login;

import org.openqa.selenium.By;
import main.java.tools.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
	private WebElement emailAddress;
	private WebElement sendResetLink;
	private WebElement backToLogin;
	
	public ForgotPassword () {
		initResentLink ();
	}
	
	public void initResentLink(){
		emailAddressClick ();
		sendResetLinkClick ();
		backToLoginClick ();
	}
	
	public WebElement emailAddressClick (){
		emailAddress = WebDriver.driver.findElement ( By.cssSelector ( "#email" ) );
		emailAddress.click ();
		emailAddress.sendKeys ( "admin@gmail.com" );
		return emailAddress;
	}
	
	public WebElement sendResetLinkClick (){
		sendResetLink = WebDriver.driver.findElement ( By.cssSelector ( "#content > form > section > div > " +
				"button.form-control-submit.btn.btn-primary.hidden-xs-down" ) );
		sendResetLink.click ();
		return sendResetLink;
	}
	
	public WebElement backToLoginClick(){
		backToLogin = WebDriver.driver.findElement ( By.cssSelector ( "#main > footer > ul > li > a" ) );
		backToLogin.click ();
		return backToLogin;
	}
	
}
