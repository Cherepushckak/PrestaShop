package main.java.pages.User;

import main.java.tools.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/**
 * 
 */
public class UserPageContainer {

	private String actualPageName;
	private WebElement pageName;
	private WebElement address;
	
    /**
     * Default constructor
     */
    public UserPageContainer() {
    	// pages.User page elements initialization
    	actualPageName = WebDriver.driver.findElement(By.xpath("//*[@id='main']/header/h1/text()")).getText();
    	//Assert.assertTrue(actualPageName.contains("Your account"));
    	pageName = WebDriver.driver.findElement(By.xpath("//*[@id='main']/header/h1/text()"));
    	address = WebDriver.driver.findElement(By.xpath("//a[@id='addresses-link']/span"));
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