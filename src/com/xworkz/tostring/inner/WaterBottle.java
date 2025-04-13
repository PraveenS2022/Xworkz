package com.xworkz.tostring.inner;

public class WaterBottle {
    private String material;
    private int volume;
    private boolean insulated;

    public WaterBottle(String material, int volume, boolean insulated) {
        this.material = material;
        this.volume = volume;
        this.insulated = insulated;
    }

    @Override
    public String toString() {
        return "WaterBottle [material=" + material + ", volume=" + volume + "L, insulated=" + insulated + "]";
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
        WaterBottle that = (WaterBottle) obj;
        return volume == that.volume &&
                insulated == that.insulated &&
                material.equals(that.material);
    }

}
