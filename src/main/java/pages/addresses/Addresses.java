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
import java.util.ArrayList;
import org.openqa.selenium.WebElement;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;



// Addresses class
public class Addresses {

    // Fields
    private WebElement addressesList;
    private ArrayList<Address> addressesContainer;
    private WebElement createNewAddressLink;
    private WebElement alert;

    /**
     * Default constructor
     */
    public Addresses() {}

    public Addresses(WebElement addressesList) {
        this.addressesList = addressesList;
        initAddressesContainer();
        createNewAddressLink();
        alert();
    }

    // Initialise list of addresses
    private void initAddressesContainer() {
        addressesContainer = new ArrayList<>();
        for (WebElement current : OurWebDriver.driver.findElementsByCssSelector("div.col-sm-6:nth-child(2)")) {
            addressesContainer.add(new Address(current));
        }
    }

    // Initialise '+ Create new address' link
    private void createNewAddressLink() {
        createNewAddressLink = OurWebDriver.driver.findElementByXPath("//section[@id='content']/div[*]/a");
    }

    // Initialise 'Alert'
    private void alert() {
        alert = OurWebDriver.driver.findElementByXPath("//aside[@id='notifications']/div/article/ul");
    }

    // Getters
    public WebElement getAddressesList() { return addressesList; }
    public WebElement getAlert() {
        alert();
        return alert; }

    public ArrayList<Address> getAddressesContainer() {
        initAddressesContainer();
        return addressesContainer;
    }

    // Click '+ Create new address' link
    public void clickCreateNewAddressLink() { createNewAddressLink.click(); }
}