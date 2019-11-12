package main.java.test.TestNata;

import main.java.pages.header.CertainLanguage;
import main.java.test.test;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(test.class)

public class ChangeLanguageTest extends test {
    /**
     * web element for saving actual element, used is assert
     */
    private WebElement actual;

    /**
     * string value, used in assert(actual result)
     */
    private String actualText;

    /**
     * string value, used in assert(expected result)
     */
    private String expectedText;
    /**
     * instance od CertainLanguage class
     */
   // CertainLanguage certainLanguage;

    /**
     * method create instance of CertainLanguage class.
     */
//    @BeforeMethod
//    public void beforeMethod() {
//        certainLanguage = new CertainLanguage();
//    }

//    /**
//     * test checks if language button is working
//     */
//    @Test(priority = 1)
//    public void checkLanguage() {
//
//        actual = certainLanguage.clickLanguage().getDropDownListLanguage();
//
//        /** checks if dropDownList is opened*/
//
//        Assert.assertTrue(actual.isDisplayed());
//
//        System.out.println("List of languages is present");
//
//    }

//    /**
//     * test checks the possibility to choose English language from the dropDown list
//     */
//    @Test(priority = 2)
//    public void changeLanguageForEnglish() {
//
//        //Arrange
//        expectedText = "English";
//
//        //Act
//        actualText = certainLanguage.clickEnglishInDropDown().getLanguage().getText();
//
//        /** assert checks if text of webElement 'language' equals to expectedText*/
//
//        //Assert
//        Assert.assertEquals(actualText, expectedText);
//        System.out.println("Language is changed for English");
//
//    }

    /**
     * test checks the possibility to choose Ukrainian language from the dropDown list
     */
    //---------------Separate it to another class!!!!!!!--------------------
    @Test
    public void changeLanguageForUkrainian() throws InterruptedException {
        //Act
    actual = new CertainLanguage().clickLanguage().clickUkrainianInDropDown();

        WebElement newActual = OurWebDriver.driver.findElement(By.xpath("//div[@class='language-selector dropdown js-dropdown']"));
        Assert.assertTrue(newActual.isDisplayed());
        System.out.println("Language is changed for Ukrainian");

    }
}
