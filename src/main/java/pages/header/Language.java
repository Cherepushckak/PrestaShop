package main.java.pages.header;


import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



/**
 *
 */
public enum Language {
    English,
    Ukrainian;


    /**
     * Default constructor
     */
    public class CertainLanguage {
        private WebElement language;
        private WebElement english;
        private WebElement ukrainian;
        private WebElement arrow;

        public CertainLanguage() {
        }

        /**
         * method puts webElement value to the field language;
         * @return language webElement.
         */
        public WebElement getLanguage() {
            language = OurWebDriver.driver.findElement(By.cssSelector("//div[@id='_desktop_language_selector']//span[@class='expand-more']"));
            return language;
        }

        public void clickLanguage(){
            getLanguage().click();
        }

        //May be make a List of elements that contains 2 x languages?????///////////////////////////////
        /**
         * method puts webElement value to the field arrow;
         * @return arrow.
         */
        public WebElement getArrow() {
            arrow = OurWebDriver.driver.findElement(By.xpath("//div[@id='_desktop_language_selector']//i[@class='material-icons expand-more']"));
            return arrow;
        }

        /**
         * method opens dropDown list of languages;
         */
        public void clickLanguageArrow(){
            getArrow().click();
        }

        /**
         * method puts webElement value to the field english;
         * @return english webElement.
         */
        public WebElement getEnglish() {
            english = OurWebDriver.driver.findElement(By.xpath("//ul[@class='dropdown-menu hidden-sm-down']//a[@data-iso-code='en']"));
            return english;
        }

        /**
         * method find english webElement in dropDown list!
         * find only when arrow is pressed.
         * @return english webElement.
         */
        public void findEnglishInDropDown(){
            getEnglish().click();
        }

        /**
         * method puts webElement value to the field ukrainian;
         * @return ukrainian webElement.
         */
        public WebElement getUkrainian() {
            ukrainian = OurWebDriver.driver.findElement(By.xpath("//ul[@class='dropdown-menu hidden-sm-down']//a[@data-iso-code='uk']"));
            return ukrainian;
        }

        /**
         * method find ukrainian webElement in dropDown list!
         * find only when arrow is pressed.
         * @return ukrainian.
         */
        public void findUkraininanInDropDown() {
            ukrainian.click();
        }


        ///method that change language!!!!!!!!!!!!!!!!
    }
}