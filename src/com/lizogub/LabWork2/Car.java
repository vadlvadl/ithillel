package com.lizogub.LabWork2;

public class Car extends Vehicle {

    protected int wheelsCount;
    protected int doorsCount;
    protected String fuelType;

    public Car(String fuelType) {
        super(23);
        this.fuelType = fuelType;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public int getDoorsCount() {
        return doorsCount;
    }

    public void setDoorsCount(int doorsCount) {
        this.doorsCount = doorsCount;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void printInfo(){
        System.out.println("Speed: " + speed + "\n" +
                            "FuelType: " + fuelType + "\n" +
                            "Seats" + seats
                            );
    }
}
