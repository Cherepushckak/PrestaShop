package Header;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Tools.WebDriver;

/**
 * Class HeaderFull is a child class of Header with it;s own fields: clothes, accessories,
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
    private WebElement searchProductField;
    private WebElement searchProductButton;
    private WebElement desktop_user_info;
    private LogUserInfo logUserInfo;
    private UnlogUserInfo unlogUserInfo;

    /**
     * Default constructor
     */
    public HeaderFull() {
        super();
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

    private boolean createUser() {
        boolean result;

        /**
         if user logged
         return true
         else
         return false
         */
        if (logUserInfo) {
            this.logUserInfo;
            return result;
        }
    }

    /** Method for constructor, creates part of the HeaderFull Object*/
    public void createHeaderFull() {
        searchProductField = WebDriver.driver.findElement(By.cssSelector(".ui-autocomplete-input"));
        searchProductButton = WebDriver.driver.findElement(By.xpath("//button[@type='submit']"));
        language = WebDriver.driver.findElement(By.cssSelector("//div[@id='_desktop_language_selector']//span[@class='expand-more']"));
        currency = WebDriver.driver.findElement(By.cssSelector("#currency-selector-label"));
        desktop_user_info = WebDriver.driver.findElement(By.cssSelector(".aHS-bnu>div:nth-child(2)>span>a", "#_desktop_user_info"));
        cart = WebDriver.driver.findElement(By.cssSelector(".header"));

    }
    private boolean checkCart(){
        boolean result;
        /**
         * if cart is empty
         *      return false;
         * else
         *      return true;
         */
        return result;
    }

    /**
     * Також потрібно буде пододавати відповідні функції натискання на вею елементи які записані у філдах
     */

}