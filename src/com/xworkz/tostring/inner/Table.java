package com.xworkz.tostring.inner

public class Table {
    private String shape;
    private int legs;
    private String color;

    public Table() {
        this.shape = "Rectangle";
        this.legs = 4;
        this.color = "Brown";
    }

    @Override
    public String toString() {
        return "Table [ shape=" + shape + ", legs=" + legs + ", color=" + color + " ]";
    }
}
