package com.xworkz.tostring.inner;

public class Backpack {
    private String brand;
    private int capacity;
    private boolean waterproof;

    public Backpack(String brand, int capacity, boolean waterproof) {
        this.brand = brand;
        this.capacity = capacity;
        this.waterproof = waterproof;
    }

    @Override
    public String toString() {
        return "Backpack [brand=" + brand + ", capacity=" + capacity + ", waterproof=" + waterproof + "]";
    }

    @Override
    public int hashCode() {
        return 1003;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Backpack) {
                System.out.println("Ref is Backpack, it will compare...");
                Backpack other = (Backpack) obj;
                return this.brand.equals(other.brand) && this.capacity == other.capacity;
            }
        }
        return false;
    }
}

