package main.java.test;


import main.java.pages.header.UnlogUserInfo;
import main.java.pages.login.ForgotLoginMessage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestForgotLogin extends test {
	
	@Test
	public void testForgotPassword(){
		ForgotLoginMessage forgotLoginMessage = new UnlogUserInfo ().clickSignIn ().getLoginForm().forgotPasswordClick ().writeEmail();
	}
}
