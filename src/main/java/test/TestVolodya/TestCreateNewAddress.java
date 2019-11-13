package main.java.test.TestVolodya;

import main.java.pages.addresses.Addresses;
import main.java.pages.addresses.AddressesPage;
import main.java.pages.header.UnlogUserInfo;
import main.java.pages.user.UserPage;
import main.java.pages.user.UserPageContainer;
import main.java.test.test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Listeners(test.class)

public class TestCreateNewAddress extends test {

    @Test
    public void createNewAddress() {
        // Log In
        Addresses userPage = new UnlogUserInfo().clickSignInHeaderFull().getLoginForm()
                .logIn("admin@gmail.com", "admin").getUserPageContainer().clickAddresses();
//        UserPage userPage = new UnlogUserInfo().clickSignInHeaderFull().getLoginForm()
//                .logIn("volodymyr.romanovych@gmail.com", "prestashop");

        // GOTO Create new address
        //Addresses newAddresses = new UserPageContainer().clickAddresses();

        // Verify that we are on the page we expected (Create new address)
        String actualPageName = new AddressesPage().getActualPageName().getText();
        String expectedPageName = "Нова адреса";
        assertEquals ( actualPageName, expectedPageName );

        // 
    }

}
