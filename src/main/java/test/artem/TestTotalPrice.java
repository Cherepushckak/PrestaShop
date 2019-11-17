package main.java.test.artem;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import main.java.pages.cart.CartPage;
import main.java.pages.cart.ShoppingItem;
import main.java.test.BasicTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
@Listeners( BasicTest.class)

public class TestTotalPrice extends BasicTest {

    @Severity(SeverityLevel.NORMAL)
    @Description("Verification of total price and amount of quantity and item price not logged user")
    @Test
    public void testPriceNonLogged () {
        //Arrange
        CartPage cartPage = addToCartHelper()
                .getCartPage();
        //Act
        cartPage
                .getShoppingCart()
                .getShoppingItemsList()
                .get(0)
                .changeValueByIncreasing();
        ShoppingItem firstItem = cartPage
                .getShoppingCart()
                .getShoppingItemsList()
                .get(0);
        double expected = firstItem.getPriceValue() * firstItem.getQuantityValue();
        double actual = firstItem.getTotalPriceValue();
        //Assert
        assertEquals(actual, expected);
    }
}
