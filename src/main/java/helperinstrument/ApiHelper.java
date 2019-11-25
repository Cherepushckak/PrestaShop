package main.java.helperinstrument;

import com.google.gson.internal.bind.util.ISO8601Utils;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.path.xml.element.Node;
import io.restassured.path.xml.element.NodeChildren;
import main.java.pages.common.ParentPage;
import main.java.pages.login.LoginPage;
import main.java.pages.register.RegisterPage;
import main.java.pages.user.UserPage;
import main.java.pages.user.YourPersonalInformationPage;
import org.w3c.dom.Document;

import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.*;
import static io.restassured.path.xml.XmlPath.from;
import static org.hamcrest.Matchers.equalTo;

/**
 * This helper contains methods  User to navigate needed pages
 */
public class ApiHelper {

    /**
     * Getting number of customers of Prestashop store via API
     */
    @Step("Getting number of Users via API")
    public static int GetNumberOfCustomersViaApi() {

        int count = given().
                auth().basic(EnviromentHelper.getPrestaKey(), "").
                when().
                get(EnviromentHelper.getPrestaUrl() + "/api/customers/").
                then().
                statusCode(200).
                extract().xmlPath().getInt("prestashop.customers.customer.size()");

        System.out.printf("\nCustomers in the system: %d", count);

        return count;
    }

    /**
     * Getting the last customer's ID via API
     */
    @Step("Getting the last customer's ID via API")
    public static int getIdOflastCustomerViaApi() throws InterruptedException {

        int count = GetNumberOfCustomersViaApi();

        List list = given().
                auth().basic(EnviromentHelper.getPrestaKey(), "").
                when().
                get(EnviromentHelper.getPrestaUrl() + "/api/customers/").
                then().
                statusCode(200).
                extract().xmlPath().getList("prestashop.customers.customer.@id");

        int idOfLastCustomer = Integer.parseInt(list.get(list.size() - 1).toString());
        System.out.println("\nThe last customer's ID is " + idOfLastCustomer);

        return idOfLastCustomer;
    }
}
