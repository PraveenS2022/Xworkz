package com.xworkz.tostring.inner;

public class Object11 {
    private String attr1;
    private int attr2;
    private boolean attr3;

    public Object11() {
        this.attr1 = "Val11";
        this.attr2 = 10;
        this.attr3 = false;
    }

    @Override
    public String toString() {
        return "Object11 [ attr1=" + attr1 + ", attr2=" + attr2 + ", attr3=" + attr3 + " ]";
    }
}
