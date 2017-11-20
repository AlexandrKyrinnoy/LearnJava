package com.learn.classRepository;

/**
 * Created by Owner on 20.11.2017.
 */
public abstract class Figure {
    double dim1;
    double dim2;

    public Figure(double pDim1, double pDim2) {
        dim1 = pDim1;
        dim2 = pDim2;
    }

    public abstract double area();
}

