package com.springapp.mvc.data;

import java.awt.*;

/**
 * Created by abhayphougat on 28/03/15.
 */
public class Variant {

    private Color color;

    private int size;

    private int code;

    @Override
    public String toString() {
        return "Variant{" +
                "color=" + color +
                ", size=" + size +
                ", code=" + code +
                '}';
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
