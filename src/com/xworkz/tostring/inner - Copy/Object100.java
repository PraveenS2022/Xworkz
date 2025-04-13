package com.xworkz.tostring.inner

public class Object100 {
    private String attr1;
    private int attr2;
    private boolean attr3;

    public Object100() {
        this.attr1 = "Val100";
        this.attr2 = 99;
        this.attr3 = false;
    }

    @Override
    public String toString() {
        return "Object100 [ attr1=" + attr1 + ", attr2=" + attr2 + ", attr3=" + attr3 + " ]";
    }
}
