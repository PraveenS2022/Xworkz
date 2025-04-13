package com.xworkz.tostring.inner;

public class Smartwatch {
    private String model;
    private int batteryLife;
    private boolean fitnessTracking;

    public Smartwatch(String model, int batteryLife, boolean fitnessTracking) {
        this.model = model;
        this.batteryLife = batteryLife;
        this.fitnessTracking = fitnessTracking;
    }

    @Override
    public String toString() {
        return "Smartwatch [model=" + model + ", batteryLife=" + batteryLife + ", fitnessTracking=" + fitnessTracking + "]";
    }

    @Override
    public int hashCode() {
        return 11;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Smartwatch other = (Smartwatch) obj;
        return this.batteryLife == other.batteryLife &&
                this.fitnessTracking == other.fitnessTracking &&
                (this.model != null ? this.model.equals(other.model) : other.model == null);
    }

}
