package com.xworkz.tostring.inner;

public class NeonBlaster {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public NeonBlaster(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "NeonBlaster [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }

    @Override
    public int hashCode() {
        return 390;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        NeonBlaster other = (NeonBlaster) obj;
        return this.propertyTwo == other.propertyTwo &&
                this.propertyThree == other.propertyThree &&
                (this.propertyOne != null ? this.propertyOne.equals(other.propertyOne) : other.propertyOne == null);
    }
}
