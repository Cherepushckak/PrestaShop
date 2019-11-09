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
import main.java.tools.WebDriver;

// Addresses class
public class Addresses {

    // Collection of addresses
    ArrayList<Address> addresses = new ArrayList<>();

    // Fields
    private WebElement addressesList;
    private WebElement createNewAddressLink;

    /**
     * Default constructor
     */
    Addresses() {
        initAddressesList(addresses);
        createNewAddressLink();
    }

    // Initialise list of addresses
    private void initAddressesList(ArrayList<Address> addresses) {
        addressesList = WebDriver.driver.findElementByXPath("//section[@id='content']");
        for (WebElement current : WebDriver.driver.findElementsByCssSelector("div.col-sm-6:nth-child(2)")) {
            addresses.add(new Address(current));
        }
    }

    // Initialise '+ Create new address' link
    private void createNewAddressLink() {
        createNewAddressLink = WebDriver.driver.findElementByXPath("//section[@id='content']/div[4]/a");
    }

    // Getters and setters
    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }

    public WebElement getAddressesList() {
        return addressesList;
    }

    public void setAddressesList(WebElement addressesList) {
        this.addressesList = addressesList;
    }

    // Click '+ Create new address' link
    private void createNewAddressClick() {
        createNewAddressLink.click();
    }

}