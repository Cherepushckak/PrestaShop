package main.java.test.testnata;

import com.sun.org.apache.xpath.internal.operations.Bool;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import main.java.data.UserRepository;
import main.java.helperinstrument.LogInHelper;
import main.java.pages.header.UnlogUserInfo;
import main.java.test.BasicTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.geom.AffineTransform;

@Listeners(BasicTest.class)

public class VerifyLogoButtonTest extends BasicTest {

    private WebElement actual;

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verifies opening MainPage, after pressing on logo")
    @Test
    public void signIn() {

        //Act
        Boolean actual = new LogInHelper()
                .getUserPage()
                .initHeaderFull()
                .getLogCont()
                .goToMainPage()
                .getPopularProducts()
                .showTextOfAllProducts()
                .contains("All products");

        //Assert
        Assert.assertTrue(actual);
        System.out.println("Logo opens HomePage");

    }

}
