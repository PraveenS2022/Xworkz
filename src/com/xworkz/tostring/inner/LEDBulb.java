package com.xworkz.tostring.inner;

public class LEDBulb {
    private String brand;
    private int wattage;
    private boolean isDimmable;

    public LEDBulb(String brand, int wattage, boolean isDimmable) {
        this.brand = brand;
        this.wattage = wattage;
        this.isDimmable = isDimmable;
    }

    @Override
    public String toString() {
        return "LEDBulb [brand=" + brand + ", wattage=" + wattage + " W, isDimmable=" + isDimmable + "]";
    }

    @Override
    public int hashCode() {
        return 128;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        LEDBulb ledBulb = (LEDBulb) obj;
        return wattage == ledBulb.wattage && isDimmable == ledBulb.isDimmable && brand.equals(ledBulb.brand);
    }
}
