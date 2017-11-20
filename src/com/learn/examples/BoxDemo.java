package com.learn.examples;

import com.learn.classRepository.Box;

/**
 * Created by Owner on 20.11.2017.
 */
public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox2 = new Box();
        double vol;

        myBox.setDimension(10, 20, 15);
        myBox2.setDimension(5, 10, 7);

        System.out.println("Volume 1: " + myBox.volume());
        System.out.println("Volume 2: " + myBox2.volume());

        Box myBox3 = new Box(5, 5, 5);
        System.out.println("Volume 3: " + myBox3.volume());
    }
}
