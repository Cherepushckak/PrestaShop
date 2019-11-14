package main.java.test.testnata;

import main.java.data.SearchElements;
import main.java.pages.header.HeaderFull;
import main.java.pages.searchresult.SearchResultPage;
import main.java.test.test;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(test.class)

public class SearchFieldTest extends test {
    private WebElement actual;
    private final By productLocator = By.xpath("//img[@alt='Mountain fox cushion']");


    @Test
    public void searchFieldTest() {

        SearchResultPage searchResultPage = new HeaderFull().clearSearchField()
                .sendKeysToSearchField(SearchElements.SEARCHING_PRODUCT)
                .searchButtonClick();

        //No page is created!!!! temporally using this!!!
        actual = OurWebDriver.driver.findElement(productLocator);
        Assert.assertTrue(actual.isDisplayed());
        System.out.println("SearchResult is present");
    }
}