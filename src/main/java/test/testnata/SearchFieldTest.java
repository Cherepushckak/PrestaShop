package main.java.test.testnata;

import main.java.pages.searchresult.SearchResultPage;
import main.java.test.BasicTest;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import main.java.helperinstrument.SearchHelper;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Listeners(BasicTest.class)

public class SearchFieldTest extends BasicTest {
    private WebElement actual;
    private final By productLocator = By.xpath("//img[@alt='Mountain fox cushion']");

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verifies possibility to write searching good in searchField and opens SearchResultPage" +
            " with list of searching products")
    @Test

    public void searchFieldTest() {

      SearchResultPage searchResultPage =  new SearchHelper().getSearchResultPage();

        //No page is created!!!! temporally using this!!!change!!!
        actual = OurWebDriver.driver.findElement(productLocator);
        Assert.assertTrue(actual.isDisplayed());
        System.out.println("SearchResult is present");
    }
}