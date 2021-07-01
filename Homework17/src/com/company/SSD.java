package com.company;

public class SSD {
    private String memorySize;
    private String HowManyDisksAreDivided;

    public SSD() {
    }

    public SSD(String memorySize, String howManyDisksAreDivided) {
        this.memorySize = memorySize;
        HowManyDisksAreDivided = howManyDisksAreDivided;
    }

    public String getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(String memorySize) {
        this.memorySize = memorySize;
    }

    public String getHowManyDisksAreDivided() {
        return HowManyDisksAreDivided;
    }

    public void setHowManyDisksAreDivided(String howManyDisksAreDivided) {
        HowManyDisksAreDivided = howManyDisksAreDivided;
    }
}
