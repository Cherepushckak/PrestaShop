/*
 * main.java.pages.addresses;
 *
 * Version 1.0
 *
 * 09.11.2019
 *
 * Copyright: Made by Volodymyr Zyhmund
 */

package main.java.pages.user;

// Additional packages
import main.java.pages.addresses.Addresses;
import main.java.pages.header.HeaderFull;
import main.java.test.BasicTest;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;

// Listeners are waiting for the error and if it occurs - make a screenshot of error page
@Listeners(BasicTest.class)

// UserPageContainer class
public class UserPageContainer extends HeaderFull {

    // Fields
    public WebElement actualPageName;
    private WebElement addresses;
    private WebElement userInformation;

    // Default constructor
    public UserPageContainer() {
        // Calls extended constructor
    	super();

    	// 'Add new address' and 'Addresses' button locator
        addresses = OurWebDriver.driver.findElementByXPath("//section[@id='content']/div/div/a[2]/span");

        userInformation = OurWebDriver.driver.findElementById("identity-link");
    }

    // Click on 'ADDRESSES' link and return Addresses page
    public Addresses clickAddresses() {
        addresses.click();
        return new Addresses();
    }

    public YourPersonalInformationPage clickUserInformation() {
        userInformation.click();
        return new YourPersonalInformationPage();
    }
}