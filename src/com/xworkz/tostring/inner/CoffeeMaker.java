package com.xworkz.tostring.inner;

public class CoffeeMaker {
    private String brand;
    private int cupCapacity;
    private boolean hasMilkFrother;

    public CoffeeMaker(String brand, int cupCapacity, boolean hasMilkFrother) {
        this.brand = brand;
        this.cupCapacity = cupCapacity;
        this.hasMilkFrother = hasMilkFrother;
    }

    @Override
    public String toString() {
        return "CoffeeMaker [brand=" + brand + ", cupCapacity=" + cupCapacity + " cups, hasMilkFrother=" + hasMilkFrother + "]";
    }

    @Override
    public int hashCode() {
        return 118;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CoffeeMaker coffeeMaker = (CoffeeMaker) obj;
        return cupCapacity == coffeeMaker.cupCapacity && hasMilkFrother == coffeeMaker.hasMilkFrother && brand.equals(coffeeMaker.brand);
    }
}
