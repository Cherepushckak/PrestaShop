package main.java.test.testArtem;

import main.java.helperInstrument.AddToCartHelper;
import main.java.pages.cart.CartPage;
import main.java.pages.cart.ShoppingItem;
import main.java.test.test;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TestTotalPrice extends test {

    @Test
    public void testPriceNonLogged () {
        CartPage cartPage = new AddToCartHelper().getCartPage();
        cartPage.getShoppingCart().getShoppingItemsList().get(0).clickIncreaseQuantity();
        ShoppingItem fistItem = cartPage.getShoppingCart().getShoppingItemsList().get(0);
        double expected = fistItem.getPriceValue() * fistItem.getQuantity();
        double actual = fistItem.getTotalPriceValue();
        assertEquals(actual, expected);
    }
}
