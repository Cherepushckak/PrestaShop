package main.java.pages.header;


import main.java.pages.search.SearchPage;


import main.java.pages.searchresult.SearchResultPage;
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


    //private WebElement language;
    private CertainLanguage certainLanguage;
    private WebElement cart;
    private WebElement currency;
    private LogUserInfo logUserInfo;
    private UnlogUserInfo unlogUserInfo;

    public HeaderFull() {
        super();
        initHeaderFull();
    }

    public void initHeaderFull() {
        getCertainLanguage();


        //------------We have to create HeaderFull perfectly, so when I check webElement I'll add it to method!---------
        //
//        this.language = WebDriver.driver.findElement(By.cssSelector("#_desktop_language_selector > div > div"));
searchField = OurWebDriver.driver.findElement(By.cssSelector(".ui-autocomplete-input"));
searchButton = OurWebDriver.driver.findElement(By.xpath("//button[@type='submit']"));
//        this.currency = WebDriver.driver.findElement(By.cssSelector("#currency-selector-label"));
//        this.cart = WebDriver.driver.findElement(By.cssSelector(".header"));
        clothes = OurWebDriver.driver.findElement(By.cssSelector("#category-3"));
//        this.accessories = WebDriver.driver.findElement(By.cssSelector("#category-6"));
//        this.art = WebDriver.driver.findElement(By.cssSelector("#category-9"));
        getLogUserInformation ();
    }


    public CertainLanguage getCertainLanguage() {
        return certainLanguage;
    }

    public WebElement getClothes() {
        return clothes;
    }

    public WebElement getAccessories() {
        return accessories;
    }

    public WebElement getArt() {
        return art;
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }


    /**
     * method opens SearchPage
     * @return SearchPage
     */
    public SearchResultPage searchButtonClick(){
        getSearchButton().click();
        return new SearchResultPage();
    }
    public HeaderFull clearSearchField(){
        getSearchField().clear();
        return new HeaderFull();
    }
    public HeaderFull sendKeysToSearchField(String searchingProduct){

        getSearchField().sendKeys(searchingProduct);
        return new HeaderFull();
    }

//        searchField = OurWebDriver.driver.findElement(By.cssSelector(".ui-autocomplete-input"));
//        searchButton = OurWebDriver.driver.findElement(By.xpath("//button[@type='submit']"));
//        language = OurWebDriver.driver.findElement(By.cssSelector("#_desktop_language_selector > div > div"));
//        currency = OurWebDriver.driver.findElement(By.cssSelector("#currency-selector-label"));
//        cart = OurWebDriver.driver.findElement(By.cssSelector(".header"));
//        clothes = OurWebDriver.driver.findElement(By.cssSelector("#category-3"));
//        accessories = OurWebDriver.driver.findElement(By.cssSelector("#category-6"));
//        art = OurWebDriver.driver.findElement(By.cssSelector("#category-9"));


    public WebElement getCart() {
        return cart;
    }
    
    public LogUserInformation getLogUserInformation(){
        return new LogUserInformation();
    }

    public WebElement getCurrency() {
        return currency;
    }

    public LogUserInfo getLogUserInfo() {
        return logUserInfo;
    }

    public UnlogUserInfo getUnlogUserInfo() {
        return unlogUserInfo;
    }
    public LogUserInfo initLogUser() {
        return new LogUserInfo();
    }
    public UnlogUserInfo initUnlogUserInfo(){
        return new UnlogUserInfo();
    }



    // cart = WebDriver.driver.findElement(By.cssSelector(".header"));

//    private boolean checkCart() {
//        boolean result;
//        if (cart.isEnabled())

//            return result;
//    }

}