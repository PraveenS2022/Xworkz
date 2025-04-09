package com.xworkz.tostring.inner;

public class Laptop {
    private String brand;
    private int ram;
    private String processor;

    public Laptop() {
        this.brand = "Dell";
        this.ram = 16;
        this.processor = "Intel i7";
    }

    @Override
    public String toString() {
        return "Laptop [ brand=" + brand + ", ram=" + ram + ", processor=" + processor + " ]";
    }
}
