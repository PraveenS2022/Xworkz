package com.xworkz.tostring.inner;

public class Humidifier {
    private String brand;
    private int tankCapacity;
    private boolean hasAirPurifier;

    public Humidifier(String brand, int tankCapacity, boolean hasAirPurifier) {
        this.brand = brand;
        this.tankCapacity = tankCapacity;
        this.hasAirPurifier = hasAirPurifier;
    }

    @Override
    public String toString() {
        return "Humidifier [brand=" + brand + ", tankCapacity=" + tankCapacity + " L, hasAirPurifier=" + hasAirPurifier + "]";
    }

    @Override
    public int hashCode() {
        return 123;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Humidifier humidifier = (Humidifier) obj;
        return tankCapacity == humidifier.tankCapacity && hasAirPurifier == humidifier.hasAirPurifier && brand.equals(humidifier.brand);
    }
}
