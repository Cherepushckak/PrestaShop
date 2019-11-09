package main.java.pages.addresses;

import main.java.tools.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Address class
 */
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
		this.addressContainer = WebDriver.driver.findElement(By.xpath("//article[@id='address-13']/div[1]/address"));
		initAddress();
	}

	// Init address
	public void initAddress() {
		alias = WebDriver.driver.findElement(By.xpath("//article[@id='address-13']/div[1]/h4"));
		allFieldsAddress = WebDriver.driver.findElement(By.xpath("//article[@id='address-13']/div[1]/address"));
		updateButton = WebDriver.driver.findElement(By.cssSelector(".address-footer>a:nth-child(1)"));
		deleteButton = WebDriver.driver.findElement(By.cssSelector(".address-footer>a:nth-child(2)"));
	}

	// Getters and setters
	public WebElement getAddressContainer() { return addressContainer; }
	public void setAddressContainer(WebElement addressContainer) { this.addressContainer = addressContainer; }

	public WebElement getAlias() { return alias; }
	public void setAlias(WebElement alias) { this.alias = alias; }

	public WebElement getAllFieldsAddress() { return allFieldsAddress; }
	public void setAllFieldsAddress(WebElement allFieldsAddress) { this.allFieldsAddress = allFieldsAddress; }

	// Click 'Update' button
    public void updateClick() {
    	updateButton.click();
    }
    
	// Click 'Delete' button
    public void deleteClick() {
    	deleteButton.click();
    }

}