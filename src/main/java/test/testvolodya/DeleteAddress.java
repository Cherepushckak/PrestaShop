package main.java.test.testvolodya;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import main.java.helperinstrument.LogInHelper;
import main.java.pages.addresses.*;
import main.java.pages.header.CertainLanguage;
import main.java.pages.user.UserPage;
import main.java.test.test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Listeners(test.class)

public class DeleteAddress extends test {

    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that address entry can be deleted")
    @Test
    public void deleteAddress() {
        // Log In
        new LogInHelper();

        // Change language to English
        new CertainLanguage().clickLanguage().clickEnglishInDropDown();

        // Click addresses card-link
        new UserPage().getUserPageContainer().clickAddresses();

        // Verify that we are on the page we expected (Create new address)
        String actualPageName = new AddressesPage().getActualPageName().getText();
        String expectedPageName = "Your addresses";

        // Press 'Delete' button
        System.err.println("\tATTENTION!\n\tDeleting address!_\n");
        new AddressesPage().getAddressesList().getAddressesContainer().get(0).clickDelete();

        // Verification, that new address was successfully created
        String actualAlert = new AddressesPage().getAddressesList().getAlert().getText();
        System.out.println(actualAlert);
        String expectedAlert = "Address successfully deleted!";
        System.out.println(expectedAlert);
        assertEquals ( actualAlert, expectedAlert );
    }

}
