package com.xworkz.tostring.inner;

public class GliderSync {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public GliderSync(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "GliderSync [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }

    @Override
    public int hashCode() {
        return 85;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof GliderSync) {
                System.out.println("Ref is GliderSync, it will compare...");
                GliderSync other = (GliderSync) obj;
                return this.propertyOne.equals(other.propertyOne) && this.propertyTwo == other.propertyTwo;
            }
        }
        return false;
    }
}
