package com.lizogub.LabWork2;

public class Vehicle {
    protected int speed;  // km/h
    protected int seats;
    protected int weight; // g
    protected int height; // height mm

    public Vehicle(int seats) {
        this.speed = 45;
        this.seats = seats;
    }

    public int getSpeed() {

        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    protected int width; //width mm
}
