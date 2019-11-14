package main.java.data;

import java.util.Random;

public class UserRepository {

    private static User petro;
    private static User maria;
    private static User admin;
    private static User uniqueUser;

    public UserRepository() {

        petro = new User(
                Title.MR,
                "Petro",
                "Shevchenko",
                System.getProperty ( "petroEmail" ),
                System.getProperty ( "masterPass" ),
                "01/06/2000",
                Boolean.TRUE,
                Boolean.FALSE);

        maria = new User(
                Title.MS,
                "Maria",
                "Kvitka",
                System.getProperty ( "mariaEmail" ),
                System.getProperty ( "masterPass" ),
                "03/03/2001",
                Boolean.TRUE,
                Boolean.TRUE);

        admin = new User();
        admin.setEmail(System.getProperty ( "adminEmail" ));
        admin.setPassword(System.getProperty ( "masterPass" ));

        uniqueUser = createUniqueUser();

    }

    private User createUniqueUser() {
        User uniqueUser = new User();

        uniqueUser.setTitle(Title.MR);
        uniqueUser.setFirstName("FirstName");
        uniqueUser.setLastName("LastName");
        uniqueUser.setPassword(System.getProperty ( "masterPass" ));
        uniqueUser.setBirthday("1999-04-04");
        uniqueUser.setCheckboxReceiveOffers(Boolean.TRUE);
        uniqueUser.setCheckboxSignUpNewsletter(Boolean.TRUE);

        //setting random email like test142@test.com
        Random random = new Random();
        Integer randomNumber = random.nextInt(999);
        String uniqueEmail = System.getProperty ( "uniqueTest" ) + randomNumber + System.getProperty ( "uniqueGmail" );
        uniqueUser.setEmail(uniqueEmail);

        return uniqueUser;
    }

    public User getPetro() {
        return petro;
    }

    public User getMaria() {
        return maria;
    }

    public User getAdmin() {
        return admin;
    }

    public User getUniqueUser() {
        return uniqueUser;
    }
}



