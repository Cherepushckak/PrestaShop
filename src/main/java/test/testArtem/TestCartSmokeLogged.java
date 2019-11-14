package main.java.test.testArtem;

import main.java.helperinstrument.AddToCartHelper;
import main.java.helperinstrument.LogInHelper;
import main.java.pages.cart.CartPage;
import main.java.pages.main.MainPage;
import main.java.test.test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestCartSmokeLogged extends test {

    @Test
    public void itemPresentsLogin () {
        MainPage userPage = new LogInHelper().getUserPage().getLogCont().clickLogo();
        CartPage cartPage = new AddToCartHelper().getCartPage();

        String actual = cartPage.getShoppingCart().getShoppingItemsList().get(0).getNameText();
        assertTrue(actual.toLowerCase().contains("t-shirt"));
        cartPage.getShoppingCart().deleteAllFromCart();
        assertTrue(cartPage.getShoppingCart().getShoppingItemsList().isEmpty());
    }


}
