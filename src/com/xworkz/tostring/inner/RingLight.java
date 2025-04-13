package com.xworkz.tostring.inner;

public class RingLight {
    private String size;
    private int brightnessLevels;
    private boolean colorAdjustable;

    public RingLight(String size, int brightnessLevels, boolean colorAdjustable) {
        this.size = size;
        this.brightnessLevels = brightnessLevels;
        this.colorAdjustable = colorAdjustable;
    }

    @Override
    public String toString() {
        return "RingLight [size=" + size + ", brightnessLevels=" + brightnessLevels + ", colorAdjustable=" + colorAdjustable + "]";
    }

    @Override
    public int hashCode() {
        return 47;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        RingLight other = (RingLight) obj;
        return this.brightnessLevels == other.brightnessLevels &&
                this.colorAdjustable == other.colorAdjustable &&
                (this.size != null ? this.size.equals(other.size) : other.size == null);
    }

}
