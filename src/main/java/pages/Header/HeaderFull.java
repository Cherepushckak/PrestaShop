package pages.Header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
<<<<<<< HEAD:src/main/java/Header/HeaderFull.java
import org.openqa.selenium.chrome.ChromeDriver;
=======
import tools.WebDriver;
>>>>>>> 094937e35fd9cbf05a8ff92fda8d44e3c701e858:src/main/java/pages/Header/HeaderFull.java

/**
 * Class HeaderFull is a child class of pages.Header with it;s own fields: clothes, accessories,
 * art, searchField, language, cart, currency, logUserInfo, unlogUserInfo.
 */
public class HeaderFull extends Header {
    WebDriver driver = new ChromeDriver();

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
        checkLogUser();
        ini
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

    private boolean checkLogUser() {

        /**
         if user logged
         return true
         else
         return false
         */
        if (logUserInfo.findSignOut()) {

        if (logUserInfo) {
            this.logUserInfo;
            return result;
        }
            return true;

    }
    public void createLogUser(){
            logUserInfo = new LogUserInfo();

    }

    /** Method for constructor, creates part of the HeaderFull Object*/
    public void initHeaderFull () {
        searchField = driver.findElement(By.cssSelector(".ui-autocomplete-input"));
        searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
        language = driver.findElement(By.cssSelector("//div[@id='_desktop_language_selector']//span[@class='expand-more']"));
        currency = driver.findElement(By.cssSelector("#currency-selector-label"));
        cart = driver.findElement(By.cssSelector(".header"));
        searchProductField = WebDriver.driver.findElement(By.cssSelector(".ui-autocomplete-input"));
        searchProductButton = WebDriver.driver.findElement(By.xpath("//button[@type='submit']"));
        language = WebDriver.driver.findElement(By.cssSelector("//div[@id='_desktop_language_selector']//span[@class='expand-more']"));
        currency = WebDriver.driver.findElement(By.cssSelector("#currency-selector-label"));
        //desktop_user_info = WebDriver.driver.findElement(By.cssSelector(".aHS-bnu>div:nth-child(2)>span>a", "#_desktop_user_info"));
        cart = WebDriver.driver.findElement(By.cssSelector(".header"));

    }
//    private boolean checkCart(){
//        boolean result;
//        /**
//         * if cart is empty
//         *      return false;
//         * else
//         *      return true;
//         */
//        return result;
//    }

    /**
     * Також потрібно буде пододавати відповідні функції натискання на вею елементи які записані у філдах
     */

}