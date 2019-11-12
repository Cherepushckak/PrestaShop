package main.java.helper;

import main.java.pages.header.UnlogUserInfo;
import main.java.pages.user.UserPage;

public class LogInHelper {

    private UserPage userPage;

    public LogInHelper () {
        init();
    }

    private void init () {
        userPage = new UnlogUserInfo().clickSignInHeaderFull().getLoginForm ()
                .logIn ( "admin@gmail.com", "admin" );
    }

    public UserPage getUserPage() {
        return userPage;
    }
}
