package com.xworkz.tostring.inner;

public class MousePad {
    private String material;
    private int thickness;
    private boolean hasWristRest;

    public MousePad(String material, int thickness, boolean hasWristRest) {
        this.material = material;
        this.thickness = thickness;
        this.hasWristRest = hasWristRest;
    }

    @Override
    public String toString() {
        return "MousePad [material=" + material + ", thickness=" + thickness + ", hasWristRest=" + hasWristRest + "]";
    }

    @Override
    public int hashCode() {
        return 940;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        MousePad other = (MousePad) obj;
        return this.thickness == other.thickness &&
                this.hasWristRest == other.hasWristRest &&
                (this.material != null ? this.material.equals(other.material) : other.material == null);
    }

}
