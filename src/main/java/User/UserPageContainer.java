package User;

import java.util.*;
import Tools.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/**
 * 
 */
public class UserPageContainer {

	private WebElement pageName;
	private WebElement address;
	
    /**
     * Default constructor
     */
    public UserPageContainer() {
    	// User page elements initialization
    	String actualPageName = WebDriver.driver.findElement(By.xpath("//*[@id='main']/header/h1/text()")).getText();
    	Assert.assertTrue(actualPageName.contains("Your account"));
    	pageName = WebDriver.driver.findElement(By.xpath("//*[@id='main']/header/h1/text()"));
    	address = WebDriver.driver.findElement(By.xpath("//a[@id='addresses-link']/span"));
    }
    
    // Check container label
    public void pageName () {
    	pageName.getText();
    }
    
    // Click on address link
    public void addressClick () {
    	address.click();
    }
    
}