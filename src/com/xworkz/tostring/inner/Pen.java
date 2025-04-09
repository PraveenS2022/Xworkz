package com.xworkz.tostring.inner

public class Pen {
    private String brand;
    private boolean refillable;
    private String color;

    public Pen() {
        this.brand = "Parker";
        this.refillable = true;
        this.color = "Blue";
    }

    @Override
    public String toString() {
        return "Pen [ brand=" + brand + ", refillable=" + refillable + ", color=" + color + " ]";
    }
}
