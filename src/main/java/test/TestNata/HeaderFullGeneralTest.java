package main.java.test.TestNata;

import main.java.data.SearchElements;
import main.java.pages.header.HeaderFull;
import main.java.pages.search.SearchPage;
import main.java.test.test;
import main.java.tools.OurWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;
@Listeners(test.class)

public class HeaderFullGeneralTest extends test {
    private WebElement actual;
    private HeaderFull headerFull;

    @BeforeClass
    public void beforeClass() {
        headerFull = new HeaderFull();

    }

    @BeforeMethod
    public void before() {
        OurWebDriver.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void searchFieldTest() {

        SearchPage searchPage = new HeaderFull().clearSearchField()
                .sendKeysToSearchField(SearchElements.SEARCHING_PRODUCT)
                .searchButtonClick();

        //No page is created!!!! temporally using this!!!
        actual = OurWebDriver.driver.findElement(By.xpath("//img[@alt='Mountain fox cushion']"));
        Assert.assertTrue(actual.isDisplayed());
        System.out.println("SearchResult is present");
    }
}