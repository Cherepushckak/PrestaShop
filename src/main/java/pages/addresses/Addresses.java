package main.java.pages.addresses;

import main.java.tools.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;

/**
 * Addresses class
 */
public class Addresses {

    ArrayList<Address> addresses = new ArrayList<>();

    // Fields
    private WebElement homeTopLink;
    private WebElement yourAccountLink;
    private String actualPageName;
    private WebElement addressesList;
    private WebElement createNewAddressLink;
    private WebElement backToYourAccountLink;
    private WebElement homeLowerLink;

    /**
     * Default constructor
     */
    public Addresses() {
        homeTopLink();
        yourAccountLink();
        actualPageName();
        initAddressesList(addresses);
        createNewAddressLink();
        backToYourAccountLink();
        homeLowerLink();
    }

    private void homeTopLink() {
        homeTopLink = WebDriver.driver.findElementByXPath("//section[@id='wrapper']/div/nav/ol/li[1]/a/span");
    }

    private void yourAccountLink() {
        yourAccountLink = WebDriver.driver.findElementByXPath("//section[@id='wrapper']/div/nav/ol/li[2]/a/span");
    }

    private void actualPageName() {
        actualPageName = WebDriver.driver.findElementByXPath("//*[@id='main']/header/h1/text()").getText();
    }

    private void initAddressesList(ArrayList<Address> addresses) {
        addressesList = WebDriver.driver.findElementByXPath("//section[@id='content']");
        for (WebElement current : WebDriver.driver.findElementsByCssSelector("div.col-sm-6:nth-child(2)")) {
            addresses.add(new Address(current));
        }
    }

    private void createNewAddressLink() {
        createNewAddressLink = WebDriver.driver.findElementByXPath("//section[@id='content']/div[4]/a");
    }

    private void backToYourAccountLink() {
        backToYourAccountLink = WebDriver.driver.findElementByXPath("//section[@id='main']/footer/a[1]");
    }

    private void homeLowerLink() {
        homeLowerLink = WebDriver.driver.findElementByXPath("//section[@id='main']/footer/a[2]");
    }

    // Click 'Home top' link
    public void homeTopClick() {
        homeTopLink.click();
    }

    // Click 'Your account' link
    public void yourAccountClick() {
        yourAccountLink.click();
    }

    // Click '+ Create new address' link
    public void createNewAddressClick() {
        createNewAddressLink.click();
    }

    // Click '< Back to your account' link
    public void backToYourAccountClick() {
        backToYourAccountLink.click();
    }

    // Click 'Home Lower' link
    public void homeClick() {
        homeLowerLink.click();
    }
    
}