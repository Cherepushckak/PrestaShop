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
                "petro.shevchenko@test.com",
                "test123",
                "01/06/2000",
                Boolean.TRUE,
                Boolean.FALSE);

        maria = new User(
                Title.MS,
                "Maria",
                "Kvitka",
                "maria.kvitka3@test.com",
                "test123",
                "03/03/2001",
                Boolean.TRUE,
                Boolean.TRUE);

        admin = new User();
        admin.setEmail("admin@gmail.com");
        admin.setPassword("admin");

        uniqueUser = createUniqueUser();

    }

    private User createUniqueUser() {
        User uniqueUser = new User();

        uniqueUser.setTitle(Title.MR);
        uniqueUser.setFirstName("FirstName");
        uniqueUser.setLastName("LastName");
        uniqueUser.setPassword("test123");
        uniqueUser.setBirthday("04/04/1999");
        uniqueUser.setCheckboxReceiveOffers(Boolean.TRUE);
        uniqueUser.setCheckboxSignUpNewsletter(Boolean.TRUE);

        //setting random email like test142@test.com
        Random random = new Random();
        Integer randomNumber = random.nextInt(999);
        String uniqueEmail = "test1" + randomNumber + "@test.com";
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



