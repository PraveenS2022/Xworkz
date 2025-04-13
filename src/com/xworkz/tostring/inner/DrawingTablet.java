package com.xworkz.tostring.inner;

public class DrawingTablet {
    private String model;
    private int pressureLevels;
    private boolean wireless;

    public DrawingTablet(String model, int pressureLevels, boolean wireless) {
        this.model = model;
        this.pressureLevels = pressureLevels;
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "DrawingTablet [model=" + model + ", pressureLevels=" + pressureLevels + ", wireless=" + wireless + "]";
    }

    @Override
    public int hashCode() {
        return 69;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof DrawingTablet) {
                System.out.println("Ref is DrawingTablet, it will compare...");
                DrawingTablet other = (DrawingTablet) obj;
                return this.model.equals(other.model) && this.pressureLevels == other.pressureLevels;
            }
        }
        return false;
    }
}
