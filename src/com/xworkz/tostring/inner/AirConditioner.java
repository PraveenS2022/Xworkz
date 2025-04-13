package com.xworkz.tostring.inner;

public class AirConditioner {
    private String brand;
    private int coolingCapacity;
    private boolean hasHeatingFunction;

    public AirConditioner(String brand, int coolingCapacity, boolean hasHeatingFunction) {
        this.brand = brand;
        this.coolingCapacity = coolingCapacity;
        this.hasHeatingFunction = hasHeatingFunction;
    }

    @Override
    public String toString() {
        return "AirConditioner [brand=" + brand + ", coolingCapacity=" + coolingCapacity + " BTU, hasHeatingFunction=" + hasHeatingFunction + "]";
    }

    @Override
    public int hashCode() {
        return 112;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AirConditioner that = (AirConditioner) obj;
        return coolingCapacity == that.coolingCapacity && hasHeatingFunction == that.hasHeatingFunction && brand.equals(that.brand);
    }
}
