package com.xworkz.tostring.inner;

public class GraphicsCard {
    private String brand;
    private int memorySize;
    private boolean supportsRayTracing;

    public GraphicsCard(String brand, int memorySize, boolean supportsRayTracing) {
        this.brand = brand;
        this.memorySize = memorySize;
        this.supportsRayTracing = supportsRayTracing;
    }

    @Override
    public String toString() {
        return "GraphicsCard [brand=" + brand + ", memorySize=" + memorySize + ", supportsRayTracing=" + supportsRayTracing + "]";
    }

    @Override
    public int hashCode() {
        return 86;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof GraphicsCard) {
                System.out.println("Ref is GraphicsCard, it will compare...");
                GraphicsCard other = (GraphicsCard) obj;
                return this.brand.equals(other.brand) && this.memorySize == other.memorySize;
            }
        }
        return false;
    }
}
