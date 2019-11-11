package main.java.pages.header;

import main.java.tools.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CertainLanguage extends HeaderFull{

    private WebElement language;
    private WebElement english;
    private WebElement ukrainian;
    private WebElement arrow;
    private WebElement dropDownListLanguage;

    public CertainLanguage() {
        initCertainLanguage();
    }
public CertainLanguage initCertainLanguage(){
    getLanguage();
    getArrow();
    return new CertainLanguage();
    }

    /**
     * method puts webElement value to the field language;
     *
     * @return language webElement.
     */
    public WebElement getLanguage() {
        language = WebDriver.driver.findElement(By.xpath("//div[@id='_desktop_language_selector']//span[@class='expand-more']"));
        return language;
    }

    public void clickLanguage() {
        getLanguage().click();
    }

    //May be make a List of elements that contains 2 x languages?????///////////////////////////////

    /**
     * method puts webElement value to the field arrow;
     *
     * @return arrow.
     */
    public WebElement getArrow() {
        arrow = WebDriver.driver.findElement(By.xpath("//div[@id='_desktop_language_selector']//i[@class='material-icons expand-more']"));
        return arrow;
    }

    /**
     * method opens dropDown list of languages;
     */
    public void clickLanguageArrow() {
        getArrow().click();
    }

    /**
     * method puts webElement value to the field english;
     *
     * @return english webElement.
     */
    public WebElement getEnglish() {
        english = WebDriver.driver.findElement(By.xpath("//ul[@class='dropdown-menu hidden-sm-down']//a[@data-iso-code='en']"));
        return english;
    }

    /**
     * method find english webElement in dropDown list!
     * find only when arrow is pressed.
     *
     * @return english webElement.
     */
    public void clickEnglishInDropDown() {
        getEnglish().click();
    }

    /**
     * method puts webElement value to the field ukrainian;
     *
     * @return ukrainian webElement.
     */
    public WebElement getUkrainian() {
        ukrainian = WebDriver.driver.findElement(By.xpath("//ul[@class='dropdown-menu hidden-sm-down']//a[@data-iso-code='uk']"));
        return ukrainian;
    }

    /**
     * method find ukrainian webElement in dropDown list!
     * find only when arrow is pressed.
     */
    //add elements that return element in the header
    public void clickUkrainianInDropDown() {
       getUkrainian().click();
    }

    /**
     * method puts webElement value to the dropDown list of Languages;
     *
     * @return dropDown element.
     */
    public WebElement getDropDownListLanguage() {
        dropDownListLanguage = WebDriver.driver.findElement(By.xpath(
                "//div[@class='language-selector dropdown js-dropdown open']//ul[@class='dropdown-menu hidden-sm-down']"));
        return dropDownListLanguage;
    }


    ///method that change language!!!!!!!!!!!!!!!!
}

