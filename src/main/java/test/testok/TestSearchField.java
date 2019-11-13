package main.java.test.testok;

import main.java.pages.main.MainPage;
import main.java.pages.searchresult.SearchResultPage;
import main.java.test.test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchField extends test {

    //Arrange
    MainPage mainPage;
    SearchResultPage searchResultPage;
    int expectedFindedItems = 1;

    //Act
    /**
     * Step 1: Open start page.
     * Main page is open by default.
     */

    /**
     * Step 2: Write text in search field.
     */
    @Test(priority = 1)
    public void Step2() {
        mainPage = new MainPage();
        mainPage.sendKeysToSearchField("Shirt");
    }

    /**
     * Step 3: Click on search button.
     */
    @Test(priority = 2)
    public void Step3() {
        searchResultPage = mainPage.searchButtonClick();
    }

    //Assert
    /**
     * Step 4: Check the result.
     */
    @Test(priority = 3)
    public void Step4() {
        Assert.assertEquals(searchResultPage.getProducts().getProductsCount(),expectedFindedItems);
    }

}
