package com.pub.text.impl;

import com.pub.text.interfaces.ITextAlign;

public abstract class Align implements ITextAlign {
    private int width;
    private String text;
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
