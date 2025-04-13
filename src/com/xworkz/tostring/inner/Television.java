package com.xworkz.tostring.inner;

public class Television {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public Television(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Television [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }

    @Override
    public int hashCode() {
        return 123;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Television television = (Television) obj;
        return propertyTwo == television.propertyTwo &&
                propertyThree == television.propertyThree &&
                propertyOne.equals(television.propertyOne);
    }

}
