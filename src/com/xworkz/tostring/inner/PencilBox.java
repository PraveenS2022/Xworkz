package com.xworkz.tostring.inner;

public class PencilBox {
    private String shape;
    private int capacity;
    private boolean magnetic;

    public PencilBox(String shape, int capacity, boolean magnetic) {
        this.shape = shape;
        this.capacity = capacity;
        this.magnetic = magnetic;
    }

    @Override
    public String toString() {
        return "PencilBox [shape=" + shape + ", capacity=" + capacity + ", magnetic=" + magnetic + "]";
    }

    @Override
    public int hashCode() {
        return 20;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        PencilBox other = (PencilBox) obj;
        return this.capacity == other.capacity &&
                this.magnetic == other.magnetic &&
                (this.shape != null ? this.shape.equals(other.shape) : other.shape == null);
    }

}
