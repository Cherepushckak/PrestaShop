package pages.Addresses;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 */
public class Addresses {

	private ArrayList<Addresses> addresses;
	private WebDriver driver;
	private WebElement allAddresses;

	/**
	 * Default constructor
	 */
	public Addresses(WebDriver driver) {
		this.driver = driver;
		initAddressesList();
	}

	public ArrayList<Addresses> getAddresses() {
		return addresses;
	}

	public void initAddressesList() {
		allAddresses = driver.findElement(By.cssSelector(".content"));
		addresses = new ArrayList<Addresses>();
		for (WebElement current : driver.findElements(By.cssSelector(".col-lg-4.col-md-6.col-sm-6"))) {
			//addresses.add(new Address(current));
		}
	} 

}