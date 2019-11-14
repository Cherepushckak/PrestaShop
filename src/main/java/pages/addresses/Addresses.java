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

    // Fields
    private WebElement addressesList;
    //private WebElement actualAlias;
    private WebElement createNewAddressLink;
    private ArrayList<Address> addressesContainer;

    /**
     * Default constructor
     */
    public Addresses() {}

    public Addresses(WebElement addressesList) {
        this.addressesList = addressesList;
        // Collection of addresses
       // ArrayList<Address> addresses = new ArrayList<>();
        initAddressesContainer(/*addresses*/);
        //actualAlias();
        createNewAddressLink();
    }

    // Initialise list of addresses
    private void initAddressesContainer(/*ArrayList<Address> addresses*/) {
       // addressesList = OurWebDriver.driver.findElementByXPath("//section[@id='content']");
        addressesContainer = new ArrayList<>();
        for (WebElement current : OurWebDriver.driver.findElementsByCssSelector("div.col-sm-6:nth-child(2)")) {
            addressesContainer.add(new Address(current));
        }
    }

//    private void actualAlias() {
//        actualAlias = OurWebDriver.driver.findElementByXPath("//section[@id='main']/section/div/article/div/h4");
//    }

    // Initialise '+ Create new address' link
    private void createNewAddressLink() {
        createNewAddressLink = OurWebDriver.driver.findElementByXPath("//section[@id='content']/div[*]/a");
        // "//text()[contains(.,'Create new address')]"
    }

    // Getters
    public WebElement getAddressesList() { return addressesList; }
//    public WebElement getActualAlias() { return actualAlias; }

    public ArrayList<Address> getAddressesContainer() {
        initAddressesContainer();
        return addressesContainer;
    }

    // Click '+ Create new address' link
    public void clickCreateNewAddressLink() { createNewAddressLink.click(); }
}