package com.xworkz.tostring.inner

public class Phone {
    private String brand;
    private String model;
    private double price;

    public Phone() {
        this.brand = "Samsung";
        this.model = "S21";
        this.price = 799.99;
    }

    @Override
    public String toString() {
        return "Phone [ brand=" + brand + ", model=" + model + ", price=" + price + " ]";
    }
}
