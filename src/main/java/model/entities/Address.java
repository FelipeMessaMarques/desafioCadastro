package main.java.model.entities;

public class Address {

    private String numberHouse;
    private String country;
    private String street;

    public Address(String numberHouse, String country, String street) {
        this.numberHouse = numberHouse;
        this.country = country;
        this.street = street;
    }
}
