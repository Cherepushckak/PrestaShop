package main.java.helperInstrument;

import main.java.data.UserRepository;
import main.java.pages.header.LogUserInfo;
import main.java.pages.header.LogUserInformation;
import main.java.pages.user.UserPage;
import main.java.pages.header.UnlogUserInfo;
import main.java.tools.OurWebDriver;

import static org.testng.Assert.assertEquals;

public class LogInHelper {
    //  private  UserPage userPage;
    private UserPage userPage;

    public LogInHelper() {
        initLogUserInfo();
    }

    public void initLogUserInfo() {
        //Oleg to Nata, i delete some functions cause as i understand it is method to login and it should be looking like this
        userPage = new LogUserInformation ()
                .getUnlogogUserInfo()
                .clickSignInHeaderFull()
                .getLoginForm()
                .logIn( new UserRepository ().getAdmin ().getEmail (), new UserRepository ().getAdmin ().getPassword () );

    }

    public UserPage getUserPage() {
        return userPage;
    }
}
