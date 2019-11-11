package main.java.test;

import main.java.pages.cart.CartPage;
import main.java.pages.header.UnlogUserInfo;
import main.java.pages.main.MainPage;
import main.java.tools.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestCart {

    @BeforeTest
    public void beforeTest() {
        WebDriver driver = new WebDriver();
    }


    @Test
    public void itemPresentsNonLogin() {
        CartPage cartPage = new MainPage().getPopularProducts().getProductByPartialName("T-Shirt")
                .clickProductName().setAddToCartButtonClick().clickCheckoutButton();
        String actual = cartPage.getShoppingCart().getShoppingItemsList().get(0).getNameText();
        assertTrue(actual.toLowerCase().contains("t-shirt"));
        cartPage.getShoppingCart().getShoppingItemsList().get(0).clickBasket();
        WebDriver.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".no-items")));
//        WebElement actual2 = WebDriver.driver.findElement(By.cssSelector(".no-items"));
//        assertTrue(actual2.isDisplayed());

        assertTrue(cartPage.getShoppingCart().getShoppingItemsList().isEmpty());
    }


    @AfterTest(alwaysRun = true)
    public void afterTest () {
        WebDriver.driver.close();
    }
}
