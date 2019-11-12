package main.java.helper;

import main.java.pages.cart.CartPage;
import main.java.pages.main.MainPage;

public class AddToCartHelper {

    private CartPage cartPage;

    public AddToCartHelper() {
        init();
    }

    public void init () {
        cartPage = new MainPage().getPopularProducts().getProductByPartialName("T-Shirt")
                .clickProductName().setAddToCartButtonClick().clickCheckoutButton();
    }

    public CartPage getCartPage() {
        return cartPage;
    }
}
