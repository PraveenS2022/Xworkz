package com.xworkz.tostring.inner

public class Object99 {
    private String attr1;
    private int attr2;
    private boolean attr3;

    public Object99() {
        this.attr1 = "Val99";
        this.attr2 = 98;
        this.attr3 = false;
    }

    @Override
    public String toString() {
        return "Object99 [ attr1=" + attr1 + ", attr2=" + attr2 + ", attr3=" + attr3 + " ]";
    }
}
