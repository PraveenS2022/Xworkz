package com.xworkz.tostring.inner;

public class Blender {
    private String brand;
    private int power;
    private boolean hasPulseFunction;

    public Blender(String brand, int power, boolean hasPulseFunction) {
        this.brand = brand;
        this.power = power;
        this.hasPulseFunction = hasPulseFunction;
    }

    @Override
    public String toString() {
        return "Blender [brand=" + brand + ", power=" + power + " W, hasPulseFunction=" + hasPulseFunction + "]";
    }

    @Override
    public int hashCode() {
        return 115;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Blender blender = (Blender) obj;
        return power == blender.power && hasPulseFunction == blender.hasPulseFunction && brand.equals(blender.brand);
    }
}
