package main.java.test.TestOK;

import main.java.pages.main.MainPage;
import main.java.pages.searchresult.SearchResultPage;
import main.java.test.test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchField extends test {


    @Test
    public void PositiveTest(){
        //Arrange
        MainPage mainPage;
        SearchResultPage searchResultPage;
        int expectedFindedItems = 1;

        //Act
        //Step 1: Open start page.
        //main page is open by default

        //Step 2: Write text in search field.
        mainPage = new MainPage();
        mainPage.sendKeysToSearchField("Shirt");
        
        //Step 3: Click on search button.
        searchResultPage = mainPage.searchButtonClick();

        //Assert
        //Step 4: Check the result.
        Assert.assertEquals(searchResultPage.getProducts().getProductsCount(),expectedFindedItems);

    }

}
