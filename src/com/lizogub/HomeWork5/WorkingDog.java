package com.lizogub.HomeWork5;

public class WorkingDog extends Dog implements Working {

    public WorkingDog( String name ){
        this.name = name;
    }

    @Override
    public void hours() {
        System.out.println("*** Working dog hours -- working weekends!!");
    }
}
