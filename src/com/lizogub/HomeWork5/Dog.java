package com.lizogub.HomeWork5;

public class Dog extends Animal {

    public Dog(){}
    public Dog( String name ){ this.name = name; }

    @Override
    public String toString() {
         return "*** In Dog: " + this.name;
    }
}
