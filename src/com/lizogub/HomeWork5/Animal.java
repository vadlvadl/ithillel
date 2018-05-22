package com.lizogub.HomeWork5;

public abstract class Animal {
    protected String name;

    public Animal() {}
    public Animal( String name ) { this.name = name; }
    public String toString()     { return this.name; }
}
