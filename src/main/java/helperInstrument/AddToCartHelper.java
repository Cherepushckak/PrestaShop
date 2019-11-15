package main.java.helperInstrument;

import main.java.pages.cart.CartPage;
import main.java.pages.main.MainPage;

public class AddToCartHelper {

    private CartPage cartPage;

    public AddToCartHelper() {
        init();
    }

    public void init () {
        cartPage = new MainPage().getPopularProducts().getProductByPartialName("T-Shirt")
                .goToProductPage().getProductInfo().setAddToCartButtonClick().clickCheckoutButton();
    }

    public CartPage getCartPage() {
        return cartPage;
    }
}
