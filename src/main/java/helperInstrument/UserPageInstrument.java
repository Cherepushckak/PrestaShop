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
        logUserInfo = new UserPage()
                .getLogUserInformation()
                .getUnlogogUserInfo()
                .clickSignInHeaderFull()
                .getLoginForm()
                .logIn("admin@gmail.com", "admin")
                .getLogUserInformation()
                .getLogUserInfo();

    }

    public LogUserInfo getLogUserInfo() {
        return logUserInfo;
    }
}
