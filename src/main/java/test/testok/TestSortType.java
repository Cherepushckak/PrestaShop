package main.java.test.testok;

import io.qameta.allure.Description;
import main.java.helperInstrument.SortHelper;
import main.java.pages.header.HeaderFull;
import main.java.pages.main.MainPage;
import main.java.pages.search.SearchPage;
import main.java.test.BasicTest;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(BasicTest.class)

public class TestSortType extends BasicTest {
    //Arrange
    private MainPage mainPage;
    private SearchPage searchPage;
    private SortHelper sortHelper;
    //Act
    //Assert
    @Description("Go to search page.")
    @Test(priority=1)
    public void Step1(){
        //Arrange
        mainPage = new MainPage();
        //Act
        searchPage = mainPage.getPopularProducts().clickAllProducts();
        //Assert
        Assert.assertEquals(searchPage.getDescription().getDescriptionName(),"HOME");
    }

    @Description("Set sort type: Name, A to Z")
    @Test(priority=2)
    public void Step2(){
        //Arrange
        sortHelper = new SortHelper();
        //Act
        searchPage.getSortBy().selectSort(1);
        //Assert
        Assert.assertTrue(sortHelper.checkNameSort(true));
    }

    @Description("Set sort type: Name, Z to A")
    @Test(priority=3)
    public void Step3(){
        //Arrange
        sortHelper = new SortHelper();
        //Act
        searchPage.getSortBy().selectSort(2);
        //Assert
        Assert.assertTrue(sortHelper.checkNameSort(false));
    }

    @Description("Set sort type: Price, low to hight")
    @Test(priority=4)
    public void Step4(){
        //Arrange
        sortHelper = new SortHelper();
        //Act
        searchPage.getSortBy().selectSort(3);
        //Assert
        Assert.assertTrue(sortHelper.checkPriceSort(true));
    }

    @Description("Set sort type: Price, hight to low")
    @Test(priority=5)
    public void Step5(){
        //Arrange
        sortHelper = new SortHelper();
        //Act
        searchPage.getSortBy().selectSort(4);
        //Assert
        Assert.assertTrue(sortHelper.checkPriceSort(false));
    }
}
