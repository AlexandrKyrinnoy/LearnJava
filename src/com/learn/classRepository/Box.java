package com.learn.classRepository;

/**
 * Created by Owner on 03.11.2017.
 */
public class Box {
    double width;
    double height;
    double depth;

    public double volume() {
        return width*height*depth;
    }

    public Box(double pWidth, double pHeight, double pDepth) {
        this.width = pWidth;
        this.height = pHeight;
        this.depth = pDepth;
    }

    public Box() {
        this.width = 1;
        this.height = 1;
        this.depth = 1;
    }

    public void setDimension(double pWidth, double pHeight, double pDepth) {
        this.width = pWidth;
        this.height = pHeight;
        this.depth = pDepth;
    }
}
