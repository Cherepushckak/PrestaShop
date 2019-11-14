package main.java.test.testvolodya;

import main.java.helperInstrument.LogInHelper;
import main.java.pages.header.CertainLanguage;
import main.java.pages.user.Address;
import main.java.data.AddressRepository;
import main.java.pages.addresses.*;
import main.java.pages.user.UserPage;
import main.java.test.test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Listeners(test.class)

public class EditAddress extends test {

    @Test
    public void editAddress() throws InterruptedException {
        // Log In
        new LogInHelper();

        // Change language to English
        new CertainLanguage().clickLanguage().clickEnglishInDropDown();

        // Click addresses card-link
        new UserPage().getUserPageContainer().clickAddresses();

        // Verify that we are on the page we expected (Create new address)
        String actualPageName = new AddressesPage().getActualPageName().getText();
        String expectedPageName = "New address";

        // Clear all the fields before filling in
        new NewAddress().clearField("alias", "firstName", "lastName", "company", "vatNumber", "myAddress",
                "addressComplement", "zipPostalCode", "city", "country", "phone");

        // Fill in all required fields from addresses repository from create address1.
        Address address = new AddressRepository().getAddress1();
        new NewAddress().fillInField(address);

        // Click 'SAVE' button
        new NewAddress().clickSaveButton();

        // Verification, that new address was successfully created
        String actualAlert = new AddressesPage().getAddressesList().getAlert().getText();
        System.out.println(actualAlert);
        String expectedAlert = "Address successfully added!";
        System.out.println(expectedAlert);
        assertEquals ( actualAlert, expectedAlert );

        // Verification, new address alias, that it is the same as we expected
        String actualAlias = new AddressesPage().getAddressesList().getAddressesContainer().get(0).getAlias().getText();
        String expectedAlias = new AddressRepository().getAddress1().getAlias();
        assertEquals ( actualAlias, expectedAlias );
    }

}
