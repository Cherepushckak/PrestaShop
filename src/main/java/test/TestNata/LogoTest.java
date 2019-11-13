package main.java.test.TestNata;

import main.java.pages.header.HeaderFull;
import org.testng.Assert;
import org.testng.annotations.Test;
import main.java.test.test;

public class LogoTest extends test {
    @Test
    public void clickLogoTest() {

        //Arrange
        int expected = 8;

        int actual  = new HeaderFull()
        .getLogUserInformation()
        .getUnlogogUserInfo()
        .clickSignInHeaderFull()
        .getLogCont()
        .clickLogo().getPopularProducts().getProducts().size();

        Assert.assertEquals(actual, expected);
        System.out.println("list of products is present");
    }
}
