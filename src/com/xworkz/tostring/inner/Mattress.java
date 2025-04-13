package com.xworkz.tostring.inner;

public class Mattress {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public Mattress(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Mattress [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }

    @Override
    public int hashCode() {
        return 190;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Mattress) {
                Mattress other = (Mattress) obj;
                return this.propertyOne.equals(other.propertyOne) &&
                        this.propertyTwo == other.propertyTwo &&
                        this.propertyThree == other.propertyThree;
            }
        }
        return false;
    }
}
