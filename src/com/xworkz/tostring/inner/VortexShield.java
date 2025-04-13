package com.xworkz.tostring.inner;

public class VortexShield {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public VortexShield(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "VortexShield [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }

    @Override
    public int hashCode() {
        return 2345;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VortexShield that = (VortexShield) obj;
        return propertyTwo == that.propertyTwo &&
                propertyThree == that.propertyThree &&
                propertyOne.equals(that.propertyOne);
    }
    }

