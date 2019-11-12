package main.java.test.testArtem;

import main.java.pages.cart.CartPage;
import main.java.pages.main.MainPage;
import main.java.test.test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestCartSmoke extends test {

    @Test
    public void itemPresentsNonLogin() {
        CartPage cartPage = new MainPage().getPopularProducts().getProductByPartialName("T-Shirt")
                .clickProductName().setAddToCartButtonClick().clickCheckoutButton();
        String actual = cartPage.getShoppingCart().getShoppingItemsList().get(0).getNameText();
        assertTrue(actual.toLowerCase().contains("t-shirt"));
        cartPage.getShoppingCart().getShoppingItemsList().get(0).clickBasket();
        assertTrue(cartPage.getShoppingCart().getShoppingItemsList().isEmpty());
    }

}
