package com.xworkz.tostring.inner;

public class HairDryer {
    private String brand;
    private int power;
    private boolean hasCoolShot;

    public HairDryer(String brand, int power, boolean hasCoolShot) {
        this.brand = brand;
        this.power = power;
        this.hasCoolShot = hasCoolShot;
    }

    @Override
    public String toString() {
        return "HairDryer [brand=" + brand + ", power=" + power + " W, hasCoolShot=" + hasCoolShot + "]";
    }

    @Override
    public int hashCode() {
        return 122;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        HairDryer hairDryer = (HairDryer) obj;
        return power == hairDryer.power && hasCoolShot == hairDryer.hasCoolShot && brand.equals(hairDryer.brand);
    }
}
