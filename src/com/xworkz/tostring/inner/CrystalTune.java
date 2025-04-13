package com.xworkz.tostring.inner;

public class CrystalTune {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public CrystalTune(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "CrystalTune [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }

    @Override
    public int hashCode() {
        return 64;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof CrystalTune) {
                System.out.println("Ref is CrystalTune, it will compare...");
                CrystalTune other = (CrystalTune) obj;
                return this.propertyOne.equals(other.propertyOne) && this.propertyTwo == other.propertyTwo;
            }
        }
        return false;
    }
}
