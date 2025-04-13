package com.xworkz.tostring.inner;

public class CameraLens {
    private String brand;
    private int focalLength;
    private boolean isPrimeLens;

    public CameraLens(String brand, int focalLength, boolean isPrimeLens) {
        this.brand = brand;
        this.focalLength = focalLength;
        this.isPrimeLens = isPrimeLens;
    }

    @Override
    public String toString() {
        return "CameraLens [brand=" + brand + ", focalLength=" + focalLength + " mm, isPrimeLens=" + isPrimeLens + "]";
    }

    @Override
    public int hashCode() {
        return 117;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CameraLens lens = (CameraLens) obj;
        return focalLength == lens.focalLength && isPrimeLens == lens.isPrimeLens && brand.equals(lens.brand);
    }
}




