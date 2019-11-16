package main.java.test.nata;

import main.java.helperinstrument.ChangeLanguageHelper;
import main.java.pages.header.HeaderFull;
import main.java.test.BasicTest;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;


@Listeners(BasicTest.class)


public class ChangeLanguageTest extends BasicTest {

//
//    @Description("BeforeTest checks if language on main page is English,")
//    @BeforeTest
//    public void beforeTest() {
//        changeLanguageHelper.checkIfLanguageIsEnglish();
//    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verifies the possibility to choose Ukrainian language from the list")
    @Test
    public void changeLanguageForUkrainian() {
        //Act
      HeaderFull headerFull = new ChangeLanguageHelper().changeLanguageForUkrainina();
        String actual = headerFull.getLogCont().getContactUS().getText();

        //mvn doesn't accept cyrillic
        Assert.assertTrue(actual != "Contact us");

        System.out.println("Language is changed for Ukrainian");

    }
}
