package com.xworkz.tostring.inner;

public class Charger {
    private String type;
    private int outputVoltage;
    private boolean fastCharging;

    public Charger(String type, int outputVoltage, boolean fastCharging) {
        this.type = type;
        this.outputVoltage = outputVoltage;
        this.fastCharging = fastCharging;
    }

    @Override
    public String toString() {
        return "Charger [type=" + type + ", outputVoltage=" + outputVoltage + ", fastCharging=" + fastCharging + "]";
    }

    @Override
    public int hashCode() {
        return 103;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Charger charger = (Charger) obj;
        return outputVoltage == charger.outputVoltage && fastCharging == charger.fastCharging && type.equals(charger.type);
    }
}
