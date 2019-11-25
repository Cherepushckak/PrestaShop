package main.java.helperinstrument;

import io.qameta.allure.Step;
import main.java.data.User;
import main.java.data.UserRepository;
import main.java.pages.common.ParentPage;
import main.java.pages.login.LoginPage;
import main.java.pages.main.MainPage;
import main.java.pages.register.RegisterPage;
import main.java.pages.user.UserPage;
import main.java.pages.user.YourPersonalInformationPage;

import static io.restassured.RestAssured.given;
import static main.java.helperinstrument.PageNavigationHelper.openRegisterPage;
import static org.hamcrest.Matchers.equalTo;

/**
 * This helper contains methods related to User Account
 */
public class UserOperationHelper {

    /**
     * Create new user
     */
    @Step ("Creating new unique user")
    public static User createAccountForNewUniqueUser() throws InterruptedException {

        UserRepository userRepository = new UserRepository();
        User user = userRepository.getUniqueUser();

        RegisterPage registerPage = openRegisterPage();

        registerPage.createAccountFor(user);
        return user;
    }


    public static void verifyUserViaApi(User user, int userId){

        given().
                auth().
                basic(EnviromentHelper.getPrestaKey(), "").
                when().
                get(EnviromentHelper.getPrestaUrl() + "/api/customers/" + userId).
                then().
                statusCode(200).
                body("prestashop.customer.firstname", equalTo(user.getFirstName())).
                body("prestashop.customer.lastname", equalTo(user.getLastName())).
                body("prestashop.customer.email",equalTo((user.getEmail()))).
                body("prestashop.customer.id_gender",equalTo((user.getIdGender())));
    }


}
