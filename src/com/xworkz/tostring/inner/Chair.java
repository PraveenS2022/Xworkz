package com.xworkz.tostring.inner;

public class Chair {
    private String material;
    private double legs;
    private boolean hasCushion;

    public Chair(String material, double legs, boolean hasCushion) {
        this.material = material;
        this.legs = legs;
        this.hasCushion = hasCushion;
    }

    @Override
    public String toString() {
        return "Chair [material=" + material + ", legs=" + legs + ", hasCushion=" + hasCushion + "]";
    }

    @Override
    public int hashCode() {
        return 6;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Chair) {
                System.out.println("Ref is Chair, it will compare...");
                Chair other = (Chair) obj;
                return this.material.equals(other.material) && this.legs == other.legs;
            }
        }
        return false;
    }
}
