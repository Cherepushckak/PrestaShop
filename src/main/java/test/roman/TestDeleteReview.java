package main.java.test.roman;


import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

import main.java.pages.header.LogCont;
import main.java.pages.product.ProductTabs;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import main.java.helperinstrument.*;
import main.java.test.BasicTest;

@Listeners(BasicTest.class)


public class TestDeleteReview extends BasicTest {

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify deleting of existing reviews")
    @Test
    public void testDeleteReview() {

        WebElement buttonCreateReview;

        new LogInHelper();
        new LogCont().goToMainPage();
        ProductTabs productTabs = new ProductPageHelper().getProductTabs();

        productTabs
                .clickReviewTab()
                .initReviewInfo()
                .clickButtonDeleteReview()
                .clickButtonDeleteConfirm();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        buttonCreateReview = productTabs.clickReviewTab().initReviews().getButtonCreateReview();
        Assert.assertTrue(buttonCreateReview.isDisplayed());

    }

}