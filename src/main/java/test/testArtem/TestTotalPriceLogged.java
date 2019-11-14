package main.java.test.testArtem;

import main.java.helperInstrument.AddToCartHelper;
import main.java.helperInstrument.LogInHelper;
import main.java.pages.cart.CartPage;
import main.java.pages.cart.ShoppingItem;
import main.java.pages.main.MainPage;
import main.java.test.test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestTotalPriceLogged extends test {

    @Test
    public void testPriceLogged () {
        MainPage userPage = new LogInHelper().getUserPage().getLogCont().clickLogo();
        CartPage cartPage = new AddToCartHelper().getCartPage();
        cartPage.getShoppingCart().getShoppingItemsList().get(0).clickIncreaseQuantity();
        ShoppingItem fistItem = cartPage.getShoppingCart().getShoppingItemsList().get(0);
        double expected = fistItem.getPriceValue() * fistItem.getQuantityValue();
        double actual = fistItem.getTotalPriceValue();
        assertEquals(actual, expected);
    }
}
