package com.xworkz.tostring.inner;

public class Screwdriver {
    private String headType;
    private int length;
    private boolean insulatedHandle;

    public Screwdriver(String headType, int length, boolean insulatedHandle) {
        this.headType = headType;
        this.length = length;
        this.insulatedHandle = insulatedHandle;
    }

    @Override
    public String toString() {
        return "Screwdriver [headType=" + headType + ", length=" + length + ", insulatedHandle=" + insulatedHandle + "]";
    }

    @Override
    public int hashCode() {
        return 9;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Screwdriver other = (Screwdriver) obj;
        return this.length == other.length &&
                this.insulatedHandle == other.insulatedHandle &&
                (this.headType != null ? this.headType.equals(other.headType) : other.headType == null);
    }

}
