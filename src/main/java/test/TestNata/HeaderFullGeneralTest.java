package main.java.test.TestNata;

import main.java.data.SearchElements;
import main.java.pages.header.HeaderFull;
import main.java.pages.search.SearchPage;
import main.java.tools.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HeaderFullGeneralTest {
    WebDriver webDriver = new WebDriver();
    private WebElement actual;
    private HeaderFull headerFull;

    @BeforeClass
    public void beforeClass(){
        headerFull = new HeaderFull();

    }
    @BeforeMethod
    public void before() {
        webDriver.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.driver.manage().window().maximize();
    }

    @Test
    public void searchFieldTest() {

        SearchPage searchPage = new HeaderFull().clearSearchField()
                .sendKeysToSearchField(SearchElements.SEARCHING_PRODUCT)
                .searchButtonClick();

        //No page is created!!!! temporally using this!!!
        actual = webDriver.driver.findElement(By.xpath("//img[@alt='Mountain fox cushion']"));
        Assert.assertTrue(actual.isDisplayed());
        System.out.println("SearchResult is present");
    }

    @AfterClass
    public void afterClass(){
        webDriver.closeDriver();
    }
}
