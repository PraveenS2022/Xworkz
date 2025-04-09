package com.xworkz.tostring.inner

public class Object32 {
    private String attr1;
    private int attr2;
    private boolean attr3;

    public Object32() {
        this.attr1 = "Val32";
        this.attr2 = 31;
        this.attr3 = false;
    }

    @Override
    public String toString() {
        return "Object32 [ attr1=" + attr1 + ", attr2=" + attr2 + ", attr3=" + attr3 + " ]";
    }
}
