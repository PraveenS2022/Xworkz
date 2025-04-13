package com.xworkz.tostring.inner;

public class Towel {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public Towel(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Towel [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }

    @Override
    public int hashCode() {
        return 345;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Towel towel = (Towel) obj;
        return propertyTwo == towel.propertyTwo &&
                propertyThree == towel.propertyThree &&
                propertyOne.equals(towel.propertyOne);
    }
}
