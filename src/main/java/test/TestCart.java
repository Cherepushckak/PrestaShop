package main.java.test;

import main.java.pages.cart.CartPage;
import main.java.pages.main.MainPage;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestCart {

    @BeforeTest
    public void beforeTest() {
        OurWebDriver driver = new OurWebDriver();
    }


    @Test
    public void itemPresentsNonLogin() {
        CartPage cartPage = new MainPage().getPopularProducts().getProductByPartialName("T-Shirt")
                .clickProductName().setAddToCartButtonClick().clickCheckoutButton();
        String actual = cartPage.getShoppingCart().getShoppingItemsList().get(0).getNameText();
        assertTrue(actual.toLowerCase().contains("t-shirt"));
        cartPage.getShoppingCart().getShoppingItemsList().get(0).clickBasket();
        assertTrue(cartPage.getShoppingCart().getShoppingItemsList().isEmpty());
    }


    @AfterTest(alwaysRun = true)
    public void afterTest () {
        OurWebDriver.driver.close();
    }
}
