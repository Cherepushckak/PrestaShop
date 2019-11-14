package main.java.data;

import main.java.pages.user.Address;

public class AddressRepository {

    private static Address address1;
    private static Address address2;

    public AddressRepository() {

        address1 = new Address(
                "My Address",
                "Volodymyr",
                "Zyhmund",
                "SoftServe",
                137778,
                "Lviv region, Lviv, Yaroslav Pasternak Street 5, SoftServe 2",
                "Home",
                79000,
                "Lviv",
                "Ukraine",
                931234567);

        address2 = new Address(
                "My Address Two",
                "Marta",
                "Zyhmund",
                "Private Enterprise",
                13,
                "Home address",
                "...",
                79002,
                "Lviv",
                "Ukraine",
                123456789);
    }

    public Address getAddress1() { return address1; }

    public Address getAddress2() { return address2; }
}



