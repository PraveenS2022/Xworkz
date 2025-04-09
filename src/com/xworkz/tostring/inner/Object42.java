package com.xworkz.tostring.inner

public class Object42 {
    private String attr1;
    private int attr2;
    private boolean attr3;

    public Object42() {
        this.attr1 = "Val42";
        this.attr2 = 41;
        this.attr3 = false;
    }

    @Override
    public String toString() {
        return "Object42 [ attr1=" + attr1 + ", attr2=" + attr2 + ", attr3=" + attr3 + " ]";
    }
}
