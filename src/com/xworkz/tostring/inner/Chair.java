package com.xworkz.tostring.inner;

public class Chair {
    private String material;
    private int legs;
    private boolean hasCushion;

    public Chair() {
        this.material = "Wood";
        this.legs = 4;
        this.hasCushion = true;
    }

    @Override
    public String toString() {
        return "Chair [ material=" + material + ", legs=" + legs + ", hasCushion=" + hasCushion + " ]";
    }
}
