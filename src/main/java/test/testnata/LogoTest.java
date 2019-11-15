package main.java.test.testnata;;

import main.java.pages.header.HeaderFull;

import main.java.test.test;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;



public class LogoTest extends test {

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verifies if logo button returns HomePage, where popular product list id present")
    @Test

    public void clickLogoTest() {

        //Arrange
        int expected = 8;

        int actual  = new HeaderFull()
        .getLogUserInformation()
        .getUnloggedUserInfo()
        .clickSignInHeaderFull()
        .getLogCont()
        .clickLogo().getPopularProducts().getProducts().size();

        Assert.assertEquals(actual, expected);
        System.out.println("list of products is present");
    }
}
