package com.xworkz.tostring.inner;

public class Iron {
    private String brand;
    private int wattage;
    private boolean hasSteamFunction;

    public Iron(String brand, int wattage, boolean hasSteamFunction) {
        this.brand = brand;
        this.wattage = wattage;
        this.hasSteamFunction = hasSteamFunction;
    }

    @Override
    public String toString() {
        return "Iron [brand=" + brand + ", wattage=" + wattage + " W, hasSteamFunction=" + hasSteamFunction + "]";
    }

    @Override
    public int hashCode() {
        return 124;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Iron iron = (Iron) obj;
        return wattage == iron.wattage && hasSteamFunction == iron.hasSteamFunction && brand.equals(iron.brand);
    }
}
