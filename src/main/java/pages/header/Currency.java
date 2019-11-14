package main.java.pages.header;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.ArrayList;

/**
 * Currency:  EUR, UAH, USD
 */
public class Currency {

    private WebElement EUR;
    private WebElement UAH;
    private WebElement USD;
    private WebElement currencyElement;
    private WebElement currencyItem;
    //private List dropDownListOfCurrency;
    private final By currencyElementLocator = By.cssSelector("#currency-selector-label");
    private final By certainItemLocator =
            By.xpath("//*[@id='_desktop_currency_selector']/div/button/span");
          //  ("//div[@class='col-md-7 right-nav']//div[@id='_desktop_currency_selector']//div[@class='currency-selector dropdown js-dropdown']//span[@class='expand-more _gray-darker']");
         //   "//div[@class='currency-selector dropdown js-dropdown']//span[@class='expand-more _gray-darker']");
    private final By dropDownListCurrencyLocator = By.xpath("//ul[@class='dropdown-menu hidden-sm-down']//a[@rel='nofollow']");
    private final By EURLocator = By.xpath("//*[@id='_desktop_currency_selector']/div/ul/li[1]/a");
    private final By UAHLocator = By.xpath("//*[@id='_desktop_currency_selector']/div/ul/li[2]/a");
    private final By USDLocator = By.xpath("//*[@id='_desktop_currency_selector']/div/ul/li[3]/a");

    /**
     * Default constructor
     */
    public Currency() {
        initCurrency();
    }

    public void initCurrency() {
       // getCurrencyElement();
        getCurrencyItem();
    }

    public WebElement getCurrencyItem() {
        return OurWebDriver.driver.findElement(certainItemLocator);
    }

    public WebElement getCurrencyElement() {

        return OurWebDriver.driver.findElement(currencyElementLocator);
    }

    //public List getDropDownListOfCurrency() {
//        return OurWebDriver.driver.findElements(dropDownListCurrencyLocator);
//    }

    public Currency openDropDownList()throws InterruptedException {
        clickCertainItem();
        return new Currency();
    }

    private void clickCertainItem(){

        getCurrencyItem().click();
    }

//    public void addElementToList() {
//        dropDownListOfCurrency = new ArrayList<CertainCurrency>();
//        for (WebElement certainLanguage : OurWebDriver.driver.findElements(certainItemLocator)) {
//            dropDownListOfCurrency.add(certainLanguage);
//        }
//    }

    public boolean verifyCurrencyElementIsAvailable() {
        return currencyElement.isDisplayed();

    }

    public WebElement getEUR() {
        return OurWebDriver.driver.findElement(EURLocator);
    }

    public WebElement getUAH() {
        return OurWebDriver.driver.findElement(UAHLocator);
    }

    public WebElement getUSD() {
        return OurWebDriver.driver.findElement(USDLocator);
    }

    public Currency chooseEUR(){
        clickEUR();
        return new Currency();
    }
    public Currency chooseUSD(){
        clickUSD();
        return new Currency();
    }
   private void clickEUR() {
       getEUR().click();
    }


    public void clickUAH() {
        UAH.click();
    }

    public void clickUSD() {
        getUSD().click();
    }

    public void tryAjax(){
        Actions action = new Actions(OurWebDriver.driver);
        action.moveToElement(currencyItem).perform();
    }
}