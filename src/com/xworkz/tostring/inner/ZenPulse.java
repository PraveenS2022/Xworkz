package com.xworkz.tostring.inner;

public class ZenPulse {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public ZenPulse(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "ZenPulse [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }

    @Override
    public int hashCode() {
        return 9430;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ZenPulse zenPulse = (ZenPulse) obj;
        return propertyTwo == zenPulse.propertyTwo &&
                propertyThree == zenPulse.propertyThree &&
                propertyOne.equals(zenPulse.propertyOne);
    }
}
