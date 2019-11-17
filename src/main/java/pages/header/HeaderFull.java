package main.java.pages.header;


import main.java.pages.searchresult.SearchResultPage;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import main.java.pages.header.Currency;
import io.qameta.allure.Step;


/**
 * Class HeaderFull is a child class of pages.Header with it's own fields: clothes, accessories,
 * art, searchField, language, cart, currency, logUserInformation,
 * allows to open each of these pages.
 */
public class HeaderFull extends Header {


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
        getSearchField();
        // searchField = OurWebDriver.driver.findElement(searchFieldLocator);
        getSearchButton();
      //  searchButton = OurWebDriver.driver.findElement(searchButtonLocator);
        getClothes();
       // clothes = OurWebDriver.driver.findElement(clothesLocator);
//        this.cart = WebDriver.driver.findElement(By.cssSelector(".header"));
//        this.accessories = WebDriver.driver.findElement(By.cssSelector("#category-6"));
//        this.art = WebDriver.driver.findElement(By.cssSelector("#category-9"));
        getLogUserInformation();
    }


    public CertainLanguage getCertainLanguage() {
        return new CertainLanguage();
    }

    public WebElement getClothes() {
        return OurWebDriver.driver.findElement(clothesLocator);
    }

    public WebElement getAccessories() {
        return OurWebDriver.driver.findElement(By.cssSelector("#category-6"));
    }

    public WebElement getArt() {
        return OurWebDriver.driver.findElement(By.cssSelector("#category-9"));
    }

    public WebElement getSearchField() {
        return OurWebDriver.driver.findElement(searchFieldLocator);
    }

    public WebElement getSearchButton() {
        return OurWebDriver.driver.findElement(searchButtonLocator);
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
        return OurWebDriver.driver.findElement(By.cssSelector(".header"));
    }

    public LogUserInformation getLogUserInformation() {
        return new LogUserInformation();
    }


    public Currency getCurrency() {
        return new Currency();
    }
}