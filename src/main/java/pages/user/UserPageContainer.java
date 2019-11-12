package main.java.pages.user;

import main.java.pages.header.HeaderFull;
import main.java.pages.header.UnlogUserInfo;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 */
public class UserPageContainer extends HeaderFull {

	private WebElement actualPageName;
	private WebElement pageName;
	private WebElement address;
	
    /**
     * Default constructor
     */
    public UserPageContainer() {
    	super();

    	// pages.user page elements initialization
	    //We will get text from actualPageName later in test
    	actualPageName = OurWebDriver.driver.findElementByXPath("//*[@id='main']/header/h1");

    	//Assert.assertTrue(actualPageName.contains("Your account"));
	    //We will get text from pageName later in test
    	pageName = OurWebDriver.driver.findElementByXPath("//*[@id='main']/header/h1");

    	// This is 'Addresses' card-link on Your account page
	    //Correct your address cause it doesn`t work
    	//address = WebDriver.driver.findElementByXPath("//a[@id='addresses-link']");
    }
    
    // Check container label
    public void pageName() {
    	pageName.getText();
    }
    
    // Click on address link
    public void addressClick() {
    	address.click();
    }


}