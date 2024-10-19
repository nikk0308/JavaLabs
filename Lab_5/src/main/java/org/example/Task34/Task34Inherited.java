package org.example.Task34;

public class Task34Inherited extends Task34 {
    private double processorFrequency;
    private int coreCount;
    private int ramSize;

    public Task34Inherited(String name, double weight, double screenSize, int memorySize, boolean hasCamera,
                      double processorFrequency, int coreCount, int ramSize) {
        super(name, weight, screenSize, memorySize, hasCamera);
        this.processorFrequency = processorFrequency;
        this.coreCount = coreCount;
        this.ramSize = ramSize;
    }

    public void setProcessorFrequency(double processorFrequency) {
        if (processorFrequency <= 0) {
            throw new IllegalArgumentException("Illegal processor frequency");
        }
        this.processorFrequency = processorFrequency;
    }

    public double getProcessorFrequency() {
        return this.processorFrequency;
    }

    public void setCoreCount(int coreCount) {
        if (coreCount <= 0) {
            throw new IllegalArgumentException("Illegal core count");
        }
        this.coreCount = coreCount;
    }

    public int getCoreCount() {
        return this.coreCount;
    }

    public void setRamSize(int ramSize) {
        if (ramSize <= 0) {
            throw new IllegalArgumentException("Illegal ram size");
        }
        this.ramSize = ramSize;
    }

    public int getRamSize() {
        return this.ramSize;
    }

    public String getDescription() {
        return super.getDescription() + ", " + processorFrequency + ", " + coreCount + ", " + ramSize;
    }
}
