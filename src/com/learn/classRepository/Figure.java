package com.learn.classRepository;

/**
 * Created by Owner on 20.11.2017.
 */
public class Figure {
    double dim1;
    double dim2;

    public Figure(double pDim1, double pDim2) {
        dim1 = pDim1;
        dim2 = pDim2;
    }

    public double area(){
        System.out.println("The area of the figure is not defined!");
        return 0;
    }
}

