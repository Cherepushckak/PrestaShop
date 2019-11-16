/*
 * main.java.pages.addresses;
 *
 * Version 1.0
 *
 * 09.11.2019
 *
 * Copyright: Made by Volodymyr Zyhmund
 */

package main.java.pages.addresses;

// Additional packages

import main.java.pages.common.AParentPage;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.WebElement;

/**
 * AddressesPage class, which extends APageParent class
 */
public class AddressesPage extends AParentPage {

    // Fields
    private WebElement homeTopLink;
    private WebElement yourAccountLink;
    private WebElement actualPageName;
    private WebElement backToYourAccountLink;
    private WebElement homeLowerLink;
    private WebElement createNewAddressLink;
    private Addresses addressesList;

    /**
     * Default constructor
     */
    public AddressesPage() {
        homeTopLink();
        yourAccountLink();
        actualPageName();
        initAddressesList();
        backToYourAccountLink();
        homeLowerLink();
        //createNewAddressLink();
    }

    // Array list of all top link divs: "//section[@id='wrapper']/div/nav/ol"
    // Array list of all top link names: "//section[@id='wrapper']/div/nav/ol/li/a/span"
    // Array list of all top links: "//section[@id='wrapper']/div/nav/ol/li/a"

    // Initialise 'Home' top link
    private void homeTopLink() {
        homeTopLink = OurWebDriver.driver.findElementByXPath("//section[@id='wrapper']/div/nav/ol/li[1]/a/span");
    }

    // Initialise 'Your account' link
    private void yourAccountLink() {
        yourAccountLink = OurWebDriver.driver.findElementByXPath("//section[@id='wrapper']/div/nav/ol/li[2]/a/span");
    }

    // Initialise actual page name
    private void actualPageName() {
        actualPageName = OurWebDriver.driver.findElementByXPath("//section[@id='main']/header/h1");
    }

    // Initialise class addresses
    private void initAddressesList() {
        addressesList = new Addresses();
    }

    // Array list of all footer link divs: "//section[@id='main']/footer"
    // Array list of all footer link names: "//section[@id='main']/footer/a/span"
    // Array list of all footer links: "//section[@id='main']/footer/a"

    // Initialise '+ Create new address' link
    private void createNewAddressLink() {
        createNewAddressLink = OurWebDriver.driver.findElementByXPath("//section[@id='content']/div[*]/a");
    }

    // Initialise '< Back to your account' link
    private void backToYourAccountLink() {
        backToYourAccountLink = OurWebDriver.driver.findElementByXPath("//section[@id='main']/footer/a[1]");
    }

    // Initialise 'Home' lower link
    private void homeLowerLink() {
        homeLowerLink = OurWebDriver.driver.findElementByXPath("//section[@id='main']/footer/a[2]");
    }

    // Getters
    public WebElement getHomeTopLink() { return homeTopLink; }
    public WebElement getYourAccountLink() { return yourAccountLink; }
    public Addresses getAddressesList() { return addressesList; }
    public WebElement getActualPageName() { return actualPageName; }
    public WebElement getBackToYourAccountLink() { return backToYourAccountLink; }
    public WebElement getHomeLowerLink() { return homeLowerLink; }

    // Click 'Home' link
    public void clickHomeTop() { homeTopLink.click(); }

    // Click 'Your account' link
    public void clickYourAccount() { yourAccountLink.click(); }

    // Click '+ Create new address' link
    public void clickCreateNewAddressLink() { createNewAddressLink.click(); }

    // Click '< Back to your account' link
    public void clickBackToYourAccount() { backToYourAccountLink.click(); }

    // Click 'Home Lower' link
    public void clickHome() { homeLowerLink.click(); }
}