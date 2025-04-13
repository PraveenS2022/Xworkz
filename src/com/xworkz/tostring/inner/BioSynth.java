package com.xworkz.tostring.inner;

public class BioSynth {
    private String compoundName;
    private int stabilityLevel;
    private boolean cost;

    public BioSynth(String compoundName, int stabilityLevel, boolean cost) {
        this.compoundName = compoundName;
        this.stabilityLevel = stabilityLevel;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "BioSynth [compoundName=" + compoundName + ", stabilityLevel=" + stabilityLevel + ", cost=" + cost + "]";
    }

    @Override
    public int hashCode() {
        return 1005;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof BioSynth) {
                System.out.println("Ref is BioSynth, it will compare...");
                BioSynth other = (BioSynth) obj;
                return this.compoundName.equals(other.compoundName) && this.stabilityLevel == other.stabilityLevel;
            }
        }
        return false;
    }
}
