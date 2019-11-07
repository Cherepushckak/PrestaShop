package data;

import java.util.Random;

public class UserRepository {

    User petro = new User(
            Title.MR,
            "Petro",
            "Shevchenko",
            "petro.shevchenko@test.com",
            "test",
            "01/06/2000",
            Boolean.TRUE,
            Boolean.FALSE);

    User maria = new User(
            Title.MS,
            "Maria",
            "Kvitka",
            "maria.kvitka@test.com",
            "test",
            "03/03/2001",
            Boolean.TRUE,
            Boolean.TRUE);


    User createUniqueUser() {
        User uniqueUser = new User();

        uniqueUser.setTitle(Title.MR);
        uniqueUser.setFirstName("FirstName");
        uniqueUser.setLastName("LastName");
        uniqueUser.setPassword("test");
        uniqueUser.setBirthday("04/04/1999");
        uniqueUser.setCheckboxReceiveOffers(Boolean.TRUE);
        uniqueUser.setCheckboxSignUpNewsletter(Boolean.TRUE);

        //setting random email like test142@test.com
        Random random = new Random();
        Integer randomNumber = random.nextInt(999);
        String uniqueEmail = "test" + randomNumber + "@test.com";
        uniqueUser.setEmail(uniqueEmail);

        return uniqueUser;
    }



}



