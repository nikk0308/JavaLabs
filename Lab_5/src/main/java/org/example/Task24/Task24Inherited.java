package org.example.Task24;

public class Task24Inherited extends Task24 {
    private String text;
    private String textColor;

    public Task24Inherited(int left, int top, int right, int bottom, String color, String text, String textColor) {
        super(left, top, right, bottom, color);
        this.text = text;
        this.textColor = textColor;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public String getTextColor() {
        return this.textColor;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + String.format(", %s, %s", text, textColor);
    }
}
