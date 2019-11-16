package main.java.pages.header;


import main.java.pages.searchresult.SearchResultPage;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import main.java.pages.header.Currency;
import io.qameta.allure.Step;



/**
 * Class HeaderFull is a child class of pages.Header with it's own fields: clothes, accessories,
 * art, searchField, language, cart, currency, logUserInformation,
 * allows to open each of these pages.
 * ------------Have to finish it!!!!!!!!!!!!!!----------
 */
public class HeaderFull extends Header {


    private WebElement clothes;
    private WebElement accessories;
    private WebElement art;
    private WebElement searchField;
    private WebElement searchButton;

//    private CertainLanguage certainLanguage;
//    private Currency currency;
    private WebElement cart;
    //  private WebElement currency;
    private LogUserInfo logUserInfo;
    private UnlogUserInfo unlogUserInfo;
    private final By searchFieldLocator = By.cssSelector(".ui-autocomplete-input");
    private final By searchButtonLocator = By.xpath("//button[@type='submit']");
    private final By clothesLocator = By.cssSelector("#category-3");

    public HeaderFull() {
        super();
        initHeaderFull();
    }

    public void initHeaderFull() {
        getCertainLanguage();
        getCurrency();

        //------------We have to create HeaderFull perfectly, so when I check webElement I'll add it to method!---------
        //
        searchField = OurWebDriver.driver.findElement(searchFieldLocator);
        searchButton = OurWebDriver.driver.findElement(searchButtonLocator);
        clothes = OurWebDriver.driver.findElement(clothesLocator);
//        this.currency = WebDriver.driver.findElement(By.cssSelector("#currency-selector-label"));
//        this.cart = WebDriver.driver.findElement(By.cssSelector(".header"));
//        this.accessories = WebDriver.driver.findElement(By.cssSelector("#category-6"));
//        this.art = WebDriver.driver.findElement(By.cssSelector("#category-9"));
        getLogUserInformation();
    }


    public CertainLanguage getCertainLanguage() {
        return new CertainLanguage();
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
     *
     * @return SearchPage
     */
    @Step("click on search button, opens SearchPage")

    public SearchResultPage searchButtonClick() {
        getSearchButton().click();
        return new SearchResultPage();
    }

    @Step("clear searchField")

    public HeaderFull clearSearchField() {
        getSearchField().clear();
        return new HeaderFull();
    }

    @Step("entering data into searchField {searchingProduct}")

    public HeaderFull sendKeysToSearchField(String searchingProduct) {

        getSearchField().sendKeys(searchingProduct);
        return new HeaderFull();
    }


    public WebElement getCart() {
        return cart;
    }

    public LogUserInformation getLogUserInformation() {
        return new LogUserInformation();
    }


    public Currency getCurrency() {
        return new Currency();
    }
}