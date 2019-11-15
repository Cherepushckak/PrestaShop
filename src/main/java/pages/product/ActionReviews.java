package main.java.pages.product;

import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;


public class ActionReviews {


    public ActionReviews() {
        initAction();
    }


    public void initAction() {
        if (OurWebDriver.driver.findElements(By.xpath("//a[@class='btn btn-primary'][contains(text(),'Be the first to write a review!')]")).size() != 0) {
            initReviews();
        }
        if (OurWebDriver.driver.findElements(By.xpath("//div[@class='revws-review-list']")).size() != 0) {
            initReviewInfo();
        }
    }


    public Reviews initReviews() {
        return new Reviews();
    }


    public ReviewInfo initReviewInfo() {
        return new ReviewInfo();
    }

}




