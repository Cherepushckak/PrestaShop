package main.java.test.TestNata;

import main.java.pages.header.CertainLanguage;
import main.java.tools.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class HeaderFullTest {
    WebDriver webDriver = new WebDriver();
    //Actions actions = new Actions(WebDriver.driver);

    /**
     * web element for saving actual element, used is assert
     */
    private WebElement actual;

    /** string value, used in assert(actual result)*/
    private String actualText;

    /** string value, used in assert(expected result)*/
    private String expectedText;
    /**
     * instance od CertainLanguage class
     */
    CertainLanguage certainLanguage;

    /**
     * method create instance of CertainLanguage class.
     */
    @BeforeMethod
    public void beforeMethod() {
        certainLanguage = new CertainLanguage();
        webDriver.driver.manage().window().maximize();
    }

    /** test checks if language button is working*/
    @Test(priority = 1)
    public void checkLanguage() {

        certainLanguage.clickLanguage();
        actual = certainLanguage.getDropDownListLanguage();
        Assert.assertTrue(actual.isDisplayed());
        System.out.println("List of languages is present");

    }

    /** test checks the possibility to choose English language from the dropDown list*/
    @Test(priority = 2)
    public void changeLanguageForEnglish(){

        //Arrange
        expectedText = "English";

        //Act
        certainLanguage.clickEnglishInDropDown();
        actual = WebDriver.driver.findElement(By.xpath("//span[@class='expand-more']"));
        actualText = actual.getText();

        //Assert
        Assert.assertEquals(actualText, expectedText);
        System.out.println("Language is changed for English");

    }

    /** test checks the possibility to choose Ukrainian language from the dropDown list*/
    @Test (priority = 3)
    public void changeLanguageForUkrainian()throws InterruptedException{
        //Act
        certainLanguage.clickLanguage();

        //I'll change it!!!!!!!!!
        Thread.sleep(2000);

        certainLanguage.clickUkrainianInDropDown();
        actual = WebDriver.driver.findElement(By.xpath("//span[@class='expand-more']"));

        //Assert
        Assert.assertTrue(actual.isDisplayed());
        System.out.println("Language is changed for Ukrainian");

    }

    @AfterClass
    public void afterTest() {
        webDriver.closeDriver();
    }
}
