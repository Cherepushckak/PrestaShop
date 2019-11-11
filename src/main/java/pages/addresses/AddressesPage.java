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

import main.java.pages.common.APageParent;
import main.java.tools.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * AddressesPage class, which extends APageParent class
 */
public class AddressesPage extends APageParent {

	// Fields
    private WebElement homeTopLink;
    private WebElement yourAccountLink;
    private WebElement addresses;
    private WebElement actualPageName;

    private WebElement backToYourAccountLink;
    private WebElement homeLowerLink;

    /**
     * Default constructor
     */
    AddressesPage() {
        homeTopLink();
        yourAccountLink();
        addresses();
        actualPageName();
        initAddressesList();
        backToYourAccountLink();
        homeLowerLink();
    }

    // Array list of all top link divs: "//section[@id='wrapper']/div/nav/ol"
    // Array list of all top link names: "//section[@id='wrapper']/div/nav/ol/li/a/span"
    // Array list of all top links: "//section[@id='wrapper']/div/nav/ol/li/a"

    // Initialise 'Home' top link
    private void homeTopLink() {
        homeTopLink = WebDriver.driver.findElementByXPath("//section[@id='wrapper']/div/nav/ol/li[1]/a/span");
    }

    // Initialise 'Your account' link
    private void yourAccountLink() {
        yourAccountLink = WebDriver.driver.findElementByXPath("//section[@id='wrapper']/div/nav/ol/li[2]/a/span");
    }

    // Initialise 'Addresses' link
    private void addresses() {
        addresses = WebDriver.driver.findElementByXPath("//section[@id='wrapper']/div/nav/ol/li[3]/a/span");
    }

    // Initialise actual page name
    private void actualPageName() {
        actualPageName = WebDriver.driver.findElementByXPath("//section[@id='main']/header/h1/text()");
    }

    // Initialise class addresses
    private void initAddressesList() {
        new Addresses();
    }

    // Array list of all footer link divs: "//section[@id='main']/footer"
    // Array list of all footer link names: "//section[@id='main']/footer/a/span"
    // Array list of all footer links: "//section[@id='main']/footer/a"

    // Initialise '< Back to your account' link
    private void backToYourAccountLink() {
        backToYourAccountLink = WebDriver.driver.findElementByXPath("//section[@id='main']/footer/a[1]");
    }

    // Initialise 'Home' lower link
    private void homeLowerLink() {
        homeLowerLink = WebDriver.driver.findElementByXPath("//section[@id='main']/footer/a[2]");
    }

    // Click 'Home' link
    private void clickHomeTop() { homeTopLink.click(); }

    // Click 'Your account' link
    private void clickYourAccount() { yourAccountLink.click(); }

    // Click 'Addresses' link
    private void clickAddressess() { addresses.click(); }

    // Click '< Back to your account' link
    private void clickBackToYourAccount() { backToYourAccountLink.click(); }

    // Click 'Home Lower' link
    private void clickHome() { homeLowerLink.click(); }
}