package com.xworkz.tostring.inner;

public class Car {
    private String model;
    private int year;
    private String color;

    public Car() {
        this.model = "Tesla";
        this.year = 2022;
        this.color = "Red";
    }

    @Override
    public String toString() {
        return "Car [ model=" + model + ", year=" + year + ", color=" + color + " ]";
    }
}
