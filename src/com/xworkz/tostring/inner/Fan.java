package com.xworkz.tostring.inner;

public class Fan {
    private String brand;
    private int speedLevels;
    private boolean isCeilingFan;

    public Fan(String brand, int speedLevels, boolean isCeilingFan) {
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.isCeilingFan = isCeilingFan;
    }

    @Override
    public String toString() {
        return "Fan [brand=" + brand + ", speedLevels=" + speedLevels + ", isCeilingFan=" + isCeilingFan + "]";
    }

    @Override
    public int hashCode() {
        return 77;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Fan) {
                System.out.println("Ref is Fan, it will compare...");
                Fan other = (Fan) obj;
                return this.brand.equals(other.brand) && this.speedLevels == other.speedLevels;
            }
        }
        return false;
    }
    }


