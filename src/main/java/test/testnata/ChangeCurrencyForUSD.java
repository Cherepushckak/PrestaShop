package main.java.test.testnata;

import main.java.helperinstrument.AddToCartHelper;
import main.java.test.BasicTest;
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

public class ChangeCurrencyForUSD extends BasicTest {

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verifies if currency is changed for USD on CartPage")
    @Test
    @io.qameta.allure.Issue("1234")
    public void changeCurrency() throws InterruptedException {
        String actual = new AddToCartHelper().getCartPage().initHeaderFull().getCurrency().openDropDownList().chooseUSD().getCurrencyItem().getText();
        System.out.println("Currency is changed to USD");

        String expected = "USD $";
        Assert.assertEquals(actual, expected);


    }

}

