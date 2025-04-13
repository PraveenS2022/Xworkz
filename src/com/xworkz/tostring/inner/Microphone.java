package com.xworkz.tostring.inner;

public class Microphone {
    private String brand;
    private int sensitivity;
    private boolean noiseCancellation;

    public Microphone(String brand, int sensitivity, boolean noiseCancellation) {
        this.brand = brand;
        this.sensitivity = sensitivity;
        this.noiseCancellation = noiseCancellation;
    }

    @Override
    public String toString() {
        return "Microphone [brand=" + brand + ", sensitivity=" + sensitivity + ", noiseCancellation=" + noiseCancellation + "]";
    }

    @Override
    public int hashCode() {
        return 920;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Microphone) {
                Microphone other = (Microphone) obj;
                return this.brand.equals(other.brand) &&
                        this.sensitivity == other.sensitivity &&
                        this.noiseCancellation == other.noiseCancellation;
            }
        }
        return false;
    }

}
