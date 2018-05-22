package com.lizogub.HomeWork5;

public class Farmer extends Person implements Working{

    public Farmer(){
        super();
    }

    public Farmer(String name){
        super();
        this.sName = name;
    }

    @Override
    public String toString() {
        return "*** In Farmer: " + this.sName;
    }

    @Override
    public void hours() {
        System.out.println("*** Working Farmer - 7 days a week!");
    }
}
