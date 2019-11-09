package main.java.pages.addresses;

import main.java.tools.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 
 */
public class Addresses {

    // Fields
    private WebElement path;

    private WebElement createNewAddressButton;

    /**
     * Default constructor
     */
//    public Addresses() {
//    	ArrayList<Addresses> addresses = new ArrayList<Addresses>();
//
//    	addresses.add();
//    }

    public void createNewAddressButton() {
        createNewAddressButton = WebDriver.driver.findElement(By.xpath("//section[@id='content']/div[4]/a"));
    }

    // Click '+ Create new address' button
    public void createNewAddressClick() {
        createNewAddressButton.click();
    }
    
}