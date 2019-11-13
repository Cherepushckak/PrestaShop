package main.java.pages.header;


import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * CertainLanguage allows to find language and nearby arrow buttons, to open dropDown list of languages,
 * to choose one from the list.
 */
public class CertainLanguage {

    /**
     * element on the header
     */
    private WebElement language;

    /**
     * element on the header
     */
    private WebElement english;

    /**
     * element on the header
     */
    private WebElement ukrainian;

    /**
     * element on the header
     */
    private WebElement arrow;

    /**
     * element on the header
     */
    private WebElement dropDownListLanguage;

    /**
     * locator that contains address of language field in DOM
     */
    private final By languageLocator = By.xpath("//div[@id='_desktop_language_selector']//span[@class='expand-more']");


    /**
     * locator that contains address of arrow field in DOM
     */
    private final By arrowLocator = By.xpath(
            "//div[@id='_desktop_language_selector']//i[@class='material-icons expand-more']");

    /**
     * locator that contains address of english field in dropDownList in DOM
     */
    private final By englishLocator = By.xpath("//ul[@class='dropdown-menu hidden-sm-down']//a[@data-iso-code='en']");

    /**
     * locator that contains address of ukrainian field in dropDownList in DOM
     */
    private final By ukrainianLocator = By.xpath("//ul[@class='dropdown-menu hidden-sm-down']//a[@data-iso-code='uk']");

    /**
     * locator that contains address of dropDownListLanguage field in DOM
     */
    private final By dropDownListLanguageLocator = By.xpath(
            "//div[@class='language-selector dropdown js-dropdown open']//ul[@class='dropdown-menu hidden-sm-down']");

    /**
     * constructor with method initCertainLanguage that bring up language and arrow values.
     */
    public CertainLanguage() {
        initCertainLanguage();
    }

    /**
     * Method that bring up language and arrow values
     */
    public void initCertainLanguage() {
        getLanguage();
        getArrow();
    }

    /**
     * method puts locator to the field language;
     *
     * @return language webElement.
     */
    public WebElement getLanguage() {
        language = OurWebDriver.driver.findElement(languageLocator);
        return language;
    }

    /**
     * method make click on language and opens dropDownList
     *
     * @return instance of CertainLanguage
     */
    public CertainLanguage clickLanguage() {
        getLanguage().click();
        return new CertainLanguage();
    }

    /**
     * method puts locator the field arrow;
     *
     * @return arrow.
     */
    public WebElement getArrow() {
        arrow = OurWebDriver.driver.findElement(arrowLocator);
        return arrow;
    }

    /**
     * method opens dropDown list of languages;
     */
    public void clickLanguageArrow() {
        getArrow().click();
    }

    /**
     * method puts locator to the field english;
     *
     * @return english webElement.
     */
    public WebElement getEnglish() {
        english = OurWebDriver.driver.findElement(englishLocator);
        return english;
    }

    /**
     * method find english webElement in dropDown list!
     * find only when arrow is pressed.
     *
     * @return language webElement.
     */
    public CertainLanguage clickEnglishInDropDown() {
        getEnglish().click();
        return new CertainLanguage();
    }

    /**
     * method puts webElement value to the field ukrainian;
     *
     * @return ukrainian webElement.
     */
    public WebElement getUkrainian() {
        ukrainian = OurWebDriver.driver.findElement(ukrainianLocator);
        return ukrainian;
    }

    /**
     * method find ukrainian webElement in dropDown list!
     * find only when arrow is pressed.
     *
     * @return language webElement.
     */

    public WebElement clickUkrainianInDropDown() {
        getUkrainian().click();
        return language;
    }

    /**
     * method puts webElement value to the dropDown list of Languages;
     *
     * @return dropDown element.
     */
    public WebElement getDropDownListLanguage() {
        dropDownListLanguage = OurWebDriver.driver.findElement(dropDownListLanguageLocator);
        return dropDownListLanguage;
    }

}

