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

import main.java.tools.WebDriver;
import org.openqa.selenium.By;
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
    Address(WebElement addressContainer) {
        this.addressContainer = addressContainer;
        initAddress();
    }

    // Init address
    private void initAddress() {
        addressContainer = WebDriver.driver.findElement(By.xpath("//article[@id='address-13']/div[1]/address"));
        alias = WebDriver.driver.findElement(By.xpath("//article[@id='address-13']/div[1]/h4"));
        allFieldsAddress = WebDriver.driver.findElement(By.xpath("//article[@id='address-13']/div[1]/address"));
        updateButton = WebDriver.driver.findElement(By.cssSelector(".address-footer>a:nth-child(1)"));
        deleteButton = WebDriver.driver.findElement(By.cssSelector(".address-footer>a:nth-child(2)"));
    }

    // Getters and setters
    private WebElement getAddressContainer() {
        return addressContainer;
    }

    private void setAddressContainer(WebElement addressContainer) {
        this.addressContainer = addressContainer;
    }

    private WebElement getAlias() {
        return alias;
    }

    private void setAlias(WebElement alias) {
        this.alias = alias;
    }

    private WebElement getAllFieldsAddress() {
        return allFieldsAddress;
    }

    private void setAllFieldsAddress(WebElement allFieldsAddress) {
        this.allFieldsAddress = allFieldsAddress;
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