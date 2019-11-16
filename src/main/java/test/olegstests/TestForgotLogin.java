package main.java.test.olegstests;


import main.java.pages.header.UnlogUserInfo;
import main.java.pages.login.ForgotLoginMessage;
import main.java.test.test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners( test.class)



public class TestForgotLogin extends test {
	
	@Test
	public void testForgotPassword(){
		ForgotLoginMessage forgotLoginMessage = new UnlogUserInfo ()
				.clickSignInHeaderFull ()
				.getLoginForm ()
				.forgotPasswordClick ()
				.writeEmail ();
	}
}


