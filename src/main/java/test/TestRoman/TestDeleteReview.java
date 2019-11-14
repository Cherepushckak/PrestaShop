package main.java.test.TestRoman;


import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

import main.java.pages.header.LogCont;
import main.java.pages.product.ProductTabs;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import main.java.helperInstrument.LogInHelper;
import main.java.helperInstrument.ProductPageHelper;
import main.java.test.test;

@Listeners(test.class)


public class TestDeleteReview extends test {

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify deleting of existing reviews")
    @Test
    public void testDeleteReview() {

        WebElement buttonCreateReview;

        new LogInHelper();
        new LogCont().clickLogo();
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