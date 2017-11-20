package com.learn.classRepository;

/**
 * Created by Owner on 20.11.2017.
 */
public class Triangle extends Figure{
    public Triangle(double a, double b){
        super(a, b);
    }

    public double area(){
        System.out.println("With Triangle");
        return dim1 * dim2 / 2;
    }
}
