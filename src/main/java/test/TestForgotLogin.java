package main.java.test;

import main.java.pages.header.UnlogUserInfo;
import main.java.pages.login.ForgotLoginMessage;
import main.java.tools.WebDriver;
import org.testng.annotations.Test;

public class TestForgotLogin {
	
	@Test
	public void testForgotPassword(){
		WebDriver webDriver = new WebDriver ();
		ForgotLoginMessage forgotLoginMessage = new UnlogUserInfo ().clickSignIn ().forgotPasswordClick ().writeEmail();
	}
}
