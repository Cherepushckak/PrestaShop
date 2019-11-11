package main.java.test;

import main.java.pages.header.UnlogUserInfo;
import main.java.pages.login.ForgotLoginMessage;
import main.java.tools.OurWebDriver;
import org.testng.annotations.Test;

public class TestForgotLogin {
	
	@Test
	public void testForgotPassword(){
		OurWebDriver webDriver = new OurWebDriver();
		ForgotLoginMessage forgotLoginMessage = new UnlogUserInfo ().clickSignIn ().getLoginForm().forgotPasswordClick ().writeEmail();
	}
}
