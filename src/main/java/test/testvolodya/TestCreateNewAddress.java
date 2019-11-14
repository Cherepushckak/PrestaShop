package main.java.test.testvolodya;

import main.java.helperInstrument.LogInHelper;
import main.java.pages.user.Address;
import main.java.data.AddressRepository;
import main.java.pages.addresses.*;
import main.java.test.test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Listeners(test.class)

public class TestCreateNewAddress extends test {

    @Test
    public void createNewAddress() throws InterruptedException {
        // Log In and press addresses card-link
        Addresses addressesPage = new LogInHelper()
                .getUserPage()
                .getUserPageContainer()
                .clickAddresses();

        // Verify that we are on the page we expected (Create new address)
        String actualPageName = new AddressesPage().getActualPageName().getText();
        String expectedPageName = "Нова адреса";

        // If there is no addresses yet - create first address, in other case - press 'Create new address' button
        if (actualPageName.equals(expectedPageName)) {
            System.out.println("\tThere is no addresses in the list!\n Creating first address_\n");
        } else {
            System.out.println("\tSome addresses already exist!\n Creating new one for test_\n");
            new Addresses().clickCreateNewAddressLink();
        }

        // Clear all the fields before filling in
        new NewAddress().clearField("alias", "firstName", "lastName", "company", "vatNumber", "myAddress",
                "addressComplement", "zipPostalCode", "city", "country", "phone");

        // Fill in all required fields from addresses repository
        // If there is no addresses yet - create address1. If addresses exist - create address2.
        if (actualPageName.equals(expectedPageName)) {
            // If there is no addresses yet - create address1. If addresses exist - create address2.
            Address address = new AddressRepository().getAddress1();
            new NewAddress().fillInField(address);
        } else {
            // If there is no addresses yet - create address1. If addresses exist - create address2.
            Address address = new AddressRepository().getAddress2();
            new NewAddress().fillInField(address);
        }

        // Click 'SAVE' button
        new NewAddress().clickSaveButton();

        // Verification, that new address was successfully created
        String actualAlias = new AddressesPage().getAddressesList().getAddressesContainer().get(0).getAlias().getText();
        System.out.println(actualAlias);
        String expectedAlias = new AddressRepository().getAddress1().getAlias();
        System.out.println(expectedAlias);
        assertEquals ( actualAlias, expectedAlias );
    }

}
