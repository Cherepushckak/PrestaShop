package main.java.test.testnata;

import main.java.pages.header.CertainLanguage;
import main.java.test.test;
import main.java.pages.header.Currency;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Iterator;

import java.util.ArrayList;

import main.java.helperinstrument.SearchHelper;
import main.java.pages.searchresult.SearchResultPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import main.java.pages.cart.CartPage;
import main.java.helperinstrument.AddToCartHelper;
import main.java.pages.header.HeaderFull;
import org.testng.Assert;

@Listeners(test.class)

/**
 *
 */

public class ChangeCurrency extends test {
    @Test
    public void changeCurrency() throws InterruptedException {
        String actual = new AddToCartHelper().getCartPage().getCurrency().openDropDownList().chooseUSD().getCurrencyItem().getText();
        System.out.println("Currency is change to USD");

        // Thread.sleep(3000);
        // String actual = cartPage.getCurrency().openDropDownList().chooseEUR().getCurrencyElement().getText();
        String expected = "USD $";
        Assert.assertEquals(actual, expected);


    }

//      HeaderFull headerFull = new HeaderFull();
//    headerFull.getCurrency().openDropDownList();
    //
    //  Thread.sleep(3000);
    // HeaderFull.getCurrency().openDropDownList();
    //Currency currency = new Currency();
    //currency.openDropDownList();
}

