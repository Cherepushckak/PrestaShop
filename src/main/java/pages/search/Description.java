package main.java.pages.search;

import main.java.tools.OurWebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 */
public class Description {

    private WebElement descriptionName;

    /**
     * Default constructor
     */
    public Description() {
    }

    public String getDescriptionName(){
        descriptionName = OurWebDriver.driver.findElementByXPath("//div[@class='block-category card card-block']/h1");
        return descriptionName.getText();
    }

}