package com.xworkz.tostring.inner;

public class Fridge {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public Fridge(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Fridge [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }

    @Override
    public int hashCode() {
        return 81;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Fridge) {
                System.out.println("Ref is Fridge, it will compare...");
                Fridge other = (Fridge) obj;
                return this.propertyOne.equals(other.propertyOne) && this.propertyTwo == other.propertyTwo;
            }
        }
        return false;
    }

}
