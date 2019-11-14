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
import main.java.tools.OurWebDriver;
import org.openqa.selenium.WebElement;

// Address class
public class Address {

    // Fields
    private WebElement addressContainer;
    private WebElement alias;
    private WebElement allFieldsAddress;
    private WebElement updateButton;
    private WebElement deleteButton;

    /**
     * Default constructor
     */
    public Address(WebElement addressContainer) {
        this.addressContainer = addressContainer;
        initAddress();
        alias();
    }

    // Init address
    private void initAddress() {
        addressContainer = OurWebDriver.driver.findElementByXPath("//section[@id='content']/div");
        alias = OurWebDriver.driver.findElementByXPath("//section[@id='main']/section/div/article/div/h4");
        allFieldsAddress = OurWebDriver.driver
                .findElementByXPath("//section[@id='main']/section/div/article/div/address");
        updateButton = OurWebDriver.driver.findElementByCssSelector(".address-footer>a:nth-child(1)");
        deleteButton = OurWebDriver.driver.findElementByCssSelector(".address-footer>a:nth-child(2)");
    }

    // Initialise 'alias' link
    private void alias() {
        alias = OurWebDriver.driver.findElementByXPath("//section[@id='main']/section/div/article/div/h4");
    }

    // Getters
    public WebElement getAddressContainer() {
        return addressContainer;
    }
    public WebElement getAlias() {
        return alias; }
    public WebElement getAllFieldsAddress() {
        return allFieldsAddress;
    }

    // Click 'Update' button
    private void updateClick() {
        updateButton.click();
    }

    // Click 'Delete' button
    private void deleteClick() {
        deleteButton.click();
    }
}