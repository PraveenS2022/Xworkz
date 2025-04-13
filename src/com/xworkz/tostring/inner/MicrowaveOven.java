package com.xworkz.tostring.inner;

public class MicrowaveOven {
    private String brand;
    private int wattage;
    private boolean hasGrillFunction;

    public MicrowaveOven(String brand, int wattage, boolean hasGrillFunction) {
        this.brand = brand;
        this.wattage = wattage;
        this.hasGrillFunction = hasGrillFunction;
    }

    @Override
    public String toString() {
        return "MicrowaveOven [brand=" + brand + ", wattage=" + wattage + " W, hasGrillFunction=" + hasGrillFunction + "]";
    }

    @Override
    public int hashCode() {
        return 129;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MicrowaveOven microwaveOven = (MicrowaveOven) obj;
        return wattage == microwaveOven.wattage && hasGrillFunction == microwaveOven.hasGrillFunction && brand.equals(microwaveOven.brand);
    }
}
