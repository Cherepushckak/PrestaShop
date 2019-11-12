package main.java.helperInstrument;

import main.java.pages.header.LogUserInfo;
import main.java.pages.user.UserPage;
import main.java.pages.header.UnlogUserInfo;
import main.java.tools.OurWebDriver;

import static org.testng.Assert.assertEquals;

public class UserPageInstrument {
  //  private  UserPage userPage;
    private LogUserInfo logUserInfo;
    public UserPageInstrument() {
        initLogUserInfo();

    }

    public void initLogUserInfo() {
        logUserInfo = new UserPage().createHeader()
                .getLogUserInformation()
                .getUnlogogUserInfo()
                .clickSignInHeaderFull()
                .getLoginForm()
                .sendKeysToLoginForm()
                .getUserPageContainer()
                .getLogUserInformation()
                .getLogUserInfo();

//        String expected = "Admin ";
//        assertEquals(logUserInfoText, expected);
    }

    public LogUserInfo getLogUserInfo() {
        return logUserInfo;
    }
}
