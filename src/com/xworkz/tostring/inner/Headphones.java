package com.xworkz.tostring.inner;

public class Headphones {
    private String model;
    private int impedance;
    private boolean wireless;

    public Headphones(String model, int impedance, boolean wireless) {
        this.model = model;
        this.impedance = impedance;
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "Headphones [model=" + model + ", impedance=" + impedance + ", wireless=" + wireless + "]";
    }

    @Override
    public int hashCode() {
        return 89;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Headphones) {
                System.out.println("Ref is Headphones, it will compare...");
                Headphones other = (Headphones) obj;
                return this.model.equals(other.model) && this.impedance == other.impedance;
            }
        }
        return false;
    }
}
