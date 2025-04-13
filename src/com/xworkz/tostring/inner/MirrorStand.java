package com.xworkz.tostring.inner;

public class MirrorStand {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public MirrorStand(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "MirrorStand [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }

    @Override
    public int hashCode() {
        return 990;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof MirrorStand) {
                MirrorStand other = (MirrorStand) obj;
                return this.propertyOne.equals(other.propertyOne) &&
                        this.propertyTwo == other.propertyTwo &&
                        this.propertyThree == other.propertyThree;
            }
        }
        return false;
    }
}
