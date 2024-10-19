package org.example.Task24;

public class Task24 implements ITask24 {
    protected int left, top, right, bottom;
    protected String color;

    public Task24(int left, int top, int right, int bottom, String color) {
        this.setCoordinates(left, top, right, bottom);
        this.color = color;
    }

    public void setCoordinates(int left, int top, int right, int bottom) {
        if (left >= right || top >= bottom) {
            throw new IllegalArgumentException("Illegal coordinates");
        }
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public int[] getCoordinates() {
        return new int[] {left, top, right, bottom};
    }

    public String getDescription() {
        return String.format("%d, %d, %d, %d, %s", left, top, right, bottom, color);
    }
}
