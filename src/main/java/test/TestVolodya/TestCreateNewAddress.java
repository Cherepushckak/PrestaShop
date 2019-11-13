package main.java.test.TestVolodya;

import main.java.pages.user.Address;
import main.java.data.AddressRepository;
import main.java.pages.addresses.Addresses;
import main.java.pages.addresses.AddressesPage;
import main.java.pages.addresses.NewAddress;
import main.java.pages.header.UnlogUserInfo;
import main.java.test.test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Listeners(test.class)

public class TestCreateNewAddress extends test {

    @Test
    public void createNewAddress() {
        // Log In and press addresses card-link
        Addresses addressesPage = new UnlogUserInfo().clickSignInHeaderFull().getLoginForm()
                .logIn("admin@gmail.com", "admin").getUserPageContainer().clickAddresses();

        // Verify that we are on the page we expected (Create new address)
        String actualPageName = new AddressesPage().getActualPageName().getText();
        String expectedPageName = "Нова адреса";

        if (!actualPageName.equals(expectedPageName)) {
            new Addresses().clickCreateNewAddressLink();
        }

        assertEquals ( actualPageName, expectedPageName );

        // Clear all the fields before filling in
        new NewAddress().clearField("alias", "firstName", "lastName", "company", "vatNumber", "myAddress",
                "addressComplement", "zipPostalCode", "city", "country", "phone");

        // Fill in all required fields from addresses repository
        Address address = new AddressRepository().getAddress1();
        new NewAddress().fillInField(address);

        // Click 'SAVE' button
        new NewAddress().clickSaveButton();

        // Verification, that new address was successfully created
//        String actualAlias = new Addresses().getActualAlias().getText();
//        System.out.println(actualAlias);
//        String expectedAlias = new AddressRepository().getAddress1().getAlias();
//        System.out.println(expectedAlias);
//        assertEquals ( actualAlias, expectedAlias );
    }

}
