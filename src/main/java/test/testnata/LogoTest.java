package main.java.test.testnata;;

import main.java.pages.header.HeaderFull;

import main.java.test.test;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LogoTest extends test {
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
