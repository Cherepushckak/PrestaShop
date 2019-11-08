package main.java.pages.Addresses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 
 */
public class Address {

	// Fields
	private WebElement addressesContainer;
	private WebElement alias;
	private WebElement allFieldsAddress;
	private WebElement updateButton;
	private WebElement deleteButton;

	/**
	 * Default constructor
	 */
	public Address(WebElement addressesContainer) {
		this.addressesContainer = addressesContainer;
		initAddresses();
	}
	
	public void initAddresses () {
		alias = addressesContainer.findElement(By.xpath("//article[@id='address-13']/div[1]/h4"));
		allFieldsAddress = addressesContainer.findElement(By.xpath("//article[@id='address-13']/div[1]/address"));
		updateButton = addressesContainer.findElement(By.cssSelector(".address-footer>a:nth-child(1)"));
		deleteButton = addressesContainer.findElement(By.cssSelector(".address-footer>a:nth-child(2)"));
	}

	// Getters and setters
	public WebElement getAddressesContainer() {
		return addressesContainer;
	}

	public void setAddressesContainer(WebElement addressesContainer) {
		this.addressesContainer = addressesContainer;
	}

	public WebElement getAlias() {
		return alias;
	}

	public void setAlias(WebElement alias) {
		this.alias = alias;
	}

	public WebElement getAllFieldsAddress() {
		return allFieldsAddress;
	}

	public void setAllFieldsAddress(WebElement allFieldsAddress) {
		this.allFieldsAddress = allFieldsAddress;
	}
	
	// Click 'Update' button
    public void updateClick() {
    	updateButton.click();
    }
    
	// Click 'Delete' button
    public void deleteClick() {
    	deleteButton.click();
    }

}