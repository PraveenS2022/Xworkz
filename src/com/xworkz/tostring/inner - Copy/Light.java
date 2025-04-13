package com.xworkz.tostring.inner;

public class Light {
    private String type;
    private int wattage;
    private boolean isLED;

    public Light() {
        this.type = "Bulb";
        this.wattage = 60;
        this.isLED = true;
    }

    @Override
    public String toString() {
        return "Light [ type=" + type + ", wattage=" + wattage + ", isLED=" + isLED + " ]";
    }
}
