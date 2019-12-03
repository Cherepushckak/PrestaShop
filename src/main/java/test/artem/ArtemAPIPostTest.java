package main.java.test.artem;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import main.java.helperinstrument.ArtemAPIxmlReader;
import main.java.helperinstrument.EnviromentHelper;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
public class ArtemAPIPostTest {

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verification correct adding and deleting from cart")
    @Test
    public void addToCart(){
        //Arrange
        ArtemAPIxmlReader reader = new ArtemAPIxmlReader();
        String expected = "1";
        //Act
        RestAssured.baseURI = EnviromentHelper.getPrestaUrl();
        RestAssured
                .given()
                .auth()
                .basic(EnviromentHelper.getPrestaKey(), "")
                .body(reader.readXml())
                .when()
                .post("/api/carts")
                //Assert
                .then()
                .body("prestashop.cart.id_shop", is(expected))
                .statusCode(201);
    }
}
