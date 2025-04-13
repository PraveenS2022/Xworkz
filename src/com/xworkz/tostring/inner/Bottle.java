package com.xworkz.tostring.inner;

public class Bottle {
    private String color;
    private double capacity;
    private boolean isInsulated;

    public Bottle(String color, double capacity, boolean isInsulated) {
        this.color = color;
        this.capacity = capacity;
        this.isInsulated = isInsulated;
    }

    @Override
    public String toString() {
        return "Bottle [color=" + color + ", capacity=" + capacity + "L, isInsulated=" + isInsulated + "]";
    }

    @Override
    public int hashCode() {
        return 6;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Bottle) {
                System.out.println("Ref is Bottle, it will compare...");
                Bottle other = (Bottle) obj;
                return this.color.equals(other.color) && this.capacity == other.capacity;
            }
        }
        return false;
    }

}
