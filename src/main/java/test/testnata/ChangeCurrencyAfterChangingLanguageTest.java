package main.java.test.testnata;

import main.java.pages.main.PopularProducts;
import main.java.test.BasicTest;

import main.java.helperinstrument.ChangeLanguageHelper;
import main.java.pages.header.HeaderFull;

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

public class ChangeCurrencyAfterChangingLanguageTest extends BasicTest {

    private final By priceLocator = By.xpath("//span[@itemprop='price']");

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verifies if currency is changed for USD on CartPage")
    @Test
    public void changeChangeCurrencyAfterChangingLanguage() {
        String cuurency = new ChangeLanguageHelper()
                .changeLanguageForUkrainina()
                .getCurrency()
                .chooseUAH()
                .showValueOfTheCurrencyItem();

        System.out.println("Currency is changed to " + cuurency);

        PopularProducts popularProducts = new PopularProducts();

        popularProducts.getProductByPartialName("Sweater").goToProductPage();

        String actual = OurWebDriver.driver.findElement(priceLocator).getText();

        Assert.assertTrue(actual.contains("₴"));

        System.out.println(actual);
    }
}
