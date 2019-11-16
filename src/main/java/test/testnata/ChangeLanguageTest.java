package main.java.test.testnata;

import main.java.pages.header.CertainLanguage;
import main.java.test.BasicTest;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Listeners(BasicTest.class)

/**
 *
 */
public class ChangeLanguageTest extends BasicTest {
    /**
     * web element for saving actual element, used is assert
     */
    private WebElement actual;

    private WebElement newActual;
    private final By actualLocator = By.xpath("//div[@class='language-selector dropdown js-dropdown']");

    /**
     * test checks the possibility to choose Ukrainian language from the dropDown list
     */
    @Severity(SeverityLevel.CRITICAL)
    @Description( "Verifies the possibility to choose Ukrainian language from the dropDown list" )
    @Test

    public void changeLanguageForUkrainian(){
        //Act
        actual = new CertainLanguage().clickLanguage().clickUkrainianInDropDown();
//change assert!!!!!!!11 for smth wrriten on ukrainian
        newActual = OurWebDriver.driver.findElement(actualLocator);
        Assert.assertTrue(newActual.isDisplayed());
        System.out.println("Language is changed for Ukrainian");

    }
}
