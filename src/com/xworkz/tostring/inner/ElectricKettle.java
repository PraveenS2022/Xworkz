package com.xworkz.tostring.inner;

public class ElectricKettle {
    private String brand;
    private int capacity;
    private boolean hasTemperatureControl;

    public ElectricKettle(String brand, int capacity, boolean hasTemperatureControl) {
        this.brand = brand;
        this.capacity = capacity;
        this.hasTemperatureControl = hasTemperatureControl;
    }

    @Override
    public String toString() {
        return "ElectricKettle [brand=" + brand + ", capacity=" + capacity + " L, hasTemperatureControl=" + hasTemperatureControl + "]";
    }

    @Override
    public int hashCode() {
        return 119;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ElectricKettle kettle = (ElectricKettle) obj;
        return capacity == kettle.capacity && hasTemperatureControl == kettle.hasTemperatureControl && brand.equals(kettle.brand);
    }
}
