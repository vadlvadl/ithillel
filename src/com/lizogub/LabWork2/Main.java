package com.lizogub.LabWork2;

public class Main {

    public static void main(String[] args) {
        Contact contact = new Contact();
        contact.setName("Vadim");
        contact.setPhone(42342123);

        Address address = new Address();
        address.setStreet("Kanatnaya 20");
        address.setIndex(65023);
        contact.setAddress(address);
    }
}
