package main.java.pages.product;

import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *
 */
public class Reviews {

    private WebElement buttonCreateReview;

    /**
     * Default constructor
     */
    public Reviews() {
        initReviews();
    }


    public void initReviews () {
        buttonCreateReview = OurWebDriver.driver.findElement(By.xpath("//a[@class='btn btn-primary'][contains(text(),'Be the first to write a review!')]"));
    }


    public WebElement getButtonCreateReview () {
        return buttonCreateReview;
    }


    public ManageReview clickButtonCreateReview(boolean isNewReview, String rating, String textTitleReview, String textDetailReview) {
        buttonCreateReview.click();
        return new ManageReview(isNewReview, rating, textTitleReview, textDetailReview);
    }

}