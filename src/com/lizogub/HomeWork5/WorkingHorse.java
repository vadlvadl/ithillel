package com.lizogub.HomeWork5;

public class WorkingHorse extends Horse implements Working{

    public WorkingHorse( String name ){
        this.name = name;
    }

    @Override
    public void hours() {
        System.out.println("*** Working horse hours -- also working weekends.");
    }
}
