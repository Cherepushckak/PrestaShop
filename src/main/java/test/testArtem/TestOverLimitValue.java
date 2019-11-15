package main.java.test.testArtem;
import main.java.helperinstrument.AddToCartHelper;
import main.java.pages.cart.CartPage;
import main.java.test.test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestOverLimitValue extends test {
    @Test
    public void cartOverLimitValue () {
        CartPage cartPage= new AddToCartHelper().getCartPage();
        cartPage.getShoppingCart().getShoppingItemsList().get(0).quantityChangeValue("292");
        WebElement expected = cartPage.getAlertMessage().getMessage();
        assertTrue (expected.isDisplayed());
    }
}
