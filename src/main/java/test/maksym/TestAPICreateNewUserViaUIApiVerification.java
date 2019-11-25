package main.java.test.maksym;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

import main.java.data.User;
import main.java.test.BasicTest;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static main.java.helperinstrument.ApiHelper.GetNumberOfCustomersViaApi;
import static main.java.helperinstrument.ApiHelper.getIdOflastCustomerViaApi;
import static main.java.helperinstrument.UserOperationHelper.createAccountForNewUniqueUser;
import static main.java.helperinstrument.UserOperationHelper.verifyUserViaApi;


@Listeners(BasicTest.class)
public class TestAPICreateNewUserApiVerification extends BasicTest{

    @Severity(SeverityLevel.CRITICAL)
    @Description("Create new user and API verification Test")
    @Test
    public void testCreateNewUserApiVerification() throws InterruptedException {


        // ******* ARRANGE *******

        int usersBeforeCreation = GetNumberOfCustomersViaApi();

        // ******* ACT *******

        User newUser = createAccountForNewUniqueUser();
        int usersAfterCreation = GetNumberOfCustomersViaApi();
        int idOfLastCustomer = getIdOflastCustomerViaApi();

        // ******* ASSERT *******

        Assert.assertNotEquals(usersAfterCreation, usersBeforeCreation, "The amount of users shouldn't be same");
        verifyUserViaApi(newUser, idOfLastCustomer);

        // verification of details of new User via API request


//         given().
//            auth().
//                 basic(EnviromentHelper.getPrestaKey(), "").
//            when().
//                 get(EnviromentHelper.getPrestaUrl() + "/api/customers/16").
//            then().
//                 statusCode(200).
//                 body("prestashop.customer.firstname", equalTo("Maria")).
//                 body("prestashop.customer.birthday", equalTo("2001-03-03")) ;


//        given().
//                auth().
//                basic(EnviromentHelper.getPrestaKey(), "").
//                when().
//                get(EnviromentHelper.getPrestaUrl() + "/api/customers/").
//                then().
//                statusCode(200).
//                body("prestashop.customers.customer.size()", equalTo(634));



//        response.getBody()."prestashop.customers.customer", equals("ss"));
    }
}
