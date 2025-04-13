package com.xworkz.tostring.inner;

public class FanHeater {
    private String brand;
    private int power;
    private boolean isPortable;

    public FanHeater(String brand, int power, boolean isPortable) {
        this.brand = brand;
        this.power = power;
        this.isPortable = isPortable;
    }

    @Override
    public String toString() {
        return "FanHeater [brand=" + brand + ", power=" + power + " W, isPortable=" + isPortable + "]";
    }

    @Override
    public int hashCode() {
        return 120;
    }
}
