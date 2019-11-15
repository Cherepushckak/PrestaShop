package main.java.pages.product;

import main.java.tools.OurWebDriver;
import main.java.tools.RegexUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *
 */
public class ProductTabs {

    private WebElement descriptionTab;
    private WebElement productDetailTab;
    private WebElement reviewTab;
    private int amountReview;

    /**
     * Default constructor
     */
    public ProductTabs() {
        initProductTabs();
    }


    public void initProductTabs() {
        descriptionTab = OurWebDriver.driver.findElement(By.xpath("//a[contains(text(), 'Description')]"));
        productDetailTab = OurWebDriver.driver.findElement(By.xpath("//a[contains(text(), 'Product Details')]"));
        reviewTab = OurWebDriver.driver.findElement(By.xpath("//a[contains(text(), 'Reviews')]"));
    }


    public int getAmountReview() {
        amountReview = RegexUtils.getNumber(reviewTab.getText());
        return amountReview;
    }


    public ActionReviews clickReviewTab() {
        reviewTab.click();
        return new ActionReviews();
    }

}