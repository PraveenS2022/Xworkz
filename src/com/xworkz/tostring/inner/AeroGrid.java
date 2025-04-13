package com.xworkz.tostring.inner;

public class AeroGrid {
    private String cellCount;
    private int material;
    private boolean efficiency;

    public AeroGrid(String cellCount, int material, boolean efficiency) {
        this.cellCount = cellCount;
        this.material = material;
        this.efficiency = efficiency;
    }

    public AeroGrid() {

    }

    @Override
    public String toString() {
        return "AeroGrid [cellCount=" + cellCount + ", material=" + material + ", efficiency=" + efficiency + "]";
    }

    @Override
    public int hashCode() {
        return 1001;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof AeroGrid) {
                System.out.println("Ref is AeroGrid, it will compare...");
                AeroGrid other = (AeroGrid) obj;
                return this.cellCount == other.cellCount && this.material==(other.material);
            }
        }
        return false;
    }
}

