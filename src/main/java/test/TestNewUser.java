//package main.java.test;
//
//import main.java.data.User;
//import main.java.data.UserRepository;
//import main.java.pages.main.MainPage;
//import main.java.pages.register.RegisterPage;
//import main.java.tools.OurWebDriver;
//import org.testng.annotations.Test;
//
//public class TestNewUser {
//	@Test
//	public void testCreateNewUser() throws InterruptedException {
//
//		OurWebDriver webDriver = new OurWebDriver();
//		UserRepository userRepository = new UserRepository();
//
//		// method should be implemented at Main Page
//		// it click at SignIn button and return new SignIn page
//		//webDriver.driver.get("http://3.124.147.74/index.php?controller=authentication");
//
//
//		// method should be implemented at at SignIn page
//		// it should click at link "No account? Create one here" and should return new RegisterPage
//
//
//		// open new user Page as alternative to mentioned above
//		webDriver.driver.get("http://3.124.147.74/index.php?controller=authentication&create_account=1");
//
//		RegisterPage registerPage = new RegisterPage(webDriver.driver);
//		User user = userRepository.getUniqueUser();
//		MainPage mainPage = registerPage.regform.createAccountFor(user);
//
//		//TODO  add verification
//
//		webDriver.closeDriver ();
//	}
//}
