package org.example.Task34;

public class Task34 implements ITask34 {
    protected String name;
    protected double weight;
    protected double screenSize;
    protected int memorySize;
    protected boolean hasCamera;

    public Task34(String name, double weight, double screenSize, int memorySize, boolean hasCamera) {
        this.name = name;
        this.weight = weight;
        this.screenSize = screenSize;
        this.memorySize = memorySize;
        this.hasCamera = hasCamera;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Illegal weight");
        }
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setScreenSize(double screenSize) {
        if (screenSize <= 0) {
            throw new IllegalArgumentException("Illegal screen size");
        }
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return this.screenSize;
    }

    public void setMemorySize(int memorySize) {
        if (memorySize <= 0) {
            throw new IllegalArgumentException("Illegal memory size");
        }
        this.memorySize = memorySize;
    }

    public int getMemorySize() {
        return this.memorySize;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    public boolean hasCamera() {
        return this.hasCamera;
    }

    public String getDescription() {
        return name + ", " + weight + ", " + screenSize + ", " + memorySize + ", " + hasCamera;
    }
}
