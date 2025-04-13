package com.xworkz.tostring.inner;

public class AstroScope {
    private String type;
    private double magnification;
    private boolean manufacturer;

    public AstroScope(String type, double magnification, boolean manufacturer) {
        this.type = type;
        this.magnification = magnification;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "AstroScope [type=" + type + ", magnification=" + magnification + ", manufacturer=" + manufacturer + "]";
    }

    @Override
    public int hashCode() {
        return 1002;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof AstroScope) {
                System.out.println("Ref is AstroScope, it will compare...");
                AstroScope other = (AstroScope) obj;
                return this.type.equals(other.type) && this.manufacturer;
            }
        }
        return false;
    }
}
