package org.example.Task10;

public class Task10 implements ITask10 {
    private double height;
    private double width;

    public Task10(double height, double width) {
        setHeight(height);
        setWidth(width);
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Negative number!");
        }
        this.height = height;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Negative number!");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double calculateArea() {
        return height * width;
    }

    public double calculatePerimeter() {
        return 2 * (height + width);
    }
}
