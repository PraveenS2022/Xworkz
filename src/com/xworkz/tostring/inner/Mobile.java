package com.xworkz.tostring.inner;

public class Mobile {
    private String brand;
    private int storage;
    private boolean is5G;

    public Mobile(String brand, int storage, boolean is5G) {
        this.brand = brand;
        this.storage = storage;
        this.is5G = is5G;
    }

    @Override
    public String toString() {
        return "Mobile [brand=" + brand + ", storage=" + storage + "GB, is5G=" + is5G + "]";
    }

    @Override
    public int hashCode() {
        return 290;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Mobile other = (Mobile) obj;
        return this.storage == other.storage &&
                this.is5G == other.is5G &&
                (this.brand != null ? this.brand.equals(other.brand) : other.brand == null);
    }

}
