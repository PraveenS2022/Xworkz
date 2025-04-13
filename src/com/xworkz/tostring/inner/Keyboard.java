package com.xworkz.tostring.inner;

public class Keyboard {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public Keyboard(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Keyboard [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }

    @Override
    public int hashCode() {
        return 95;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Keyboard) {
                System.out.println("Ref is Keyboard, comparing...");
                Keyboard other = (Keyboard) obj;
                return this.propertyOne.equals(other.propertyOne) &&
                        this.propertyTwo == other.propertyTwo &&
                        this.propertyThree == other.propertyThree;
            }
        }
        return false;
    }
}
