package com.xworkz.tostring.inner

public class Object64 {
    private String attr1;
    private int attr2;
    private boolean attr3;

    public Object64() {
        this.attr1 = "Val64";
        this.attr2 = 63;
        this.attr3 = false;
    }

    @Override
    public String toString() {
        return "Object64 [ attr1=" + attr1 + ", attr2=" + attr2 + ", attr3=" + attr3 + " ]";
    }
}
