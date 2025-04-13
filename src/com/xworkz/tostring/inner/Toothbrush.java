package com.xworkz.tostring.inner;

public class Toothbrush {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public Toothbrush(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Toothbrush [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }

    @Override
    public int hashCode() {
        return 654;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Toothbrush toothbrush = (Toothbrush) obj;
        return propertyTwo == toothbrush.propertyTwo &&
                propertyThree == toothbrush.propertyThree &&
                propertyOne.equals(toothbrush.propertyOne);
    }
}
