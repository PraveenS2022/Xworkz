package com.xworkz.tostring.inner;

public class Projector {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public Projector(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Projector [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }

    @Override
    public int hashCode() {
        return 22;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Projector other = (Projector) obj;
        return this.propertyTwo == other.propertyTwo &&
                this.propertyThree == other.propertyThree &&
                (this.propertyOne != null ? this.propertyOne.equals(other.propertyOne) : other.propertyOne == null);
    }
}
