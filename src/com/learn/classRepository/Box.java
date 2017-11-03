package com.learn.classRepository;

/**
 * Created by Owner on 03.11.2017.
 */
public class Box {
    public double width;
    public double height;
    public double depth;

    public void volume() {
        System.out.println("Volume: " + width*height*depth);
    }
}
