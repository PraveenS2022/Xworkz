package com.xworkz.tostring.inner;

public class Bag {
    private String type;
    private int pockets;
    private boolean waterproof;

    public Bag() {
        this.type = "Backpack";
        this.pockets = 5;
        this.waterproof = true;
    }

    @Override
    public String toString() {
        return "Bag [ type=" + type + ", pockets=" + pockets + ", waterproof=" + waterproof + " ]";
    }
}
