package com.xworkz.tostring.inner;

public class SelfieStick {
    private String length;
    private int maxLoad;
    private boolean bluetoothEnabled;

    public SelfieStick(String length, int maxLoad, boolean bluetoothEnabled) {
        this.length = length;
        this.maxLoad = maxLoad;
        this.bluetoothEnabled = bluetoothEnabled;
    }

    @Override
    public String toString() {
        return "SelfieStick [length=" + length + ", maxLoad=" + maxLoad + ", bluetoothEnabled=" + bluetoothEnabled + "]";
    }

    @Override
    public int hashCode() {
        return 9;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        SelfieStick other = (SelfieStick) obj;
        return this.maxLoad == other.maxLoad &&
                this.bluetoothEnabled == other.bluetoothEnabled &&
                (this.length != null ? this.length.equals(other.length) : other.length == null);
    }
}
