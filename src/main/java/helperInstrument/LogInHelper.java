package main.java.helperInstrument;

import main.java.pages.user.UserPage;


import main.java.data.UserRepository;
import main.java.pages.header.LogUserInformation;

/**
 * class LogInHelper  has method that opens logIn form, pass credentials. and
 */
public class LogInHelper {
    //  private  UserPage userPage;
    private UserPage userPage;


    public LogInHelper() {
        initLogUserInfo();
    }

    public void initLogUserInfo() {

        userPage = new LogUserInformation()
                .getUncloggedUserInfo()
                .clickSignInHeaderFull()
                .getLoginForm()
                .logIn( new UserRepository().getAdmin ().getEmail (), new UserRepository ().getAdmin ().getPassword () );

    }

    public UserPage getUserPage() {
        return userPage;
    }
}

