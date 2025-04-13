package com.xworkz.tostring.inner;

public class BicycleHelmet {
    private String brand;
    private int material;
    private boolean isVentilated;

    public BicycleHelmet(String brand, int material, boolean isVentilated) {
        this.brand = brand;
        this.material = material;
        this.isVentilated = isVentilated;
    }

    @Override
    public String toString() {
        return "BicycleHelmet [brand=" + brand + ", material=" + material + ", isVentilated=" + isVentilated + "]";
    }

    @Override
    public int hashCode() {
        return 114;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BicycleHelmet helmet = (BicycleHelmet) obj;
        return isVentilated == helmet.isVentilated && brand.equals(helmet.brand) && material;
    }
}
