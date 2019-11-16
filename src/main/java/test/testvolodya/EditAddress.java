/*
 * main.java.pages.addresses;
 *
 * Version 1.0
 *
 * 09.11.2019
 *
 * Copyright: Made by Volodymyr Zyhmund
 */

package main.java.test.testvolodya;

// Additional packages
import io.qameta.allure.*;
import main.java.pages.addresses.*;
import main.java.pages.user.Address;
import main.java.pages.header.CertainLanguage;
import main.java.helperinstrument.LogInHelper;
import main.java.data.AddressRepository;
import main.java.pages.user.UserPage;
import main.java.test.BasicTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

// Listeners are waiting for the error and if it occurs - make a screenshot of error page
@Listeners(BasicTest.class)

// EditAddress class
public class EditAddress extends BasicTest {

    // Severity and description for Allure report
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that address entry can be updated")
    @Test
    public void editAddress() {
        // Log In to PrestaShop
        UserPage userPage = new LogInHelper().getUserPage();

        // Change language to English
        CertainLanguage certainLanguage = new CertainLanguage().clickLanguage().clickEnglishInDropDown();

        // Click 'Addresses' card-link
        Addresses addresses = new UserPage().getUserPageContainer().clickAddresses();

        // Press 'Update' button on the 1st item and return Addresses page
        System.err.println("\tATTENTION!\n\tUpdating address!_\n");
        Addresses addresses1 = new AddressesPage().getAddressesList().getAddressesContainer().get(0).clickUpdate();

        // Clear all the fields before filling in
        NewAddress newAddress = new NewAddress().clearField(
                "alias",
                "firstName",
                "lastName",
                "company",
                "vatNumber",
                "myAddress",
                "addressComplement",
                "zipPostalCode",
                "city",
                "country",
                "phone");

        // Fill in all required fields from addresses repository from create address2.
        Address address = new AddressRepository().getAddress2();
        NewAddress newAddress2 = new NewAddress().fillInField(address);

        // Click 'SAVE' button and return Addresses page
        Addresses addresses2 = new NewAddress().clickSaveButton();

        // Verification, that address was successfully updated
        String actualAlert = new AddressesPage().getAddressesList().getAlert().getText();
        String expectedAlert = "Address successfully updated!";
        assertEquals ( actualAlert, expectedAlert );

        // Verify, that new address alias, is as we expected
        String actualAlias = new AddressesPage().getAddressesList().getAddressesContainer().get(0).getAlias().getText();
        String expectedAlias = new AddressRepository().getAddress2().getAlias();
        assertEquals ( actualAlias, expectedAlias );
    }

}
