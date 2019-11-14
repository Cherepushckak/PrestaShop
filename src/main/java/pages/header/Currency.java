
package main.java.pages.header;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import main.java.tools.OurWebDriver;
import io.qameta.allure.Step;


/**
 * Class Currency, allows to change currency for UAH, EUR, USD.
 */
public class Currency {

    /**
     * webElement EUR is dropDown list
     */
    private WebElement EUR;

    /**
     * webElement UAH is dropDown list
     */
    private WebElement UAH;

    /**
     * webElement USD is dropDown list
     */
    private WebElement USD;

    /**
     * webElement- pointer to the currency
     */
    private WebElement currencyElement;

    /**
     * symbol of certain currency on the horizontal menu
     */
    private WebElement currencyItem;
    //private List dropDownListOfCurrency;

    /**
     * locator for currencyElement webElement
     */
    private final By currencyElementLocator = By.cssSelector("#currency-selector-label");

    /**
     * locator for certainItem webElement
     */
    private final By certainItemLocator =
            By.xpath("//*[@id='_desktop_currency_selector']/div/button/span");

    /**
     * locator for dropDownList webElement
     */
    private final By dropDownListCurrencyLocator = By.xpath("//ul[@class='dropdown-menu hidden-sm-down']//a[@rel='nofollow']");

    /**
     * locator for EUR webElement
     */
    private final By EURLocator = By.xpath("//*[@id='_desktop_currency_selector']/div/ul/li[1]/a");

    /**
     * locator for UAH webElement
     */
    private final By UAHLocator = By.xpath("//*[@id='_desktop_currency_selector']/div/ul/li[2]/a");

    /**
     * locator for USD webElement
     */
    private final By USDLocator = By.xpath("//*[@id='_desktop_currency_selector']/div/ul/li[3]/a");

    /**
     * Constructor with CurrencyItem field
     */
    public Currency() {
        initCurrency();
    }

    public void initCurrency() {
        // getCurrencyElement();
        getCurrencyItem();
    }

    /**
     * getter to currencyItem field
     */
    public WebElement getCurrencyItem() {
        return OurWebDriver.driver.findElement(certainItemLocator);
    }

    /**
     * getter to currencyElement field
     */
    public WebElement getCurrencyElement() {

        return OurWebDriver.driver.findElement(currencyElementLocator);
    }

    //public List getDropDownListOfCurrency() {
//        return OurWebDriver.driver.findElements(dropDownListCurrencyLocator);
//    }

    /**
     * Method opens dropDown list od currency items.
     *
     * @return new Currenc
     */
    @Step("click on currency item on the horizontal menu")

    public Currency openDropDownList() {
        clickCertainItem();
        return new Currency();
    }

    /**
     * method clicks to the certain item on the horizontal menu.
     */
    @Step("click open dropDown list")
    private void clickCertainItem() {

        getCurrencyItem().click();
    }

//    public void addElementToList() {
//        dropDownListOfCurrency = new ArrayList<CertainCurrency>();
//        for (WebElement certainLanguage : OurWebDriver.driver.findElements(certainItemLocator)) {
//            dropDownListOfCurrency.add(certainLanguage);
//        }
//    }

    /**
     * method verifies if the element Currency is present on hte horizontal menu.
     *
     * @return
     */
    public boolean verifyCurrencyElementIsAvailable() {
        return currencyElement.isDisplayed();

    }

    /**
     * getter to EUR field
     */
    public WebElement getEUR() {
        return OurWebDriver.driver.findElement(EURLocator);
    }

    /**
     * getter to UAH field
     */
    public WebElement getUAH() {
        return OurWebDriver.driver.findElement(UAHLocator);
    }

    /**
     * getter to USD field
     */
    public WebElement getUSD() {
        return OurWebDriver.driver.findElement(USDLocator);
    }

    /**
     * Method use clickEUR() method.
     *
     * @return new instance of Currency.
     */
    @Step("choose EUR in dropDown")

    public Currency chooseEUR() {
        clickEUR();
        return new Currency();
    }

    /**
     * Method use clickUSD() method.
     *
     * @return new instance of Currency.
     */
    @Step("choose USD in dropDown")

    public Currency chooseUSD() {
        clickUSD();
        return new Currency();
    }

    /**
     * method clicks on the EUR webElement in dropDown list
     */
    private void clickEUR() {
        getEUR().click();
    }

    /**
     * method clicks on the UAH webElement in dropDown list
     */
    public void clickUAH() {
        UAH.click();
    }

    /**
     * method clicks on the USD webElement in dropDown list
     */
    public void clickUSD() {
        getUSD().click();
    }

}