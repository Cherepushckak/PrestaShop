package pages.Addresses;

import org.openqa.selenium.WebElement;
import tools.WebDriver;

/**
 * 
 */
public class Address {

	// Fields
	private WebElement alias;
	private WebElement allFieldsAddress;
	private WebElement updateButton;
	private WebElement deleteButton;

	/**
	 * Default constructor
	 */
	public Address() {
		alias = WebDriver.driver.findElementByXPath("//article[@id='address-13']/div[1]/h4");
		allFieldsAddress = WebDriver.driver.findElementByXPath("//article[@id='address-13']/div[1]/address");
		updateButton = WebDriver.driver.findElementByCssSelector(".address-footer>a:nth-child(1)");
		deleteButton = WebDriver.driver.findElementByCssSelector(".address-footer>a:nth-child(2)");
	}

	// Getters and setters
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
    
	// Click 'Update' button
    public void deleteClick() {
    	deleteButton.click();
    }

}