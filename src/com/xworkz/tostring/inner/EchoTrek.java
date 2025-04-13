package com.xworkz.tostring.inner;

public class EchoTrek {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public EchoTrek(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "EchoTrek [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }

    @Override
    public int hashCode() {
        return 72;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof EchoTrek) {
                System.out.println("Ref is EchoTrek, it will compare...");
                EchoTrek other = (EchoTrek) obj;
                return this.propertyOne.equals(other.propertyOne) && this.propertyTwo == other.propertyTwo;
            }
        }
        return false;
    }
}
