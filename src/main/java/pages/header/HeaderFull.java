package main.java.pages.header;

import main.java.pages.search.SearchPage;
import main.java.tools.WebDriver;
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

    //We have to add LogUserInfo of UnlogUserInfo!!!!!!!!
    //There are methods initLogUser(), initUnlogUserInfo(), so we can add by yourself certain user!!!!!!!
    public HeaderFull() {
        super();
        initHeaderFull();
    }

    public void initHeaderFull() {
        getCertainLanguage();

        //I declared instance of class CertainLanguage, instead of field language
       // certainLanguage = new CertainLanguage();

        //------------We have to create HeaderFull perfectly, so when I check webElement I'll add it to method!---------
        //
//        this.language = WebDriver.driver.findElement(By.cssSelector("#_desktop_language_selector > div > div"));
searchField = WebDriver.driver.findElement(By.cssSelector(".ui-autocomplete-input"));
searchButton = WebDriver.driver.findElement(By.xpath("//button[@type='submit']"));
//        this.currency = WebDriver.driver.findElement(By.cssSelector("#currency-selector-label"));
//        this.cart = WebDriver.driver.findElement(By.cssSelector(".header"));
        clothes = WebDriver.driver.findElement(By.cssSelector("#category-3"));
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
    public SearchPage searchButtonClick(){
        getSearchButton().click();
        return new SearchPage();
    }
    public HeaderFull clearSearchField(){
        getSearchField().clear();
        return new HeaderFull();
    }
    public HeaderFull sendKeysToSearchField(String searchingProduct){

        getSearchField().sendKeys(searchingProduct);
        return new HeaderFull();
    }

//    public WebElement getLanguage() {
//        return language;
//    }

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

//    /**
//     * Method for constructor, creates part of the HeaderFull Object
//     */
//    public void languageClick() {
//        language.click();
//    }

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