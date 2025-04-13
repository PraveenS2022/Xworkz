package com.xworkz.tostring.inner;

public class Bicycle {
    private String brand;
    private int wheelSize;
    private boolean isElectric;

    public Bicycle(String brand, int wheelSize, boolean isElectric) {
        this.brand = brand;
        this.wheelSize = wheelSize;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "Bicycle [brand=" + brand + ", wheelSize=" + wheelSize + ", isElectric=" + isElectric + "]";
    }

    @Override
    public int hashCode() {
        return 101;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bicycle bicycle = (Bicycle) obj;
        return wheelSize == bicycle.wheelSize && isElectric == bicycle.isElectric && brand.equals(bicycle.brand);
    }
}
