package com.xworkz.tostring.inner;

public class AlarmClock {
    private String brand;
    private int volume;
    private boolean hasSnooze;

    public AlarmClock(String brand, int volume, boolean hasSnooze) {
        this.brand = brand;
        this.volume = volume;
        this.hasSnooze = hasSnooze;
    }

    @Override
    public String toString() {
        return "AlarmClock [brand=" + brand + ", volume=" + volume + ", hasSnooze=" + hasSnooze + "]";
    }

    @Override
    public int hashCode() {
        return 111;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AlarmClock alarmClock = (AlarmClock) obj;
        return volume == alarmClock.volume && hasSnooze == alarmClock.hasSnooze && brand.equals(alarmClock.brand);
    }
}
