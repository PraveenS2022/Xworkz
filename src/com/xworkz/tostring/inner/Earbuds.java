package com.xworkz.tostring.inner;

public class Earbuds {
    private String color;
    private int batteryLife;
    private boolean noiseCancellation;

    public Earbuds(String color, int batteryLife, boolean noiseCancellation) {
        this.color = color;
        this.batteryLife = batteryLife;
        this.noiseCancellation = noiseCancellation;
    }

    @Override
    public String toString() {
        return "Earbuds [color=" + color + ", batteryLife=" + batteryLife + ", noiseCancellation=" + noiseCancellation + "]";
    }

    @Override
    public int hashCode() {
        return 71;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Earbuds) {
                System.out.println("Ref is Earbuds, it will compare...");
                Earbuds other = (Earbuds) obj;
                return this.color.equals(other.color) && this.batteryLife == other.batteryLife;
            }
        }
        return false;
    }

}
