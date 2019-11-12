package main.java.helperInstrument;

import main.java.pages.header.LogUserInfo;
import main.java.pages.user.UserPage;

/**
 * class LogInHelper  has method that opens logIn form, pass credentials. and
 */
public class LogInHelper {
    private LogUserInfo logUserInfo;

    public LogInHelper() {
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
