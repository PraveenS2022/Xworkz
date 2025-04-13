package com.xworkz.tostring.inner;

public class Gamepad {
    private String color;
    private int buttons;
    private boolean wireless;

    public Gamepad(String color, int buttons, boolean wireless) {
        this.color = color;
        this.buttons = buttons;
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "Gamepad [color=" + color + ", buttons=" + buttons + ", wireless=" + wireless + "]";
    }

    @Override
    public int hashCode() {
        return 83;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Gamepad) {
                System.out.println("Ref is Gamepad, it will compare...");
                Gamepad other = (Gamepad) obj;
                return this.color.equals(other.color) && this.buttons == other.buttons;
            }
        }
        return false;
    }

}
