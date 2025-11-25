package main.java.model.entities;

public class Address {

    private Integer numberHouse;
    private String country;
    private String street;

    public Address(Integer numberHouse, String country, String street) {
        this.numberHouse = numberHouse;
        this.country = country;
        this.street = street;
    }
}
