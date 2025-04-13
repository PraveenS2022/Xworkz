package com.xworkz.tostring.inner;

public class Keychain {
    private String material;
    private int keysHeld;
    private boolean hasLight;

    public Keychain(String material, int keysHeld, boolean hasLight) {
        this.material = material;
        this.keysHeld = keysHeld;
        this.hasLight = hasLight;
    }

    @Override
    public String toString() {
        return "Keychain [material=" + material + ", keysHeld=" + keysHeld + ", hasLight=" + hasLight + "]";
    }

    @Override
    public int hashCode() {
        return 92;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Keychain) {
                System.out.println("Ref is Keychain, comparing...");
                Keychain other = (Keychain) obj;
                return this.material.equals(other.material) &&
                        this.keysHeld == other.keysHeld &&
                        this.hasLight == other.hasLight;
            }
        }
        return false;
    }
}