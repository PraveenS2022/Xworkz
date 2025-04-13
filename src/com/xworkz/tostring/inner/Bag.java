package com.xworkz.tostring.inner;

public class Bag {
    private String type;
    private double price;
    private boolean color;

    public Bag(String type, double price, boolean color) {
        this.type = type;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bag [type=" + type + ", price=" + price + ", color=" + color + "]";
    }

    @Override
    public int hashCode() {
        return 1004;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Bag) {
                System.out.println("Ref is Bag, it will compare...");
                Bag other = (Bag) obj;
                return this.type.equals(other.type) && this.color==(other.color);
            }
        }
        return false;
    }
}


