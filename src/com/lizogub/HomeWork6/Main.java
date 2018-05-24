package com.lizogub.HomeWork6;

public class Main {
    public static void main(String[] args) {
        DataSampler ds = new DataSampler();
        Zoo zoo = new Zoo("National Zoo in Odessa");

        zoo.setAddress(ds.generateZooAddress());
        zoo.setEmployees(ds.generateEmployees());
        zoo.setAnimals(ds.generateAnimals());

        zoo.printAnimals();
        zoo.printEmployees();
    }


}
