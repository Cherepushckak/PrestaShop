/*
 * main.java.pages.addresses;
 *
 * Version 1.0
 *
 * 09.11.2019
 *
 * Copyright: Made by Volodymyr Zyhmund
 */

package main.java.data;

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
    private String[] country;
    private Integer phone;

    // Default empty method
    public Address(){};

    public Address(String alias,
                   String firstName,
                   String lastName,
                   String company,
                   Integer vatNumber,
                   String myAddress,
                   String addressComplement,
                   Integer zipPostalCode,
                   String city,
                   String[] country,
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

    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getVatNumber() {
        return vatNumber;
    }
    public void setVatNumber(Integer vatNumber) {
        this.vatNumber = vatNumber;
    }

    public String getMyAddress() {
        return myAddress;
    }
    public void setMyAddress(String myAddress) {
        this.myAddress = myAddress;
    }

    public String getAddressComplement() {
        return addressComplement;
    }
    public void setAddressComplement(String addressComplement) { this.addressComplement = addressComplement; }

    public Integer getZipPostalCode() {
        return zipPostalCode;
    }
    public void setZipPostalCode(Integer zipPostalCode) { this.zipPostalCode = zipPostalCode; }

    public String getCity() {
        return city;
    }
    public void setCity(String city) { this.city = city; }

    public String[] getCountry() {
        return country;
    }
    public void setCountry(String[] country) { this.country = country; }

    public Integer getPhone() {
        return phone;
    }
    public void setPhone(Integer phone) { this.phone = phone; }

    @Override
    public String toString() {
        return super.toString();
    }
}
