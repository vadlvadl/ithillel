package com.lizogub.HomeWork5;

public class FarmWorkers {

    public static void main(String[] args) {
        Working man = new Farmer( "John" );

        System.out.println( man.toString() );
        man.hours();

        Working horse = new WorkingHorse( "Silver" );
        System.out.println( horse.toString() );
        horse.hours();

        Working dog = new WorkingDog("Max");
        System.out.println(dog.toString());
        dog.hours();
    }

}
