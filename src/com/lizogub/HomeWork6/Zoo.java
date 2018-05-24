package com.lizogub.HomeWork6;

import java.util.List;

public class Zoo {
    protected String name;
    protected Address address;
    protected List<Employee> employees;
    protected List<Animal> animals;

    public Zoo(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void addEmployee(Employee employee) {
        this.employees.add( employee );
    }

    public void setEmployees(List<Employee> employees){
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void printEmployees(){
        int i = 1;

        System.out.println("Employees:");
        for (Employee e:this.employees) {
            System.out.println(i + ". " + e.toString());
            i++;
        }
    }

    public void addAnimal(Animal animal) {
        this.animals.add( animal );
    }

    public void setAnimals(List<Animal> animals){
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void printAnimals(){
        String list = "";

        System.out.println("Animals:");
        for (Animal e:this.animals) {
            System.out.println("- " + e.toString());
        }
    }

}
