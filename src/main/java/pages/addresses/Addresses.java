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

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import main.java.tools.OurWebDriver;

// Addresses class
public class Addresses {

    // Fields
    private WebElement addressesList;
    private WebElement createNewAddressLink;
    private ArrayList<Address> addressesContainer;
    private WebElement alert;

    // Default constructor
    public Addresses() {}

    public Addresses(WebElement addressesList) {
        this.addressesList = addressesList;
        initAddressesContainer();
        createNewAddressLink();
        alert();
    }

    @Step("Get addresses collection")
    private void initAddressesContainer() {
        addressesContainer = new ArrayList<>();
        for (WebElement current : OurWebDriver.driver.findElementsByCssSelector("div.col-sm-6:nth-child(2)")) {
            addressesContainer.add(new Address(current));
        }
    }

    @Step("Initialize '+ Create new address' link")
    private void createNewAddressLink() {
        createNewAddressLink = OurWebDriver.driver.findElementByXPath("//section[@id='content']/div[*]/a");
    }

    @Step("Initialize 'Alert'")
    private void alert() {
        alert = OurWebDriver.driver.findElementByXPath("//aside[@id='notifications']/div/article/ul");
    }

    // Getters
    @Step("Return addresses list")
    public WebElement getAddressesList() {
        return addressesList;
    }

    @Step("Return alert")
    public WebElement getAlert() {
        alert();
        return alert; }

    @Step("Initialize list of addresses")
    public ArrayList<Address> getAddressesContainer() {
        initAddressesContainer();
        return addressesContainer;
    }

    @Step("Click '+ Create new address' link")
    public NewAddress clickCreateNewAddressLink() {
        createNewAddressLink.click();
        return new NewAddress();
    }
}