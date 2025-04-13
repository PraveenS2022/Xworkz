package com.xworkz.tostring.inner;

public class Glasses {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public Glasses(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Glasses [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }

    @Override
    public int hashCode() {
        return 84;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Glasses) {
                System.out.println("Ref is Glasses, it will compare...");
                Glasses other = (Glasses) obj;
                return this.propertyOne.equals(other.propertyOne) && this.propertyTwo == other.propertyTwo;
            }
        }
        return false;
    }
}
