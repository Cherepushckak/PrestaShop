package main.java.test.TestRoman;


import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

import main.java.pages.header.LogCont;
import main.java.pages.product.ProductTabs;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import main.java.helperInstrument.LogInHelper;
import main.java.helperInstrument.ProductPageHelper;
import main.java.test.test;

@Listeners(test.class)


public class TestAddReview extends test {

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify creating of new review")
    @Test
    public void testAddReview() {

        String newRating = "4";
        String newReviewTitle = "New title";
        String newReviewDetail = "New detail";

        new LogInHelper();
        new LogCont().clickLogo();
        ProductTabs productTabs = new ProductPageHelper().getProductTabs();

        int amountReview = productTabs.getAmountReview();


        //test amount amountProductReview
        int expectedAmountReview = 0;
        int actualAmountReview = amountReview;
        Assert.assertEquals(expectedAmountReview, actualAmountReview);
        System.out.println("Expected amount of reviews: " + expectedAmountReview);
        System.out.println("Actual amount of reviews: " + actualAmountReview);

        productTabs
                .clickReviewTab()
                .initReviews()
                .clickButtonCreateReview(true, newRating, newReviewTitle, newReviewDetail);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Test ReviewTitleText
        String ReviewTitleText = productTabs.clickReviewTab().initReviewInfo().getReviewTitleText();
        String actualReviewTitleText = ReviewTitleText;
        String expectedReviewTitleText = newReviewTitle;
        Assert.assertEquals(expectedReviewTitleText, actualReviewTitleText);
        System.out.println("\nExpected title text reviews: " + expectedReviewTitleText);
        System.out.println("Actual title text reviews: " + actualReviewTitleText);


        // Test ReviewDetailText
        String ReviewDetailText = productTabs.clickReviewTab().initReviewInfo().getReviewDetailText();
        String actualReviewDetailText = ReviewDetailText;
        String expectedReviewDetailText = newReviewDetail;
        Assert.assertEquals(expectedReviewDetailText, actualReviewDetailText);
        System.out.println("\nExpected detail text reviews: " + expectedReviewDetailText);
        System.out.println("Actual detail text reviews: " + actualReviewDetailText);

    }

}