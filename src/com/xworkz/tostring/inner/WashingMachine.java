package com.xworkz.tostring.inner;

public class WashingMachine {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public WashingMachine(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "WashingMachine [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }

    @Override
    public int hashCode() {
        return 678;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WashingMachine that = (WashingMachine) obj;
        return propertyTwo == that.propertyTwo &&
                propertyThree == that.propertyThree &&
                propertyOne.equals(that.propertyOne);
    }

}
