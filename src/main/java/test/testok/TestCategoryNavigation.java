package main.java.test.testok;

import main.java.pages.main.MainPage;
import main.java.pages.search.SearchPage;
import main.java.test.test;
import main.java.tools.OurWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCategoryNavigation extends test {

    //Arrange
    private MainPage mainPage;
    private SearchPage searchPage;
    private String addressBuffer;

    //Act
    /**
     * Step 1:
     * Open search page.
     */
    @Test
    public void Step1(){
        //Arrange
        mainPage = new MainPage();
        //Act
        mainPage.getPopularProducts().getAllProducts().click();
        //Assert
        Assert.assertEquals(OurWebDriver.driver.getCurrentUrl(),addressBuffer);
    }

    /**
     * Step 2:
     * Check "Home" category.
     */
    @Test
    public void Step2(){
        //Arrange
        searchPage = new SearchPage();
        addressBuffer = OurWebDriver.driver.getCurrentUrl();
        //Act
        searchPage.getCategories().clickCategoryName();
        //Assert
        Assert.assertEquals(OurWebDriver.driver.getCurrentUrl(),addressBuffer);
    }

    /**
     * Step 3:
     * Check "Clothes" category.
     */
    @Test
    public void Step3(){
        //Arrange
        //Act
        searchPage.getCategories().clickCategory(0);
        //Assert
        Assert.assertEquals(searchPage.getDescription().getDescriptionName(),"Clothes");
    }

    /**
     * Step 4:
     */
    @Test
    public void Step4(){
        //Arrange
        //Act
        //Assert

    }

    /**
     * Step 5:
     */
    @Test
    public void Step5(){
        //Arrange
        //Act
        //Assert

    }

    /**
     * Step 6:
     */
    @Test
    public void Step6(){
        //Arrange
        //Act
        //Assert

    }

    /**
     * Step 7:
     */
    @Test
    public void Step7(){
        //Arrange
        //Act
        //Assert

    }

    /**
     * Step 8:
     */
    @Test
    public void Step8(){
        //Arrange
        //Act
        //Assert

    }

    /**
     * Step 9:
     */
    @Test
    public void Step9(){
        //Arrange
        //Act
        //Assert

    }

    //Assert

}
