package com.lizogub.HomeWork6;

import java.util.ArrayList;
import java.util.List;

public class DataSampler {
    protected String[] maleNames = {"Ivan","Vadim","Alex","Oleg","Igor","Vitaliy","Dmitriy"};
    protected String[] femaleNames = {"Kristina","Olga","Elena","Katherin","Alexandra","Victoria"};
    protected String[] animalNames = {"Star","Molly","Snakky","Maggy","Junior","Crazy"};

    private String getRandomMaleName(){
        int index = (int) Math.floor(Math.random() * maleNames.length);

        return maleNames[index];
    }

    private String getRandomFemaleName(){
        int index = (int) Math.floor(Math.random() * (femaleNames.length - 1));

        return femaleNames[index];
    }

    private String getRandomAnimalName(){
        int index = (int) Math.floor(Math.random() * animalNames.length);

        return animalNames[index];
    }

    public Address generateZooAddress(){
        Address address = new Address("Ukraine","Odessa","Novoschepnoy Ryad","1");

        return address;
    }

    public List<Employee> generateEmployees(){
        ArrayList<Employee> staff = new ArrayList<Employee>();

        Address address1 = new Address("Ukraine","Odessa","Gogolya","21a");
        Address address2 = new Address("Ukraine","Kyiv","Shevchenka","32/1");
        Address address3 = new Address("Ukraine","Lviv","Petlyury","77");

        staff.add(new Employee(getRandomFemaleName(),Sex.FEMALE, address1));
        staff.add(new Employee(getRandomFemaleName(),Sex.FEMALE, address2));
        staff.add(new Employee(getRandomMaleName(),Sex.MALE, address1));
        staff.add(new Employee(getRandomFemaleName(),Sex.FEMALE,address3));
        staff.add(new Employee(getRandomMaleName(),Sex.MALE,address2));

        return staff;
    }

    public List<Animal> generateAnimals(){
        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(new Leopard(getRandomAnimalName()));
        animals.add(new Monkey(getRandomAnimalName()));
        animals.add(new Monkey(getRandomAnimalName()));
        animals.add(new Leopard(getRandomAnimalName()));

        return animals;
    }

}
