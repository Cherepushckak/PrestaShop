package main.java.test.testArtem;

import main.java.helperInstrument.AddToCartHelper;
import main.java.pages.cart.CartPage;
import main.java.test.test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class TestCartZeroValue extends test {

    @Test
    public void cartZeroValue () {
        CartPage cartPage= new AddToCartHelper().getCartPage();
        cartPage.getShoppingCart().getShoppingItemsList().get(0).clickDecreaseQuantity();
        WebElement expected = cartPage.getAlertMessage().getMessage();
        assertTrue (expected.isDisplayed());
    }
}
