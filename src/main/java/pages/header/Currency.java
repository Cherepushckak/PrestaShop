package main.java.pages.header;

import org.openqa.selenium.WebElement;
import  org.openqa.selenium.By;
import main.java.tools.OurWebDriver;
import java.util.List;
import java.util.ArrayList;
import main.java.pages.header.CertainCurrency;

/**
 * Currency:  EUR, UAH, USD
 */
public class Currency {

    private WebElement EUR;
    private WebElement UAH;
    private WebElement USD;
    private WebElement currencyElement;
    private WebElement currencyItem;
    private List dropDownListOfCurrency;
    private final By currencyElementLocator = By.cssSelector("#currency-selector-label");
    private final By certainItemLocator = By.xpath(
            "//div[@class='currency-selector dropdown js-dropdown']//span[@class='expand-more _gray-darker']");
    private final By dropDownListCurrencyLocator = By.xpath("//ul[@class='dropdown-menu hidden-sm-down']//a[@rel='nofollow']");
    /**
     * Default constructor
     */
    public Currency() {
       initCurrency();
    }
public void initCurrency(){
        getCurrencyElement();
        getCurrencyItem();
}
    public WebElement getCurrencyItem() {
        return  OurWebDriver.driver.findElement(certainItemLocator);
    }

    public WebElement getCurrencyElement() {

        return  OurWebDriver.driver.findElement(currencyElementLocator);
    }

    public List getDropDownListOfCurrency() {
        return  OurWebDriver.driver.findElements(dropDownListCurrencyLocator);
    }

    public List clickCertainCurrency(){
        currencyItem.click();
        return dropDownListOfCurrency;
}
public void addElementToList(){
        dropDownListOfCurrency = new ArrayList<CertainCurrency>();
        for(WebElement certainLanguage :OurWebDriver.driver.findElements(certainItemLocator)){
            dropDownListOfCurrency.add(certainLanguage);
        }
}
    public boolean verifyCurrencyElementIsAvailable(){
        return currencyElement.isDisplayed();

    }
    public void clickEUR() {
        EUR.click();
    }

    public void clickUAH() {
        UAH.click();
    }

    public void clickUSD() {
        USD.click();
    }

}