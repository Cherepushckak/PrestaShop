package main.java.test.artem;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import main.java.helperinstrument.EnviromentHelper;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.is;


/**
 * checking that cart has some fields
 */
public class ArtemAPIGetTest {

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verification of presents several item in chosen cart")
    @Test
    public void getCartItemTest() {
        //Arrange
        RestAssured.baseURI = EnviromentHelper.getPrestaUrl();
        String expected = "5";
        //Act
        RestAssured
                .given()
                .auth().basic(EnviromentHelper.getPrestaKey(), "")
                .when()
                .get("/api/carts/5")
                //Assert
                .then()
                .body("prestashop.cart.id", is(expected));
    }

}
