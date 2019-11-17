package main.java.test.testnata;
import main.java.test.BasicTest;

import main.java.helperinstrument.ChangeLanguageHelper;
import main.java.pages.header.HeaderFull;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Listeners(BasicTest.class)

public class ChangeCurrencyAfterChangingLanguageTest extends BasicTest {

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verifies if currency is changed for USD on CartPage")
    @Test
    public void changeChangeCurrencyAfterChangingLanguage() {

        String actual = new HeaderFull().getCurrency().openDropDownList().chooseUAH().getCurrencyItem().getText();
        System.out.println(actual);
    }
}
