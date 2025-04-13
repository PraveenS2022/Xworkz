package com.xworkz.tostring.inner;

public class Sunglasses {
    private String frameColor;
    private int uvProtection;
    private boolean polarized;

    public Sunglasses(String frameColor, int uvProtection, boolean polarized) {
        this.frameColor = frameColor;
        this.uvProtection = uvProtection;
        this.polarized = polarized;
    }

    @Override
    public String toString() {
        return "Sunglasses [frameColor=" + frameColor + ", uvProtection=" + uvProtection + ", polarized=" + polarized + "]";
    }

    @Override
    public int hashCode() {
        return 230;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Sunglasses that = (Sunglasses) obj;
        return uvProtection == that.uvProtection &&
                polarized == that.polarized &&
                frameColor.equals(that.frameColor);
    }

}
