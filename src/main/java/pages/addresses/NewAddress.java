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
import org.openqa.selenium.WebElement;

// NewAddress class
public class NewAddress {

    // Fields
    private WebElement newAddressContainer;
    private WebElement alias;
    private WebElement firstName;
    private WebElement lastName;
    private WebElement company;
    private WebElement vatNumber;
    private WebElement addr;
    private WebElement addressComplement;
    private WebElement zipPostalCode;
    private WebElement city;
    private WebElement country;
    private WebElement phone;
    private WebElement saveButton;

    /**
     * Default constructor
     */
    NewAddress(WebElement newAddressContainer) {
        this.newAddressContainer = newAddressContainer;
        initNewAddress();
    }

    // Init address
    private void initNewAddress() {
        newAddressContainer = WebDriver.driver.findElementByCssSelector("#content");
        alias = WebDriver.driver.findElementByXPath("//section[@id='content']/div/div/form/section/div[1]/div[1]/input");
        firstName = WebDriver.driver.findElementByXPath("//section[@id='content']/div/div/form/section/div[2]/div[1]/input");
        lastName = WebDriver.driver.findElementByXPath("//section[@id='content']/div/div/form/section/div[3]/div[1]/input");
        company = WebDriver.driver.findElementByXPath("//section[@id='content']/div/div/form/section/div[4]/div[1]/input");
        vatNumber = WebDriver.driver.findElementByXPath("//section[@id='content']/div/div/form/section/div[5]/div[1]/input");
        addr = WebDriver.driver.findElementByXPath("//section[@id='content']/div/div/form/section/div[6]/div[1]/input");
        addressComplement = WebDriver.driver.findElementByXPath("//section[@id='content']/div/div/form/section/div[7]/div[1]/input");
        zipPostalCode = WebDriver.driver.findElementByXPath("//section[@id='content']/div/div/form/section/div[8]/div[1]/input");
        city = WebDriver.driver.findElementByXPath("//section[@id='content']/div/div/form/section/div[9]/div[1]/input");
        country = WebDriver.driver.findElementByXPath("//section[@id='content']/div/div/form/section/div[10]/div[1]/select");
        phone = WebDriver.driver.findElementByXPath("//section[@id='content']/div/div/form/section/div[11]/div[1]/input");
        saveButton = WebDriver.driver.findElementByCssSelector("button.btn");
    }

    // Getters and setters
    public WebElement getNewAddressContainer() { return newAddressContainer; }
    public void setNewAddressContainer(WebElement newAddressContainer) { this.newAddressContainer = newAddressContainer; }

    public WebElement getAlias() { return alias; }
    public void setAlias(WebElement alias) { this.alias = alias; }

    public WebElement getFirstName() { return firstName; }
    public void setFirstName(WebElement firstName) { this.firstName = firstName; }

    public WebElement getLastName() { return lastName; }
    public void setLastName(WebElement lastName) { this.lastName = lastName; }

    public WebElement getCompany() { return company; }
    public void setCompany(WebElement company) { this.company = company; }

    public WebElement getVatNumber() { return vatNumber; }
    public void setVatNumber(WebElement vatNumber) { this.vatNumber = vatNumber; }

    public WebElement getAddr() { return addr; }
    public void setAddr(WebElement addr) { this.addr = addr; }

    public WebElement getAddressComplement() { return addressComplement; }
    public void setAddressComplement(WebElement addressComplement) { this.addressComplement = addressComplement; }

    public WebElement getZipPostalCode() { return zipPostalCode; }
    public void setZipPostalCode(WebElement zipPostalCode) { this.zipPostalCode = zipPostalCode; }

    public WebElement getCity() { return city; }
    public void setCity(WebElement city) { this.city = city; }

    public WebElement getCountry() { return country; }
    public void setCountry(WebElement country) { this.country = country; }

    public WebElement getPhone() { return phone; }
    public void setPhone(WebElement phone) { this.phone = phone; }

    // Click 'SAVE' button
    private void saveClick() {
        saveButton.click();
    }
}