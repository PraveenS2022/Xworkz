package com.xworkz.tostring.inner;

public class FlashDrive {
    private String brand;
    private int capacity;
    private boolean usb3;

    public FlashDrive(String brand, int capacity, boolean usb3) {
        this.brand = brand;
        this.capacity = capacity;
        this.usb3 = usb3;
    }

    @Override
    public String toString() {
        return "FlashDrive [brand=" + brand + ", capacity=" + capacity + ", usb3=" + usb3 + "]";
    }

    @Override
    public int hashCode() {
        return 80;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof FlashDrive) {
                System.out.println("Ref is FlashDrive, it will compare...");
                FlashDrive other = (FlashDrive) obj;
                return this.brand.equals(other.brand) && this.capacity == other.capacity;
            }
        }
        return false;
    }
}
