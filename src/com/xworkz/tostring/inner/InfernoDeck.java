package com.xworkz.tostring.inner;

public class InfernoDeck {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public InfernoDeck(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "InfernoDeck [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }

    @Override
    public int hashCode() {
        return 91;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof InfernoDeck) {
                System.out.println("Ref is InfernoDeck, it will compare...");
                InfernoDeck other = (InfernoDeck) obj;
                return this.propertyOne.equals(other.propertyOne) && this.propertyTwo == other.propertyTwo;
            }
        }
        return false;
    }
}
