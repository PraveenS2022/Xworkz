package com.xworkz.tostring.inner;

public class Fan {
    private String brand;
    private int blades;
    private boolean oscillating;

    public Fan() {
        this.brand = "Havells";
        this.blades = 3;
        this.oscillating = true;
    }

    @Override
    public String toString() {
        return "Fan [ brand=" + brand + ", blades=" + blades + ", oscillating=" + oscillating + " ]";
    }
}
