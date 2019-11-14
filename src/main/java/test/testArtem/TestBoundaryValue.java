package main.java.test.testArtem;
import main.java.helperinstrument.AddToCartHelper;
import main.java.pages.cart.CartPage;
import main.java.test.test;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestBoundaryValue extends test {
    @Test
    public void cartOverLimitValue () {
        CartPage cartPage= new AddToCartHelper().getCartPage();
        cartPage.getShoppingCart().getShoppingItemsList().get(0).quantityChangeValue("291");
        assertFalse (cartPage.isAlertMessagePresent());
    }
}
