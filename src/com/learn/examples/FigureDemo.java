package com.learn.examples;

import com.learn.classRepository.Figure;
import com.learn.classRepository.Rectangle;
import com.learn.classRepository.Triangle;

/**
 * Created by Owner on 20.11.2017.
 */
public class FigureDemo {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);

        Figure figuref;


        figuref = r;
        System.out.println("Square is: "+figuref.area());
        figuref = t;
        System.out.println("Square is: "+figuref.area());
    }
}
