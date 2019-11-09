package main.java.pages.user;

import main.java.pages.header.HeaderFull;
import main.java.tools.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 
 */
public class UserPageContainer extends HeaderFull {

	private WebElement actualPageName;
	private WebElement pageName;
	private WebElement address;
	
    /**
     * Default constructor
     */
    public UserPageContainer() {
    	super();
    	// pages.User page elements initialization
	    //We will get text from actualPageName later in test
    	actualPageName = WebDriver.driver.findElement(By.xpath("//*[@id='main']/header/h1"));
    	//Assert.assertTrue(actualPageName.contains("Your account"));
	    //We will get text from pageName later in test
    	pageName = WebDriver.driver.findElement(By.xpath("//*[@id='main']/header/h1"));
    	//Don`t understand what actually you search
    	//address = WebDriver.driver.findElement(By.xpath("//a[@id='addresses-link']"));
    }
    
    // Check container label
    public void pageName() {
    	pageName.getText();
    }
    
    // Click on address link
    public void addressClick() {
    	address.click();
    }
    
}