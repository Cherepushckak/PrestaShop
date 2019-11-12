package main.java.test.testVolodya;

import main.java.data.Address;
import main.java.data.AddressRepository;
import main.java.pages.addresses.Addresses;
import main.java.pages.addresses.AddressesPage;
import main.java.pages.addresses.NewAddress;
import main.java.pages.header.UnlogUserInfo;
import main.java.pages.user.UserPage;
import main.java.pages.user.UserPageContainer;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import main.java.tools.WebDriver;

import static org.testng.Assert.assertEquals;

public class TestCreateNewAddress {

    @BeforeTest
    public void launchBrowser() {
        System.out.println("\tLaunching Volodya's test suite:\n");
        WebDriver webDriver = new WebDriver();
    }

    @Test(priority = 1)
    public void createNewAddress() {

        // Log In
        UserPage userPage = new UnlogUserInfo().clickSignIn()
                .writeDefaultCredantials("admin@gmail.com", "admin");
//        UserPage userPage = new UnlogUserInfo().clickSignIn()
//                .writeDefaultCredantials("volodymyr.romanovych@gmail.com", "prestashop");

        // GOTO Create new address
        Addresses newAddresses = new UserPageContainer().clickAddresses();

        // Check page name
        String actualPageName = new AddressesPage().getActualPageName().getText();
        String expectedPageName = "Нова адреса";
        assertEquals ( actualPageName, expectedPageName ); // Verify, that we are on the page, we expected

        // Fill data from AddressRepository
        Address address1 = new AddressRepository().getAddress1();

//        WebElement newAddress = new NewAddress().getAlias().clear();
//        String testTest = "vsdfffsfdsf";
//        NewAddress newAddress = new NewAddress().getAlias().sendKeys(testTest);
    }

    @Test(priority = 2)
    public void createNewAddress2() {
        System.out.println("It WORKs 2! =D");
    }

    @AfterTest
    public void terminateBrowser() {
        // Close test browser windows to release hardware resources
       WebDriver.driver.quit();
    }
}
