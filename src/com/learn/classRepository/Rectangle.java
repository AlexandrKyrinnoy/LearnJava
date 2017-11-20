package com.learn.classRepository;

/**
 * Created by Owner on 20.11.2017.
 */
public class Rectangle extends Figure {
    public Rectangle(double a, double b) {
        super(a, b);
    }

    public double area() {
        System.out.println("With Rectangle");
        return dim1 * dim2;
    }
}
