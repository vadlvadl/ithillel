package com.lizogub.HomeWork5;

public class Horse extends Animal {
    public Horse(){}
    public Horse( String name ) { this.name = name; }

    @Override
    public String toString() {
        return "*** In Horse: " + this.name;
    }
}
