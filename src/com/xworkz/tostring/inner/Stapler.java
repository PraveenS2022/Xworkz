package com.xworkz.tostring.inner;

public class Stapler {
    private String brand;
    private int pinCapacity;
    private boolean isHeavyDuty;

    public Stapler(String brand, int pinCapacity, boolean isHeavyDuty) {
        this.brand = brand;
        this.pinCapacity = pinCapacity;
        this.isHeavyDuty = isHeavyDuty;
    }

    @Override
    public String toString() {
        return "Stapler [brand=" + brand + ", pinCapacity=" + pinCapacity + ", isHeavyDuty=" + isHeavyDuty + "]";
    }

    @Override
    public int hashCode() {
        return 120;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Stapler other = (Stapler) obj;
        return this.pinCapacity == other.pinCapacity &&
                this.isHeavyDuty == other.isHeavyDuty &&
                (this.brand != null ? this.brand.equals(other.brand) : other.brand == null);
    }
}
