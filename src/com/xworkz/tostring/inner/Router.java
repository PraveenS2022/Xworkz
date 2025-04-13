package com.xworkz.tostring.inner;

public class Router {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public Router(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Router [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }

    @Override
    public int hashCode() {
        return 14;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Router other = (Router) obj;
        return this.propertyTwo == other.propertyTwo &&
                this.propertyThree == other.propertyThree &&
                (this.propertyOne != null ? this.propertyOne.equals(other.propertyOne) : other.propertyOne == null);
    }
}
