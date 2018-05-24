package com.lizogub.HomeWork6;

public class Animal {
    protected String name;
    protected int age = 0;

    public Animal( String name ) { this.name = name; }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString()     {
        if(age > 0) {
            return this.name + "(" + age + ")";
        }
        return this.name;
    }
}
