package com.lizogub.HomeWork6;

public class Animal implements Comparable{
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


    // Check compareTo method
    @Override
    public int compareTo(Object o) {
        return 1;
    }

    public int compareTo(Animal o) {
        return name.compareTo(o.name);
    }


}
