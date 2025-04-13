package com.xworkz.tostring.inner;

public class LunchBox {
    private String color;
    private int containerCount;
    private boolean microwaveSafe;

    public LunchBox(String color, int containerCount, boolean microwaveSafe) {
        this.color = color;
        this.containerCount = containerCount;
        this.microwaveSafe = microwaveSafe;
    }

    @Override
    public String toString() {
        return "LunchBox [color=" + color + ", containerCount=" + containerCount + ", microwaveSafe=" + microwaveSafe + "]";
    }

    @Override
    public int hashCode() {
        return 900;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof LunchBox) {
                LunchBox other = (LunchBox) obj;
                return this.color.equals(other.color) &&
                        this.containerCount == other.containerCount &&
                        this.microwaveSafe == other.microwaveSafe;
            }
        }
        return false;
    }
}
