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

    public void setDimension(int pWidth, int pHeight, int pDepth) {
        width = pWidth;
        height = pHeight;
        depth = pDepth;
    }
}
