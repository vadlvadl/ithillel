package com.lizogub.HomeWork6;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Employee extends Human implements StaffMember, Iterable{

    protected Address homeAddress;
    protected String mobilePhone;
    protected int salary;

    public Employee(String name, Sex sex) {
        super(name, sex);
    }

    public Employee(String name, Sex sex, Address homeAddress) {
        super(name, sex);
        this.homeAddress = homeAddress;
    }

    @Override
    public void setHomeAddress(Address address) {
        this.homeAddress = address;
    }

    @Override
    public Address getHomeAddress() {
        return this.homeAddress;
    }

    @Override
    public void toVacation() {
        System.out.println("Employee " + name + " is going to vacation");
    }

    @Override
    public void payOut() {
        System.out.println("Employee " + name + " getting salary)");
    }

    @Override
    public String toString() {
        return name + " (" + homeAddress.getCity() + ")";
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
