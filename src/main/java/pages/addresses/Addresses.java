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

// Addresses class
public class Addresses {

    // Collection of addresses
    private ArrayList<Address> addresses = new ArrayList<>();

    // Fields
    private WebElement addressesList;
    private WebElement createNewAddressLink;

    /**
     * Default constructor
     */
    public Addresses() {}

    public Addresses(WebElement addressesList) {
        this.addressesList = addressesList;
        initAddressesList(addresses);
        createNewAddressLink();
    }

    // Initialise list of addresses
    private void initAddressesList(ArrayList<Address> addresses) {
        addressesList = OurWebDriver.driver.findElementByXPath("//section[@id='content']");
        for (WebElement current : OurWebDriver.driver.findElementsByCssSelector("div.col-sm-6:nth-child(2)")) {
            addresses.add(new Address(current));
        }
    }

    // Initialise '+ Create new address' link
    private void createNewAddressLink() {
        createNewAddressLink = OurWebDriver.driver.findElementByXPath("//section[@id='content']/div[3]/a");
    }

    // Getters and setters
    public WebElement getAddressesList() { return addressesList; }
    public void setAddressesList(WebElement addressesList) { this.addressesList = addressesList; }

    public WebElement getCreateNewAddressLink() { return createNewAddressLink; }
    public void setCreateNewAddressLink(WebElement createNewAddressLink) { this.createNewAddressLink = createNewAddressLink; }

    // Click '+ Create new address' link
    public void clickCreateNewAddressLink() {
        createNewAddressLink.click();
    }

}