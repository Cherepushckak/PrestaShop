package main.java.pages.header;

import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


/**
 * Class HeaderFull is a child class of pages.Header with it;s own fields: clothes, accessories,
 * art, searchField, language, cart, currency, logUserInfo, unlogUserInfo.
 */
public class HeaderFull extends Header {

    private WebElement clothes;
    private WebElement accessories;
    private WebElement art;
    private WebElement searchField;
    private WebElement searchButton;
    private WebElement language;
    private WebElement cart;
    private WebElement currency;
    private LogUserInfo logUserInfo;
    private UnlogUserInfo unlogUserInfo;
    //private WebElement searchProductField;
    //  private WebElement searchProductButton;
    // private WebElement desktop_user_info;

    /**
     * Default constructor
     */
    public HeaderFull() {
        super();
        initLogUser();
        initHeaderFull();

        /**
         if createUser()==true
         logUserInfo = new LogUserInfo();
         else
         unlogUser = new UnlogUserInfo();
         */
        /**
         * if checkCart()==true
         *     currency = driver.find element...
         * else
         *      currency = null;
         */
        /**
         * Також потрібно буде прописати пошук оголошених вище філдів
         */
    }


    private void initLogUser() {

        if (logUserInfo.findSignOut()) {
            LogUserInfo.createLogUser();
        }

    }

    /**
     * Method for constructor, creates part of the HeaderFull Object
     */
    public void initHeaderFull() {

        searchField = OurWebDriver.driver.findElement(By.cssSelector(".ui-autocomplete-input"));
        searchButton = OurWebDriver.driver.findElement(By.xpath("//button[@type='submit']"));
        language = OurWebDriver.driver.findElement(By.cssSelector("//div[@id='_desktop_language_selector']//span[@class='expand-more']"));
        currency = OurWebDriver.driver.findElement(By.cssSelector("#currency-selector-label"));
        cart = OurWebDriver.driver.findElement(By.cssSelector(".header"));
        clothes = OurWebDriver.driver.findElement(By.cssSelector("#category-3"));
        accessories = OurWebDriver.driver.findElement(By.cssSelector("#category-6"));
        art = OurWebDriver.driver.findElement(By.cssSelector("#category-9"));

    }


    // cart = WebDriver.driver.findElement(By.cssSelector(".header"));
//        searchProductField = WebDriver.driver.findElement(By.cssSelector(".ui-autocomplete-input"));
//        searchProductButton = WebDriver.driver.findElement(By.xpath("//button[@type='submit']"));
    //desktop_user_info = WebDriver.driver.findElement(By.cssSelector(".aHS-bnu>div:nth-child(2)>span>a", "#_desktop_user_info"));

//    private boolean checkCart() {
//        boolean result;
//        if (cart.isEnabled())

//            return result;
//    }



}