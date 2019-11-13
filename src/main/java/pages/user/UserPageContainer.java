package main.java.pages.user;

import main.java.pages.addresses.Addresses;
import main.java.pages.header.HeaderFull;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 */
public class UserPageContainer extends HeaderFull {

    public WebElement actualPageName;
    private WebElement addresses;

    /**
     * Default constructor
     */
    public UserPageContainer() {
    	super();

    	// pages.user page elements initialization
	    //We will get text from actualPageName later in test

        //---Nata commented xpath is bad!!!!!!!!!!!1-------------------------------
    	//actualPageName = OurWebDriver.driver.findElementByXPath("//*[@id='main']/header/h1");

    	//Assert.assertTrue(actualPageName.contains("Your account"));
	    //We will get text from pageName later in test
    	//pageName = OurWebDriver.driver.findElementByXPath("//*[@id='main']/header/h1");

        // This is 'Addresses' card-link on Your account page
        //Correct your address cause it doesn`t work
        addresses = OurWebDriver.driver.findElementByXPath("//section[@id='content']/div/div/a[2]/span");
    }

    //------Fields commented--------!!!!!!!!!!
    // Check container label
    public void actualPageName() {
        actualPageName.getText();
    }

    // Click on 'ADDRESSES' link and return Addresses page
    public Addresses clickAddresses() {
        addresses.click();
        return new Addresses();
    }

}