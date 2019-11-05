package Header;

import java.util.*;

/**
 * 
 */
public class HeaderFull extends Header {

    private WebElement clothes;
    private WebElement accessories;
    private WebElement art;
    private WebElement searchField;
    private WebElement language;
    private WebElement cart;
    private WebElement currency;
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

    private boolean createUser(){
        boolean result;
        /**
           if user logged
                return true
           else
                return false
         */
        return result;
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