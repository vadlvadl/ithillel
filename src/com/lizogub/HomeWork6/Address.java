package com.lizogub.HomeWork6;

public class Address {
    private String country;
    private String city;
    private String street;
    private String building;
    private String room;

    public Address(String country, String city, String street, String building) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.building = building;
    }

    public Address(String country, String city, String street, String building, String room) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.building = building;
        this.room = room;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Country: " + country + "\n" +
                "City: " + city + "\n" +
                "Street: " + street + ", " + building + "\n" +
                "Room: " + room;
    }
}
