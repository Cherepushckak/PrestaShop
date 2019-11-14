package main.java.test.testvolodya;

import main.java.helperInstrument.LogInHelper;
import main.java.pages.header.CertainLanguage;
import main.java.pages.user.UserPage;
import main.java.test.test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(test.class)

public class EditAddress extends test {

    @Test
    public void editAddress() {
        // Log In
        new LogInHelper();

        // Change language to English
        new CertainLanguage().clickLanguage().clickEnglishInDropDown();

        // Click addresses card-link
        new UserPage().getUserPageContainer().clickAddresses();


    }

}
