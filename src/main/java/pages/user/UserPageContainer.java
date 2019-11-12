package main.java.pages.user;

import main.java.pages.addresses.Addresses;
import main.java.pages.header.HeaderFull;
import main.java.tools.WebDriver;
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
    	actualPageName = WebDriver.driver.findElementByXPath("//section[@id='main']/header/h1");

    	// This is 'Addresses' card-link on Your account page
	    //Correct your address cause it doesn`t work
    	addresses = WebDriver.driver.findElementByXPath("//section[@id='content']/div/div/a[2]/span");
    }

	public WebElement getActualPageName() { return actualPageName; }
	public void setActualPageName(WebElement actualPageName) { this.actualPageName = actualPageName; }

	public WebElement getAddresses() { return addresses; }
	public void setAddresses(WebElement addresses) { this.addresses = addresses; }

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