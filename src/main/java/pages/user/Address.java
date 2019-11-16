/*
 * main.java.pages.addresses;
 *
 * Version 1.0
 *
 * 09.11.2019
 *
 * Copyright: Made by Volodymyr Zyhmund
 */

package main.java.pages.user;

// Address class
public class Address {

    // Fields
    private String alias;
    private String firstName;
    private String lastName;
    private String company;
    private Integer vatNumber;
    private String myAddress;
    private String addressComplement;
    private Integer zipPostalCode;
    private String city;
    private String country;
    private Integer phone;

    // Default empty method
    public Address(){}

    // Default constructor
    public Address(String alias,
                   String firstName,
                   String lastName,
                   String company,
                   Integer vatNumber,
                   String myAddress,
                   String addressComplement,
                   Integer zipPostalCode,
                   String city,
                   String country,
                   Integer phone) {

        this.alias = alias;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.vatNumber = vatNumber;
        this.myAddress = myAddress;
        this.addressComplement = addressComplement;
        this.zipPostalCode = zipPostalCode;
        this.city = city;
        this.country = country;
        this.phone = phone;
    }

    // Getters
    public String getAlias() {
        return alias;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getCompany() {
        return company;
    }
    public Integer getVatNumber() { return vatNumber; }
    public String getMyAddress() {
        return myAddress;
    }
    public String getAddressComplement() {
        return addressComplement;
    }
    public Integer getZipPostalCode() {
        return zipPostalCode;
    }
    public String getCity() {
        return city;
    }
    public String getCountry() {
        return country;
    }
    public Integer getPhone() {
        return phone;
    }

    // Override
    @Override
    public String toString() { return super.toString(); }
}
