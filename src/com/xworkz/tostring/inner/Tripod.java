package com.xworkz.tostring.inner;

public class Tripod {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public Tripod(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Tripod [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }

    @Override
    public int hashCode() {
        return 3456;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Tripod tripod = (Tripod) obj;
        return propertyTwo == tripod.propertyTwo &&
                propertyThree == tripod.propertyThree &&
                propertyOne.equals(tripod.propertyOne);
    }

}
