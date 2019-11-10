package main.java.data;

public class AddressRepository {

    private static Address address1;
    private static Address address2;

    public AddressRepository() {

        address1 = new Address(
                "My Address",
                "Volodymyr",
                "Zyhmund",
                "SoftServe",
                13,
                "Lviv region, Lviv, Yaroslav Pasternak Street 5, SoftServe 2",
                "",
                79000,
                "Lviv",
                new String[]{"Ukraine"},
                123456789);

        address2 = new Address(
                "My Address Two",
                "Marta",
                "Zyhmund",
                "Private Enterprise",
                13,
                "Home address",
                "",
                79000,
                "Lviv",
                new String[]{"Ukraine"},
                987654321);
    }

    public Address getAddress1() {
        return address1;
    }

    public Address getAddress2() {
        return address2;
    }
}



