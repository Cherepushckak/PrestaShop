package main.java.pages.product;

import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

/**
 *
 */
public class ManageReview {

    private WebElement createRating;
    private WebElement updateRating;
    private WebElement editTitle;
    private WebElement editDetails;
    private WebElement createButton;
    private WebElement updateButton;
    private WebElement cancelButton;

    /**
     * Default constructor
     */
    public ManageReview(boolean isNewReview, String rating,String textTitleReview, String textDetailReview) {
        if (isNewReview) {
            createReview(rating, textTitleReview, textDetailReview);
        } else {
            updateReview(rating, textTitleReview, textDetailReview);
        }
    }


    public void initReview() {
        cancelButton = OurWebDriver.driver.findElement(By.xpath("//button[@class]/span[contains(text(),'Cancel')]"));
    }


    public void initButtonsCreateReview(String rating) {
        createRating = OurWebDriver.driver.findElement(By.xpath("//div[@class='revws-grading']/div[@class='revws-grade-wrap'][" + rating + "]"));
        createButton = OurWebDriver.driver.findElement(By.xpath("//button[@class]/span[contains(text(),'Create review')]"));
    }


    public void initButtonsUpdateReview(String rating) {
        updateRating = OurWebDriver.driver.findElement(By.xpath("//div[@class='revws-grading']/div[@class='revws-grade-wrap'][" + rating + "]"));
        updateButton = OurWebDriver.driver.findElement(By.xpath("//button[@class]/span[contains(text(),'Update review')]"));
    }


    public void initEditsReview() {
        editTitle = OurWebDriver.driver.findElement(By.xpath("//input[@id='title']"));
        editDetails = OurWebDriver.driver.findElement(By.xpath("//textarea[@placeholder]"));
    }


    public void createReview(String rating, String textTitleReview, String textDetailReview) {
        initReview();
        initButtonsCreateReview(rating);

        createRating(); //5

        initEditsReview();

        writeTitleReview(textTitleReview);
        writeDetailsReview(textDetailReview);
        clickCreateButton();
    }


    public void updateReview(String rating, String textTitleReview, String textDetailReview) {
        initReview();
        initButtonsUpdateReview(rating);

        updateRating(); //3

        initEditsReview();

        writeTitleReview(textTitleReview);
        writeDetailsReview(textDetailReview);
        clickUpdateButton();
    }


    public void createRating() {
        createRating.click();
    }


    public void updateRating() {
        updateRating.click();
    }


    public void writeTitleReview(String textTitleReview) {
        editTitle.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        editTitle.sendKeys(textTitleReview);
    }


    public void writeDetailsReview(String textDetailReview) {
        editDetails.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        editDetails.sendKeys(textDetailReview);
    }


    public void clickCreateButton() {
        createButton.click();
    }


    public void clickUpdateButton() {
        updateButton.click();
    }


    public void clickButtonCancel() {
        cancelButton.click();
    }


}